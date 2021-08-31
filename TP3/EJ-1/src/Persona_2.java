import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;



class Persona_2 {

    private int dni;
    private String doB;
    private String sexo;
    private String name;
    private String surname;
    private double weigth;
    private double heigth;


    public Persona_2()  { 
        this.doB = "01-01-2000";
        this.sexo = "F";
        this.name = "N";
        this.surname = "N";
        this.weigth = 1.0;
        this.heigth = 1.0;
    }

    public Persona_2(int dni) {
        this();
        this.dni=dni;   // Obligatorio usar setters?
    }

    
    public Persona_2(int dni, String name, String surname) {
        this();
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    public Persona_2(int dni, String name, String surname, String doB) {
        this();
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.doB = doB;
    }

    public Persona_2( int dni, String name, String surname, String doB, String sexo, double weigth, double heigth) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.doB = doB;
        this.sexo = sexo;
        this.heigth = heigth;
        this.weigth = weigth;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDoB() {
        return this.doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeigth() {
        return this.weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return this.heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getImc(){     
        return (this.weigth/(Math.pow(this.heigth,2)));
    } 

    public String isInShape() {
        //Usamos una variable auxiliar para evitar calciular dos veces el imc
        double imc = this.getImc(); 
        
        //La consigna no esta clara, tomo el caso que los extremos no se incluyan
        //   ---|---------(-----------)--------
        //      0         18.5        25  
        if( imc>18.5 && imc<25) 
            return "Estoy en forma";
        return "No estoy en forma";
    }

    // public boolean isBirthday(){
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    //     LocalDate dob = LocalDate.parse(this.doB,formatter); 
    //     LocalDate actualDate = LocalDate.now();     
    //     return(dob.isEqual(actualDate));       
    // }

    public boolean isAdult(){
        return this.isOlderThan(18);
    }


    public boolean canVote(){
        return this.isOlderThan(16);
    }

    private boolean isOlderThan(int age){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(this.doB, formatter); 
        LocalDate actualDate = LocalDate.now();     
        if(actualDate.compareTo(dob)>age)return true;
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Datos de la persona:" + "\n";
        str += "DNI: " + this.getDni() + "\n";
        str += "Nombre: " + this.getName() + "\n";
        str += "Apellido: " + this.getSurname() + "\n";
        str += "DoB: " + this.getDoB() + "\n";

        return str;
    }

} 
