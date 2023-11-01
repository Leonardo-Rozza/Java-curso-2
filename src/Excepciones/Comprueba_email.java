package Excepciones;

import javax.swing.*;

public class Comprueba_email {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Ingrese su email");
        try {
            compureba_email(email);
        } catch (ErrorLongitudMail e) {
            System.out.println("El mail es demasiado corto");
        }

    }

    static void compureba_email(String email) throws ErrorLongitudMail{
        boolean punto = false;
        int arroba = 0;

        if (email.length() <= 3){
            throw new ErrorLongitudMail("Mail con 3 o menos caracteres");
        }

        for (int i = 0; i <email.length(); i++){
            if (email.charAt(i) == '@')arroba ++;
            if (email.charAt(i) == '.') punto = true;
        }

        if (arroba == 1 && punto) {
                System.out.println("El mail es correcto");
        }else {
            System.out.println("El mail es incorrecto");
        }
    }
}


class ErrorLongitudMail extends Exception{
    public ErrorLongitudMail(){}
    public ErrorLongitudMail(String mensajeError){
        super(mensajeError);
    }
}
