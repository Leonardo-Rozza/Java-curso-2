package Ficheros_de_datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoLecturaFichero {
    public static void main(String[] args) {
        LeerFichero accesoExterno = new LeerFichero();
        accesoExterno.leeDatos();
    }
}

class LeerFichero{
    public void leeDatos(){
        try {
            FileReader entrada = new FileReader("/Users/leonardorozza/Desktop/streamNuevo.txt");
           // int caracter = entrada.read();
           // char letra = (char) caracter;
          BufferedReader buffer = new BufferedReader(entrada);
          String linea = "";
            while (linea != null){
              linea = buffer.readLine();
              if (linea!= null)System.out.println(linea);
            }

            entrada.close();

        } catch (IOException e) {
          System.out.println("No se encontro el fichero");
        }
    }

}

