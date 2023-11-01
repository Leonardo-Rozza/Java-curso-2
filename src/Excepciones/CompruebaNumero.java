package Excepciones;

import javax.swing.*;

public class CompruebaNumero {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 100"));
        try {
            examinaNumero(numero);
        } catch (ErrorCompruebaNumero e) {
            e.printStackTrace();
            //Averiguamos el tipo de Exepción que se esta lanzado.
            System.out.println("Se ha lanzado una exepcion de tipo " + e.getClass().getName());

        }
    }

    static void examinaNumero(int numero) throws ErrorCompruebaNumero{

        if (numero >= 1 && numero <= 100){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es válido");
        } else {
           throw new ErrorCompruebaNumero("El número " + numero + " no es válido");
        }
    }
}

class ErrorCompruebaNumero extends Exception{
    public ErrorCompruebaNumero(){}
    public ErrorCompruebaNumero(String mensaje){
        super(mensaje);
    }
}
