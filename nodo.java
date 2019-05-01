
package pila;
import java.util.Stack;
/**
 *
 * @author alejandra trejo
 */
public class nodo {
   private String titulo;
    private String autor;

    public nodo() {
        this.titulo = "";
        this.autor = "";
    }

    public nodo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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
}