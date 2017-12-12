/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC6-USER
 */
public class ControlFlujo {

    public static void flujoSwitch() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"));
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "caso 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "caso2");
                break;
            default:
                JOptionPane.showMessageDialog(null, "caso default");
                break;
        }
    }

    public static void condicionalDoWhile() {
        int x;
        do {
            flujoSwitch();
            x = JOptionPane.showConfirmDialog(null, "desea continuar");
            
        } while (x!=1);

    }
    public static void iteracionFor() {
        for(int i=0; i<5; i++){
            System.out.println("valor de i:" +1);
            if(i==2 || i==4){
                continue;
            }
            System.out.println("paso i" +i);
        }
        
    }

}
