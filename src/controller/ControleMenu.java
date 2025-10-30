/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Usuario;
import view.Menu;

/**
 *
 * @author Escudeiro
 */
public class ControleMenu {
    private Menu tela4;
    private Usuario usuario;
    
    public ControleMenu(Menu tela4, Usuario usuario){
        this.tela4 = tela4;
        this.usuario = usuario;
    }
    
    public Usuario chamarAlteracao(){
        return usuario;
    }
    
    public Usuario chamarExclusao(){
        return usuario;
    }
}
