import java.util.ArrayList;

public class PrioridadCarga {
    ArrayList<Transporte> elementos = new ArrayList<Transporte>();


    public void agregar(Transporte t){
        boolean encontro = false;

        for (int i = 0; i < this.elementos.size(); i++) {
     
            if ( t.prioridad(elementos.get(i))) {
                this.elementos.add(i, t);
                encontro = true;
            }
        }

        if (!encontro)
            this.elementos.add(t);
    }

    public int size(){
        return this.elementos.size();
    }

    public Transporte index (int indice){
        return this.elementos.get(indice);
    }

    public void imprimirLista() {
        for (Transporte elemento : elementos) {
            System.out.println(elemento);
        }
    }
 
}
