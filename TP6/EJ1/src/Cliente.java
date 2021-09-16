import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private LocalDate fechaDedevolucion;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setFechaDevolucion(LocalDate fecha) {
        this.fechaDedevolucion = fecha;
    }

    public boolean equals(Object o) {
        Cliente aux = (Cliente) o;
        return aux.getNombre().equals(this.getNombre());
    }

    public LocalDate getFechaDeDevolucion() {
        return this.fechaDedevolucion;
    }

    public String toString() {
        return "Nombre: " + this.nombre;
    }
}