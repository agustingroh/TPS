import java.time.LocalDate;


// Los productos congelados aire deberian extender directamente de ProductoRefrigerado , pero 
// perderiamos la clase ProductoCongelado
// public class ProductoCongelado extends ProductoRefrigerado {
  public class ProductoCongelado {
  private int var1;

  public ProductoCongelado(int var){
    this.var1=var;

}
  
  // public ProductoCongelado(int numeroDeLote,LocalDate fechaDeVencimiento,String nombre,LocalDate envasado,String origen,double tempConservacion,int codigo){
  //     super(numeroDeLote,fechaDeVencimiento,nombre,envasado,origen,tempConservacion,codigo);
  // }

  
  public boolean equals(Object a) {
    
    /* Check if o is an instance of Complex or not
      "null instanceof [type]" also returns false */
    if (!(a instanceof ProductoCongelado)) {
        return false;
    }
         
    // https://www.geeksforgeeks.org/overriding-equals-method-in-java/
    
    ProductoCongelado b = (ProductoCongelado) a;
    
    return (this.var1 == b.var1);

  }


  public static void main(String[] args) {
    ProductoCongelado p1 = new ProductoCongelado(3);
    ProductoCongelado p2 = new ProductoCongelado(3);
    String str = "comando comando";

    System.out.println(p1.equals(p1)); 
      
  }
}


