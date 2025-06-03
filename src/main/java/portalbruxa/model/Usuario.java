/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portalbruxa.model;

/**
 *
 * @author Lucas
 */
public class Usuario {
    protected String username;
    protected String senha;

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdmin() {
        return false;
    }
}
