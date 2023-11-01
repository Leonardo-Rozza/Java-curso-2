package Ficheros_de_datos;

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
            FileReader entrada = new FileReader("C:\\Users\\Leo\\Desktop\\PrimerFichero.txt");

            int caracter = entrada.read();
            char l = (char) caracter;
            while (caracter != -1){
                System.out.print(l);
                caracter = entrada.read();
                l = (char) caracter;
            }

            entrada.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

