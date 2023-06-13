public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public Estudiante() {
        super();
    }

    //constructor para que funcione la herencia
    public Estudiante(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo,
                      //HAY QUE AÑADIR ESTO TAMBIEN
                      int codigo,
                      String correo,
                      String semestre,
                      String carrera) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
        // atributos propios de la clase estudiante (HAY QUE AÑADIR ESTO)
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    // GETTERS AND SETTER DE SOLO LA CLASE ESTUDIANTE
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println("Metodo estudiar que pertencece a estudiante");
    }
    public void leer() {
        System.out.println("Metodo leer que pertenece a estudiante");
    }
    public void memorizar() {
        System.out.println("Metodo memorizar que pertenece a estudiante");
    }
}
