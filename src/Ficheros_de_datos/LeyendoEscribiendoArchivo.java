package Ficheros_de_datos;

import java.io.FileInputStream;
import java.io.IOException;

public class LeyendoEscribiendoArchivo {
  public static void main(String[] args) {
    try {
      FileInputStream lecturaArchivo = new FileInputStream("/Users/leonardorozza/Desktop/Externo/Lucy.JPG");
      boolean finalArchivo = false;

      while (!finalArchivo) {
        int byteImagenEntrada = lecturaArchivo.read();
        if (byteImagenEntrada == -1) finalArchivo = true;
        System.out.print(byteImagenEntrada);
      }

      lecturaArchivo.close();
    } catch (IOException e) {
      System.out.println("No se pudo acceder al archivo");
    }

  }
}
