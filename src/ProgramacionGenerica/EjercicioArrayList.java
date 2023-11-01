package ProgramacionGenerica;

import javax.swing.*;
import java.util.ArrayList;

public class EjercicioArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int numero = -1;
        while (numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
            numbers.add(numero);
        }
        if (!numbers.isEmpty()){
            int suma = 0;
            for (int sum: numbers) {
                suma += sum;
            }

            double media = (double) suma / numbers.size();

            int numMayoresAlaMedia = 0;

            for (int num: numbers) {
                if (num > media) numMayoresAlaMedia++;
            }
            System.out.println("La suma de los valores introducidos es de " + suma);
            System.out.println("La media de los valores introducidos es de " + media);
            System.out.println("La cantidad de los valores introducidos mayores a la media son " + numMayoresAlaMedia);
        } else {
            System.out.println("No se introdujeron numeros");
        }
    }
}
