

public class Node {
    private int valor;
    private Node mayor;
    private Node menor;


    public Node(int value){
        this();
        this.valor = value;
        
    }

    public Node(){
      //  this.mayor = new Node();
      //  this.menor =  new Node();
    }


    public int getValor(){
        return this.valor;
    }

    public void agregarHijo(Node n){
        if(n.getValor()>this.valor)
            mayor.agregarHijo(n);
        else
            menor.agregarHijo(n);

    }
    
}
