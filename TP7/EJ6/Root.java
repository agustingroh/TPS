

public class Root {
    private int valor;
    private Node mayor;
    private Node menor;

    public Root(){
        this.mayor = new Node();
        this.menor =  new Node();
    }

    public Root(int valor){
        this();
        this.valor=valor;  
        
    
    }

    public void agregarNodo(Node n){
      if(mayor==null && menor == null){
        this.menor.agregarHijo(n);
      }     
        else if(menor.getValor()>n.getValor()){
            this.mayor = menor;
            this.menor=n;
        }
    }

    public void setValue(int value){
        this.valor=value;
    }

    public String toString(){
        return "Root : " + this.valor + " Valor mayor " +  mayor.getValor()  + "Valor menor " + menor.getValor();
    }

public static void main(String[] args) {
    Root root = new Root();
    root.setValue(10);
    root.agregarNodo(new Node(8));

    System.out.println(root);


}
    
}
