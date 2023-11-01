package Ficheros_de_datos;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {
    public static void main(String[] args) {
        Escritura escribirFichero = new Escritura();
        escribirFichero.escrituraFichero();
    }
}

class Escritura{
    public void escrituraFichero(){
        String texto = "Este texto es agregado desde la funcion booleana append!";
        try {
            FileWriter escribir = new FileWriter("C:\\Users\\Leo\\Desktop\\DesdeJava.txt", true);
            for (int i = 0; i < texto.length(); i++){
                escribir.write(texto.charAt(i));
            }
            escribir.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
