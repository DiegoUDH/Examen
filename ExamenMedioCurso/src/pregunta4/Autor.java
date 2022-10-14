package pregunta4;
public class Autor
{
    private String nombres;
    private String apellidos;

    public Autor(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void listarAutor(){
        System.out.println("Nombres: "+ this.getNombres());
        System.out.println("Apellidos: "+ this.getApellidos());
    }
}