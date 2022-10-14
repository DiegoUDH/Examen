package pregunta4;
public class Main {

    public static void main(String args[]) {
        Libro libro = new Libro(3);
        libro.agregar("Julio","Verne","6","Aventura");
        libro.agregar("Anonimo","Ninguno","7","Misterio");
        libro.listar();
        System.out.println("------------- Buscar Capitulo -------------");
        String capitulo ="6";
        Capitulo encontrado;
        encontrado = libro.buscar(capitulo);
        if(encontrado != null)
        {
            System.out.println("Cliente encontrado: "+encontrado.getNombreCapitulo());

        } else {

            System.out.println("No se encontro: "+capitulo);
        }

    }
}