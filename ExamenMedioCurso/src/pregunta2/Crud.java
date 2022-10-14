package pregunta2;

public interface Crud
{
    void crear(String nombre, String apellido, int dni, int fechaNacimiento, int codigo);

    void listar();

    void actualizar();

    void eliminar();
}