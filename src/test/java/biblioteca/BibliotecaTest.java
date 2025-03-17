package biblioteca;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BibliotecaTest {

    Biblioteca biblio;
    Libro libro;

    @BeforeEach
    void setUp() {
        biblio = new Biblioteca();
        libro = new Libro("Quijote", "Cervantes", 1605);
    }

    @AfterEach
    void tearDown() {
        biblio = null;
        libro = null;
    }

    @Test
    void agregarLibro() {
        biblio.agregarLibro(libro);

        assertTrue(biblio.getLibros().contains(libro));

        assertTrue(biblio.agregarLibro(libro));

        //assertEquals(true, biblio.agregarLibro(libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTituloQueSi() {
        biblio.agregarLibro(libro);
        assertEquals(libro, biblio.encuentraLibroPorTitulo(libro.getTitulo()));
    }

    @Test
    void encuentraLibroPorTituloQueNo() {
        biblio.agregarLibro(libro);
        assertNull(biblio.encuentraLibroPorTitulo("El Principito"));
    }

    @Test
    void encuentraLibrosPorAutorQueSi() {
        biblio.agregarLibro(libro);

        biblio.encuentraLibrosPorAutor("Cervantes");

        // ToDo
        assertInstanceOf(List.class, biblio.encuentraLibrosPorAutor(libro.getAutor()));

        assertTrue(biblio.encuentraLibrosPorAutor(libro.getAutor()) instanceof List<Libro>);

        assertTrue(biblio.encuentraLibrosPorAutor(libro.getAutor()).contains(libro));
    }

    @Test
    void encuentraLibrosPorAutorQueNo() {
    }
}