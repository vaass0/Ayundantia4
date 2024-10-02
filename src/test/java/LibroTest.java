import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibroTest {

    @org.junit.jupiter.api.Test
    //Prueba normal metodo prestar
    void prestarTest1() {
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);
        assertTrue(libro.prestar());
        assertFalse(libro.getDisponible());
        assertEquals(0,libro.getCantidadDisponible());

        System.out.println("La prueba se ha realizado sin problema alguno...");
    }
    @Test
    //prueba caso limite metodo prestar
    void prestarTest2(){
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",0,false);
        assertFalse(libro.prestar());
        assertFalse(libro.getDisponible());
        assertEquals(0,libro.getCantidadDisponible());

        System.out.println("La prueba se ha realizado sin problema alguno...");
    }


    @org.junit.jupiter.api.Test
    //probar caso promedio
    void devolverTest1() {
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",1,true);
        assertTrue(libro.devolver());
        assertEquals(2,libro.getCantidadDisponible());

        System.out.println("La prueba se ha realizado sin problema alguno...");
    }
    @Test
    void devolverTest2(){
        Libro libro = new Libro("LibroTroll","ElRubius","Historia","wawawa",0,false);
        assertTrue(libro.devolver());
        assertEquals(1,libro.getCantidadDisponible());

        System.out.println("La prueba se ha realizado sin problema alguno...");

    }


}