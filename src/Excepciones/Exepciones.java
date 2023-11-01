package Excepciones;

import javax.swing.*;

public class Exepciones {
    public static void main(String[] args) {


        int numero = -1;

        while (numero != 0){
            try{
                 numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

                 if (numero!= 0) {
                     if (numero % 2 == 0) {
                         JOptionPane.showMessageDialog(null, numero + " es un número Par");
                     } else {
                         JOptionPane.showMessageDialog(null, numero + " es un número Impar");
                     }
                 }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, ingrese un número válido");
            }
        }
    }

}
