import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void agregarLibroTest() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);

        assertTrue(biblioteca.agregarLibro(libro));
        assertTrue(biblioteca.agregarLibro(libro));
        assertEquals(2,libro.getCantidadDisponible());

        System.out.println("La prueba se ha aprobado correctamente...");

    }

    @Test
    void buscarLibroPorTitulo() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);
        assertTrue(biblioteca.agregarLibro(libro));
        biblioteca.mostrarLibrosDisponibles();

        List<Libro> librosEncontrados;
        librosEncontrados = biblioteca.buscarLibroPorTitulo("LibroTroll");
        assertSame(libro, librosEncontrados.get(0));

        System.out.println("La prueba se ha aprobado correctamente...");
    }

    @Test
    void buscarLibroPorAutor() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);
        assertTrue(biblioteca.agregarLibro(libro));
        biblioteca.mostrarLibrosDisponibles();

        List<Libro> librosEncontrados;
        librosEncontrados = biblioteca.buscarLibroPorAutor("ElRubius");
        assertSame(libro, librosEncontrados.get(0));

        System.out.println("La prueba se ha aprobado correctamente...");

    }

    @Test
    void eliminarLibro() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",0,true);
        assertTrue(biblioteca.agregarLibro(libro));
        biblioteca.mostrarLibrosDisponibles();

        assertTrue(biblioteca.eliminarLibro("LibroTroll"));

        System.out.println("La prueba se ha aprobado correctamente...");
    }

    @Test
    void prestarLibro() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);
        assertTrue(biblioteca.agregarLibro(libro));
        biblioteca.mostrarLibrosDisponibles();

        assertTrue(biblioteca.prestarLibro("LibroTroll"));

        assertTrue(biblioteca.eliminarLibro("LibroTroll"));

        System.out.println("La prueba se ha aprobado correctamente...");
    }

    @Test
    void devolverLibro() {
        Biblioteca biblioteca = new Biblioteca("Ufro");
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",0,true);
        assertTrue(biblioteca.agregarLibro(libro));
        biblioteca.mostrarLibrosDisponibles();

        assertTrue(biblioteca.devolverLibro("LibroTroll"));

        assertFalse(biblioteca.eliminarLibro("LibroTroll"));

        assertEquals(1,libro.getCantidadDisponible());

        System.out.println("La prueba se ha aprobado correctamente...");

    }
}