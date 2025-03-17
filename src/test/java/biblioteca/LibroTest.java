package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    private Libro libro;

    @BeforeEach
    void setUp() {
        this.libro = new Libro("Quijote", "Cervantes", 1605);
    }

    @Test
    void constructorLibroAutor() {
        //Libro libro = new Libro("Quijote", "Cervantes", 1605);
        assertEquals("Cervantes", libro.getAutor());
    }

    @Test
    void constructorLibroTitulo() {
        assertEquals("Quijote", libro.getTitulo());
    }

    @Test
    void constructorLibroAnioPublicacion() {
        assertEquals(1605, libro.getAnioPublicacion());
    }

    @Test
    void getTitulo() {
    }

    @Test
    void setTitulo() {
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}