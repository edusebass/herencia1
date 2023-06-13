public class Doctor extends Persona {
    private String especialidad;
    private int cod;
    private String horario;
    private String hospital;

    public Doctor () {
        super();
    }
    public Doctor(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo,
                  String especialidad,
                  int cod,
                  String horario,
                  String hospital) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
        this.especialidad = especialidad;
        this.cod = cod;
        this.horario = horario;
        this.hospital = hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    //metodo
    public void examinar() {
        System.out.println("Este es el metodo examinar");
    }
}
