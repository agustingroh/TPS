package EJ1_Stack;

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

import java.util.Stack;

public class Pila {
    Stack<String> pila;

    public Pila() {
        this.pila = new Stack<String>();
    }

    public void push(String s) {
        pila.push(s);

    }

    public String pop() {
        return pila.pop();
    }

    public String top() {
        return pila.peek();
    }

    public int size() {
        return pila.size();
    }


    // el clone apunta al mismo objecto
    public Stack<String> copy() {
        Stack<String> clone = new Stack<String>();
        clone = (Stack<String>) pila.clone();
        return clone;
    }

    public Stack<String> reverse() {

        Stack<String> clone = (Stack<String>) this.copy();    

         Stack<String> reverse = new Stack<String>();

         for (int i = 0; i < this.size(); i++) {
             reverse.push(clone.pop());

         }
        return reverse;

    }

    public static void main(String[] args) {
        Pila p1 = new Pila();

        
        String aux = p1.pop();
        System.out.println(aux);
        // p1.push("b");

        // System.out.println(p1.top());
        // p1.push("c");
        // p1.push("d");

        for (int i = (int) ('a'); i <= (int) ('z'); i++) {

            p1.push(String.valueOf((char) i));
        }

        // Casting
        Stack<String> clone = p1.copy();
        System.out.println(clone);

        System.out.println(p1.reverse());
    }
}
