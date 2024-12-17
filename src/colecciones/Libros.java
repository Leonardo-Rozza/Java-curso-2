package colecciones;

import java.util.Objects;

public class Libros {

  private String titulo;
  private String autor;
  private int isbn;

  public Libros(String titulo, String autor, int isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public String mostrarInformacion() {
    return "El titulo es: " + this.titulo +  "\nEl autor es: " + this.autor + "\n y su isbn es: " + this.isbn;
  }

//  //Sobreescribimos equals para comparar Nuestros propios OBJETOS.
//  public boolean equals(Object obj) {
//    if (obj instanceof Libros) {
//      return this.isbn == ((Libros) obj).isbn; //Devuelve true si los isbn son iguales, estamos haciendo el casting.
//    }
//    return false;
//  }

  @Override
  public int hashCode() {
    return Objects.hashCode(isbn);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Libros libros)) return false;
    return this.isbn == libros.isbn;
  }
}
