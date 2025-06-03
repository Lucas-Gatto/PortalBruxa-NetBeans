package com.mycompany.portalbruxa;


import portalbruxa.view.TelaLogin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Lucas
 */
public class PortalBruxa {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}
