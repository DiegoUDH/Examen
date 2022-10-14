package pregunta2;

public class DocenteControlador implements Crud

{
    protected Alumno alumno[];
    int contador;

    public DocenteControlador(int size) {
        this.alumno= new Alumno[size];

        this.contador = 0;
    }
    @Override
    public void crear(String nombre, String apellido, int dni, int fechaNacimiento, int codigo)
    {
        this.alumno[this.contador] = new Alumno(nombre,apellido,dni,fechaNacimiento,codigo);

        this.contador++;

    }
    @Override
    public void listar()
    {
        for (int i = 0; i < this.contador; i++) {
            System.out.println(this.alumno[i].getCodigo());

            this.alumno[i].mostrar();
        }

    }
    @Override
    public void actualizar(){

    }
    @Override
    public void eliminar()
    {

    }
}