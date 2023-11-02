package colecciones;

import java.util.Objects;

public class HashCodeEquals {
    public static void main(String[] args) {
        Libros libroJava = new Libros("Java inicial", "12112", "Leonardo Rozza");
        Libros libroJavaScript = new Libros("JavaScript inicial", "1212", "Leonardo Rozza");


        System.out.println(libroJavaScript.equals(libroJava));

    }
}



class Libros{
    public Libros(String nombreLibro, String isbn, String autor){
        this.nombreLibro = nombreLibro;
        this.isbn = isbn;
        this.autor = autor;
    }

//    public boolean equals(Object obj) {
//        Libros otroLibro = (Libros) obj; //3. Hacemos un casting de obj para que podamos hacer la comparacion del paso 2.
//        if (obj instanceof Libros){   //1. Corroboramos que el objeto recibido es una instancia de Libros.
//            return this.isbn == otroLibro.isbn;  //2. Una vez validado, preguntamos si el isbn es igual, al que se está comparando
//        }return false;
//    }

    public String getDatos() {
        return "El autor es: " + nombreLibro + " su titulo es: " + nombreLibro + " y su ISBN es: " + isbn;
    }

    private String nombreLibro;
    private String autor;
    private String isbn;

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libros libros)) return false;
        return Objects.equals(isbn, libros.isbn);
    }
}