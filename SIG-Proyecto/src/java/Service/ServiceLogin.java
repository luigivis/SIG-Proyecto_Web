package Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luigivis
 */
public interface ServiceLogin {
    public boolean authenticate(String username, String password) throws Exception;
    
    public String getMessage();
}
