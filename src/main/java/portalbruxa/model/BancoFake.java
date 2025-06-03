/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portalbruxa.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class BancoFake {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Artigo> artigos = new ArrayList<>();
    public static Usuario usuarioLogado = null;

    static {
        // Adiciona admin fixo
        usuarios.add(new Admin("admin", "123"));
    }
}
