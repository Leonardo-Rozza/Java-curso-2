package Ficheros_de_datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeyendoEscribiendoArchivo {
  public static void main(String[] args) {
    int contador = 0;
    int byteImagen[] = new int[1446156];
    try {
      FileInputStream lecturaArchivo = new FileInputStream("C:/Users/Leo/Desktop/Externo/rataDurmiendo.jpeg");
      boolean finalArchivo = false;

      while (!finalArchivo) {
        int byteImagenEntrada = lecturaArchivo.read();
        if (byteImagenEntrada != -1) byteImagen[contador] = byteImagenEntrada;
        else finalArchivo = true;
        contador ++;
      }
      lecturaArchivo.close();
    } catch (IOException e) {
      System.out.println("No se pudo acceder al archivo");
    }

    crearFichero(byteImagen);
  }

  static void crearFichero(int arrExterno[]){
      try {
          FileOutputStream crearImg = new FileOutputStream("C:/Users/Leo/Desktop/Externo/Copy/rataDurmiendoCopiada.jpeg");

          for (int j : arrExterno) {
              crearImg.write(j);
          }
          crearImg.close();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

  }
}
