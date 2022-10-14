package pregunta2;

public class Docente extends Persona

{
    protected String grado;
    protected String titulo;


    public Docente(String nombre, String apellido, int dni, int fechaNacimiento,String grado,String titulo) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.grado=grado;
        this.titulo=titulo;

    }

    public String getGrado() {
        return grado;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    int calcularEdad()
    {
        int calcularEdad;
        calcularEdad=(2022-getFechaNacimiento());
        return calcularEdad;
    }

    @Override
    public void mostrar(){
        System.out.println("\tnombre del docente: "+ getNombre());
        System.out.println("\tapellido del docente: "+ getApellido());
        System.out.println("\tDni del docente: "+ getDni());
        System.out.println("\tFecha De Nacimiento: "+ getFechaNacimiento());
        System.out.println("\tGrado del Docente "+ getGrado());
        System.out.println("\tTitulo del Docente "+ getTitulo());
    }

}