package EJ2;

public class CualidadLeal extends Cualidad{
    private boolean estado;

    public CualidadLeal(boolean estado){
        this.estado=estado;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


@Override
    public boolean equals(Object o){
        CualidadLeal aux = (CualidadLeal)o;
            return  this.estado == aux.isEstado();
    }
}
