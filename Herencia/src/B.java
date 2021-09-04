public class B extends A {
    
    private int valor1;

    public B (String name){
        super(name);
    }


    // public int getValor1(){
    //     return getValorB() + 1;
    // }

    public int getValorB() {
        return 3;
    }

    public int getValor2(){
        return getValor1() + 1;
    }
    
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

}
