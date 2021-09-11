
/*
1 - Pila de elementos
Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma. Es posible
consultar el tope de la pila sin eliminarlo utilizando el método top(). La mencionada
anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. Definir
también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos. ● reverse():
retorna una copia de la pila pero con los elementos en el orden inverso.
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

// PREGUNTAR
/*
List<Object> objectList = new ArrayList<Object>();
 objectList.add("String Item");
 objectList.add(new Car("VW"));
 objectList.add(new Runnable() 
 */

public class Pila {

    public static final int MINSIZE = 0;
    private ArrayList<String> pila;

    public Pila() {
        this.pila = new ArrayList<String>();
    }

    public void push(String nuevoElemento) {
        pila.add(nuevoElemento);
    }

    public String pop() {
        String aux = null;
        if (pila.size() > MINSIZE) {
            aux = pila.get(pila.size() - 1);
            pila.remove(pila.size() - 1);
        }
        return aux;
    }

    public String top() {
        String aux = null;
        if (this.size() >= MINSIZE) {
            aux = pila.get(MINSIZE);
        }
        return aux;
    }

    public int size() {
        return pila.size();
    }

    public ArrayList<String> reverse() {
        ArrayList<String> reverseList = new ArrayList<String>();
        ArrayList<String> aux = this.copy();
        for (int i = this.size() - 1; i >= MINSIZE; i--) {
            reverseList.add(aux.get(i));
        }

        return reverseList;
    }

    public ArrayList<String> copy() {
        return new ArrayList<String>(pila);

    }

    public static void main(String[] args) {
        Pila p1 = new Pila();

        p1.push("a");
        p1.push("b");
        p1.push("c");

        ArrayList<String> reverse = p1.reverse();
        System.out.println(reverse);

        ArrayList<String> copy = p1.copy();
        System.out.println(copy);
        copy.clear();

        String top = p1.top();
        System.out.println(top);

        String testPop = p1.pop();
        System.out.println(testPop);
        testPop = p1.pop();
        System.out.println(testPop);
        testPop = p1.pop();
        System.out.println(testPop);
        testPop = p1.pop();
        System.out.println(testPop);

    }
}
