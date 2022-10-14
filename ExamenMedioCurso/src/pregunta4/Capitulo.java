package pregunta4;
public class Capitulo{
    private String nombreCapitulo;
    private Tema tema[];
    private int contadorTema;

    public Capitulo(String nombreCapitulo, Tema[] tema, int contadorTema) {
        this.nombreCapitulo = nombreCapitulo;
        this.tema = tema;
        this.contadorTema = contadorTema;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public Tema[] getTema() {
        return tema;
    }

    public int getContadorTema() {
        return contadorTema;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public void setTema(Tema[] tema) {
        this.tema = tema;
    }

    public void setContadorTema(int contadorTema) {
        this.contadorTema = contadorTema;
    }
}