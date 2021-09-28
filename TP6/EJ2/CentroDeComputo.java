import java.util.ArrayList;

public  class CentroDeComputo {


    private ArrayList <Proceso> procesos;
    private ArrayList <Computadora> computadoras;

    public CentroDeComputo(){
        this.procesos = new ArrayList<Proceso>();
        this.computadoras = new ArrayList<Computadora>();    
    }

  

    public void agregarProceso (Proceso p,Requerimiento r){
  

        boolean encontro=false;
        int size = procesos.size();
        for(int i=0; i<size;i++){          
            if(r.requerimiento(p, procesos.get(i))){
                encontro=true;
                procesos.add(i, p);
            }           
        }

        if(!encontro)
        procesos.add(p); 
            
    }

    public void agregarComputadora(Computadora c,Requerimiento r){
        boolean encontro=false;
        int size = computadoras.size();
        for(int i=0; i<size;i++){
            if(r.requerimiento(c, computadoras.get(i))){
                encontro=true;
                computadoras.add(i, c);
            }           
        }

        if(!encontro)
        computadoras.add(c);       
    }

    public void getListaDeProcesos(){
        for (Proceso proceso : procesos) {
            System.out.println(proceso);
        }
    }
    
    public void getListaDeComputadoras(){
        for (Computadora computadora : computadoras) {
            System.out.println(computadora);
        }
    }
    

    
}
