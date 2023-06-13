import java.security.PrivilegedAction;

public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int num_camiseta;
    private String representante;

    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
    }
}
