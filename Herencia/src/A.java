public class A {
private String name;
private int valor1;
private static int instancias;
private int id;

public A (String name){
    this.name=name;
    this.id=instancias;
    instancias++;

}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getValor1() {
        return 3;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }



    public int getId() {
        return this.id;
    }

  

    public static void main(String[] args) {
        A a = new A("Agus");
        B b = new B("Manolo");
        C c = new C("Juan");

        A poli = new C("poli");


        System.out.println(poli.getValor1()); 
        System.out.println(poli.getName());
        
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());

        System.out.println(a.getId());
        System.out.println(b.getId());
        System.out.println(c.getId());

        

        // System.out.println(b.getValor2());
        // System.out.println(c.getValorC());
   }
}
