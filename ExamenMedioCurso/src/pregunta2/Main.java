package pregunta2;

public class Main
{
    public static void main(String[] args) {

        Alumno alumno = new Alumno("bob","wheleer",9153123,2005,156489);
        alumno.mostrar();
        System.out.println("La edad es: "+alumno.calcularEdad());
        Docente docente= new Docente("diego","forlan",94153156,1994,"doctor","Ing. Sistemas");
        docente.mostrar();
        System.out.println("La edad es: "+docente.calcularEdad());

        System.out.println("---------------------Crear Alumno-------------------------");
        AlumnoControlador alumnoControlador = new AlumnoControlador(8);
        alumnoControlador.crear("Walter","White",48745132,1985,2561);
        System.out.println("Alumno creado");
        System.out.println("---------------------Crear Docente------------------------");
        DocenteControlador docenteControlador = new DocenteControlador(8);
        docenteControlador.crear("Gustavo","Fring",487975,1991,456218);
        System.out.println("Docente creado");

    }
}