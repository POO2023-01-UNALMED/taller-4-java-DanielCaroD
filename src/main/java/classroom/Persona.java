package classroom;

public class Persona {

	long cedula = 0;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
    	this(cedula,nombre);
        totalPersonas++;
    }
    
    public Persona(long cedula) {
    	this(cedula,"");
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.nombre = nombre;
    	cedula++;
        totalPersonas++;
    }
    
    public Persona() {
    	this.nombre = "";
        totalPersonas++;
        cedula++;
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
