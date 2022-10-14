package pregunta2;

public class Alumno extends Persona
{
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Alumno(String nombre, String apellido, int dni, int fechaNacimiento, int codigo) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.codigo=codigo;


    }
    @Override
    int calcularEdad() {
        int calcularEdad;
        calcularEdad= 2022-getFechaNacimiento();
        return calcularEdad;
    }
    @Override
    public void mostrar(){
        System.out.println("\tnombre de Alumno: "+ getNombre());
        System.out.println("\tApellidos: "+ getApellido());
        System.out.println("\tDni: "+ getDni());
        System.out.println("\tFecha de Nacimiento: "+ getFechaNacimiento());
        System.out.println("\tCodigo "+ getCodigo());


    }


}