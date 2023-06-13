

public class menu {
    public static void main(String[] args) {
        //Persona miPersona = new Persona(1751395623, "Eduardo", "Almachi", "Quitumbe", "2738990");
       //Persona Pedro = new Persona();

        //System.out.println(miPersona.getApellido());
        //System.out.println(Pedro.getCi());

        //Estudiante Mayerli = new Estudiante(
                /*1751395623,
                "Mayerli",
                "Catani",
                "La Floresta",
                "0987654234",
                33,
                // apartir de aqui los elementos son de el estudiant
                123456,
                "edu.@epn.ed",
                "3 semestre",
                "Desarrollo de software");

                 */

        Doctor Ana = new Doctor(17513234, "Ana", "Almachi", "quitumbe", "0982374", 33, "Leo", "pediatria", 123, "matutino",
                "baca ortiz");

        System.out.println(Ana.getNombre() + " es Doctora");
        System.out.println("Tiene " + Ana.getEdad() + " años");
        System.out.println("Es de signo " + Ana.getSigno());
        Ana.examinar();


    }
}