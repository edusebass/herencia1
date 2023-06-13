public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;
    private String cod_emp;

    public EmpleadoPublico(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo,
                           String puesto,
                           String cargo,
                           String cod_emp) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
        this.puesto = puesto;
        this.cargo = cargo;
        this.cod_emp = cod_emp;
    }
}
