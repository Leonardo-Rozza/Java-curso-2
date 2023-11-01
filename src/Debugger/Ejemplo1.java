package Debugger;

import javax.swing.*;

public class Ejemplo1 {
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int numAleatoreo[] = new int[elementos];

        for (int i = 0; i<numAleatoreo.length; i++){
            numAleatoreo[i] = (int) (Math.random()*100);
        }

        for (int elemt: numAleatoreo ) {
            System.out.println(elemt);
        }
    }
}
