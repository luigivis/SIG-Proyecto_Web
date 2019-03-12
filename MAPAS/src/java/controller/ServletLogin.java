/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ServiceLoginImplementation;
import dto.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.DbConnection;

/**
 *
 * @author Semantic UI
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/login"})
public class ServletLogin extends HttpServlet {

    String message = null;
    private final DbConnection db;

    public ServletLogin() {
        this.db = new DbConnection();
    }

    Login login = new Login();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String location = request.getParameter("Location");

        HttpSession VariableHttpSessionlogin = request.getSession();
        //si el formulario falla
        if (username.isEmpty() || password.isEmpty() || location.isEmpty()) {
            request.setAttribute("error", "<div class=\"ui negative message\">\n" +
"                        <label class=\"header\">\n" +
"                            Error contrasena, usuario o ubicacion no pueden estar vacias" +
"                        </label>\n" +
"                    </div>");
            RequestDispatcher rs = request.getRequestDispatcher("/login.jsp");
            rs.forward(request, response);
        } else {
            ServiceLoginImplementation loginDaoImpl = new ServiceLoginImplementation();

            boolean res = false;
            try {

                res = loginDaoImpl.authenticate(username, password);

                if (res) {
                    //
                    VariableHttpSessionlogin.setAttribute("username", username);
                    VariableHttpSessionlogin.setAttribute("password", password);
                    VariableHttpSessionlogin.setAttribute("Location", location);
                    login.setPassword(password);
                    login.setUsername(username);
                    obtenerDatos();
                    VariableHttpSessionlogin.setAttribute("id_usuarios", login.getId());
                    System.out.println("Coordenadas "+ location);
                    System.out.println("Login correcto");
                    response.sendRedirect("index.jsp");
                } else {
                    request.setAttribute("error", "<div class=\"ui negative message\">\n" +
"                        <label class=\"header\">\n" +
"                            Error contrasena o usuario incorrecta" +
"                        </label>\n" +
"                    </div>");
                    System.out.println("Login incorrecto");
                    RequestDispatcher rs = request.getRequestDispatcher("/login.jsp");
                    rs.forward(request, response);
                }
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                request.setAttribute("error", "<div class=\"ui negative message\">\n" +
"                        <label class=\"header\">\n" +
"                            "+ex +
"                        </label>\n" +
"                    </div>");
                RequestDispatcher rs = request.getRequestDispatcher("/login.jsp");
                rs.forward(request, response);
            }
        }
    }

    public void obtenerDatos() {
        try {
            Connection connection = db.getConnection();
            String sql = "select idUsuarios from Usuarios where nameUsuarios= '" + login.getUsername() + "' and passwordUsuarios= '" + login.getPassword() + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            System.out.println("en ObtenerID");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.err.println(rs.getInt(1));
                login.setId(rs.getInt(1));
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
