/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecontolador;

/**
 *
 * @author ADMIN
 */
public class InterfaceContolador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ControleRemoto c = new ControleRemoto();
      c.desligar();
      c.play();
      c.ligarMudo();
      c.abrirMenu();
      c.fecharMenu();
      
    }
    
}
