/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;
import jdbc.DbConnection;
import service.ServiceLogin;

/**
 *
 * @author Semantic UI
 */
public class ServiceLoginImplementation implements ServiceLogin {

    private String message;
    private final DbConnection db;

    public ServiceLoginImplementation() {
        this.db = new DbConnection();
    }

    @Override
    public boolean authenticate(String username, String password) throws Exception {
        Login login = new Login();
        String sql = "select idUsuarios from Usuarios where nameUsuarios= ? and passwordUsuarios= ?";
        Connection connection = db.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs =ps.executeQuery();
        return rs.next();
        
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
