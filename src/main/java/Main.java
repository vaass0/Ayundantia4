public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("ufro");

        Libro libro = new Libro("Ay que susto","Pepe el makina","Misterio","001",1,true);
        biblioteca.agregarLibro(libro);
        Libro libro1 = new Libro("Ay que miedito","Pepe el makina","Misterio","002",1,true);
        biblioteca.agregarLibro(libro1);
        Libro libro2 = new Libro("LibroTroll","ElRubius","Drama","003",1,true);
        biblioteca.agregarLibro(libro2);
        Libro libro3= new Libro("LaBiblia","JordiWild","Romance","004",1,true);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarLibrosDisponibles();

        biblioteca.prestarLibro("LaBiblia");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.devolverLibro("LibroTroll");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.buscarLibroPorTitulo("LibroTroll");

        biblioteca.buscarLibroPorAutor("Pepe el makina");

        biblioteca.eliminarLibro("LaBiblia");
        biblioteca.mostrarLibrosDisponibles();

    }
}
