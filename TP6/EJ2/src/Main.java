import java.time.LocalDate;


class Main {


    public static void main(String[] args) {

       Puerto puerto = new Puerto();
       System.out.println("\n Lista de camiones ordenados por fecha de carga");
        Transporte t1 = new Camion(5000, LocalDate.parse("2021-10-17"));
        Transporte t2 = new Camion(8000, LocalDate.parse("2021-10-18"));

        puerto.setPrioridadSegunTransporte(new PrioridadCamion());

        puerto.agregarCamion(t2);
        puerto.agregarCamion(t1);               
        puerto.imprimirListaDeCamiones();

        
        System.out.println("\n Lista de barcos ordenados por capacidad");
        Transporte b1 = new Barco(1800000, LocalDate.parse("2021-10-17"));
        Transporte b2 = new Barco(510000, LocalDate.parse("2021-10-17"));
        Transporte b3 = new Barco(400000, LocalDate.parse("2021-10-17"));
        Transporte b4 = new Barco(300000, LocalDate.parse("2021-10-17"));
        puerto.setPrioridadSegunTransporte(new PrioridadBarco());
        puerto.agregarBarco(b1);
        puerto.agregarBarco(b2);
        puerto.agregarBarco(b3);
        puerto.agregarBarco(b4);
          puerto.imprimirListaDeBarcos();


      
// Carga de Barcos
         puerto.cargarBarcos();

        // Lista de barcos y camiones en cola restantes
        System.out.println("\n Lista de barcos y camiones en cola restantes \n");
         puerto.imprimirListaDeCamiones();
         puerto.imprimirListaDeBarcos();


    }
}