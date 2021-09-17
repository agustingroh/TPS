import java.time.LocalDate;

import java.time.LocalDate;

public class Alquiler {
    private Producto producto;
    private LocalDate vencimiento;

    public Alquiler(Producto producto,LocalDate vencimiento){        
        this.producto = producto;
        this.vencimiento = vencimiento;
    }



    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDate getVencimiento() {
        return this.vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }
    

    public boolean isVencido(){
        if(LocalDate.now().compareTo(this.vencimiento)>0){
            return true;
        }
        return false;
    }


}
