/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ForEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicio = 0;
        int inicio1 = 1;
        int t2;
        String texto = JOptionPane.showInputDialog("Cuantos numeros de fibonacci quiere mostrar?");
        int compara = Integer.parseInt(texto);
        for (int a = 1; a <= compara; a++) {
            t2 = inicio;
            inicio = inicio1 + inicio;
            inicio1 = t2;
            System.out.print(" ."+t2+". ");
        }
    }

}
