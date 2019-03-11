/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author luigivis
 */
public class Login {
    private int idUsuarios;
    private String nameUsuarios;
    private String passwordUsuarios;

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNameUsuarios() {
        return nameUsuarios;
    }

    public void setNameUsuarios(String nameUsuarios) {
        this.nameUsuarios = nameUsuarios;
    }

    public String getPasswordUsuarios() {
        return passwordUsuarios;
    }

    public void setPasswordUsuarios(String passwordUsuarios) {
        this.passwordUsuarios = passwordUsuarios;
    }
}
