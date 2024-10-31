package ProgramacionGenerica;

import javax.swing.*;
import java.util.ArrayList;

public class EjercicioArrayList {
    /*
    En este ejercicio se trata de crear una aplicación que pida introducir números enteros por consola y que los vaya almacenando en un ArrayList. Cuando se introduce el número 0, el programa deja de pedir números e imprime en consola 3 cálculos:

    La suma de los números introducidos
    La media de los números introducidos
    Cuántos números se han introducido que son superiores a la media.
    */

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        int numero = 1;
        int suma = 0;
        double media = 0;
        int numSupMedia = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: \n Ingrese 0 para salir."));
            listaNumeros.add(numero);
        }

        for (int sum : listaNumeros) {
            suma += sum;
        }

        media = (double) suma / listaNumeros.size();


        if (numero > media) numSupMedia++;


        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("La media de los números introducidos es: " + media);
        System.out.println("Los números introducidos superiores a la media son " + numSupMedia);

    }
}




/*
 ArrayList<Integer> numbers = new ArrayList<>();
        int numero = -1;
        while (numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero\n Ingrese 0 para salir."));
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
 */