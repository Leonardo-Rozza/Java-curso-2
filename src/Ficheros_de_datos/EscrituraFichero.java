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
        String texto = "Aprendiendo a usar streams de datos, nose para que pero bue! jaja";
        try {
            FileWriter escribir = new FileWriter("/Users/leonardorozza/Desktop/streamNuevo.txt", true);
            for (int i = 0; i < texto.length(); i++){
                escribir.write(texto.charAt(i));
            }
            escribir.close();
        } catch (IOException e){
          System.out.println("No se pudo agregar el archivo");
        }

    }
}
