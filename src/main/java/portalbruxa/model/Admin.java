/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portalbruxa.model;

/**
 *
 * @author Lucas
 */
public class Admin extends Usuario {
    public Admin(String username, String senha) {
        super(username, senha);
    }

    @Override
    public boolean isAdmin() {
        return true;
    }
}
