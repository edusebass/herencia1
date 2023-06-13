import java.security.PrivilegedAction;

public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int num_camiseta;
    private String representante;
    private int horas_ent;

    public Futbolista () {
        super();
    }
    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono, String equipo, int edad, String signo, String posicion, int num_camiseta, String representante,
                      int horas_ent) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
        this.equipo = equipo;
        this.posicion = posicion;
        this.num_camiseta = num_camiseta;
        this.representante = representante;
        this.horas_ent = horas_ent;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras_ent() {
        return horas_ent;
    }

    public void setHoras_ent(int horas_ent) {
        this.horas_ent = horas_ent;
    }

    //Metodos
    public void correr() {
        System.out.println("Este es el metodo correr");
    }
}
