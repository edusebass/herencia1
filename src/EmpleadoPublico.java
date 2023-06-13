public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;
    private String cod_emp;

    public EmpleadoPublico() {
        super();
    }
    public EmpleadoPublico(int ci, String nombre, String apellido, String direccion, String telefono, int edad, String signo,
                           String puesto,
                           String cargo,
                           String cod_emp) {
        super(ci, nombre, apellido, direccion, telefono, edad, signo);
        this.puesto = puesto;
        this.cargo = cargo;
        this.cod_emp = cod_emp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    //metodo examinar
    public void tramitar() {
        System.out.println("Este es el metodo tramitar");
    }
}
