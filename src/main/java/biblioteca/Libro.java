package biblioteca;

/**
 * La clase Libro representa un libro con información básica:
 * Título, autor y año de publicación
 *
 * @author Luis García Sánchez
 * @version 17.03.2025
 * 
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * Año de publicación del libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Método constructor con parámetros
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año de publicación del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor + " de los palotes";
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Devuelve el autor del libro
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Devuelve el año de publicación
     * @return Año de publicación
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
