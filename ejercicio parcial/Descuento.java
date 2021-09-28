import java.time.LocalDate;

import javax.lang.model.util.ElementScanner6;

import java.time.DayOfWeek;

public class Descuento extends ComportamientoProducto{

    private DayOfWeek diaDescuento;
    private double descuento;

    public Descuento(DayOfWeek diaDescuento,double descuento ){
        this.diaDescuento=diaDescuento;
        this.descuento=descuento;
    }


    public void setDescuento(double descuento){
        this.descuento=descuento;
    }

    public double getDescuento(){
        return this.descuento;
    }

    public double getPrecio(Producto p){
        if(this.diaDescuento.name().equals(LocalDate.now().getDayOfWeek().name())){  
       return (p.getPrecio()-(p.getPrecio()* this.getDescuento()/100));
        }
       else {
       return p.getPrecio();
       }
    }   


}
