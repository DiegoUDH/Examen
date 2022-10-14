package pregunta4;
public class Libro
{
    private String titulo;
    private int codigo;
    private Autor autor[];
    private int contadorAutor;
    private String anioPublicacion;
    private Capitulo capitulo[];
    private int contadorCapitulo;

    public Libro(int size){
        this.autor = new Autor[size];
        this.contadorAutor=0;
    }
    public void agregar(String nombres,String apellidos,String nombreCapitulo,String nombreTema)
    {
        this.autor[this.contadorAutor]=new Autor(nombres,apellidos);
        this.contadorAutor++;

    }
    public void listar(){
        {
            for(int i=0; i<this.contadorAutor; i++)
            {
                this.autor[i].listarAutor();
            }
        }
    }

    public Capitulo buscar(String capitulo)
    {
        int i;

        for(i=0; i<this.contadorCapitulo; i++)
        {
            if(this.capitulo[i].getNombreCapitulo()==(capitulo))
            {
                break;
            }
        }

        if(i == this.contadorCapitulo)
        {
            return null;

        } else {

            return this.capitulo[i];
        }

    }

}