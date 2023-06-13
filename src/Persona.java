//clase PADRE
public class Persona {
    private int ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private int edad;
    private String signo;
    public Persona() {

    }

    public Persona(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
    }

    //getters and setters
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    //metodos especificos
    public void caminar() {
        System.out.println("Este es el metodo de caminar que pertence a persona");
    }
    public void trabajar() {
        System.out.println("Este es el metodo trabajar que pertences a persona");
    }
}
