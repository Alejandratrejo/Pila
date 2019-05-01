
package pila;
import java.util.Stack;
/**
 *
 * @author alejandra trejo
 */
public class main {
    
    public static void main(String[] args) {

        Stack<nodo> pila = new Stack<nodo>();

      nodo l1 = new nodo("Título 1", "Autor 1");
        nodo l2 = new nodo("Título 2", "Autor 2");
        nodo l3 = new nodo("Título 3", "Autor 3");

        pila.push(l1); // adiciona un libro a la pila
        pila.push(l2);
        pila.push(l3);


        System.out.println(pila.peek().getTitulo()); // el último elemento adicionado

        while (!pila.isEmpty()) { // mostrar pila completa
            System.out.println(pila.pop().getTitulo()); // extrae un elemento de la pila
        }

    }
}
