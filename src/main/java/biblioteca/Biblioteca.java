package biblioteca;

import java.util.ArrayList;
import java.util.List;


/**
 * La clase Biblioteca representa una colección de libros.
 * Proporciona métodos para agregar, eliminar y buscar libros en la biblioteca.
 */
public class Biblioteca {

    // TODO: Documentar estos atributos

    /**
     * Lista que almacena los libros de la biblioteca.
     */
    private final List<Libro> libros;

    // TODO: Documentar este método

    /**
     * Construye una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Construye una biblioteca utilizando una lista preexistente de libros.
     *
     * <p><b>Nota:</b> Este constructor no se debe testear.</p>
     *
     * @param libros Lista de libros que se asigna a la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros contenidos en la biblioteca.
     *
     * @return La lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * <p><b>Test 01:</b> Buscar libro existente y comprobar que lo localiza.<br>
     * <b>Test 02:</b> Buscar libro no existente y comprobar que no lo localiza.</p>
     *
     * @param titulo El título del libro a buscar.
     * @return El libro que coincide con el título, o {@code null} si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * Busca un libro en la biblioteca por el autor.
     *
     * <p><b>Obsoleto:</b> Este método está obsoleto y ha sido reemplazado por
     * {@link #encuentraLibrosPorAutor(String)}. No se debe testear.</p>
     *
     * @deprecated Reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     * @param autor El autor del libro a buscar.
     * @return El primer libro que coincide con el autor, o {@code null} si no se encuentra.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca libros en la biblioteca por el autor.
     * Disponible desde la versión 2.0.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista con los libros que coinciden con el autor. Si no se encuentra ningún libro,
     *         retorna {@code null}.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
