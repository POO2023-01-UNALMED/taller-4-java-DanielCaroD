package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    static long ndcedula;
    
    static {
        totalPersonas = 0;
        ndcedula = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula = ndcedula;
        this.nombre = nombre;
        totalPersonas++;
        ndcedula++;
    }
    
    public Persona() {
    	this(ndcedula,"");
        totalPersonas++;
        ndcedula++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}