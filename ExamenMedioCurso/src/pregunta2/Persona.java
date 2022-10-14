package pregunta2;

public abstract class Persona
{
    protected String nombre;
    protected String apellido;
    protected int dni;

    protected int fechaNacimiento;

    public Persona(String nombre, String apellido, int dni, int fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected int getDni() {
        return dni;
    }

    protected int getFechaNacimiento() {
        return fechaNacimiento;
    }

    int calcularEdad() {
        return 0;
    }
    public void mostrar() {
    }

}