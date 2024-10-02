import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public boolean agregarLibro(Libro libro){
        if(libro.getIsbn() != null){
            for(Libro book: this.libros){
                if (book.getIsbn().equals(libro.getIsbn())){
                    book.setCantidadDisponible(book.getCantidadDisponible()+1);
                    return true;
                }
            }
            libros.add(libro);
            return true;
        }
        return false;
    }public void mostrarLibrosDisponibles(){
        for(Libro libro : this.libros){
            libro.mostrarInfo();
        }
    }public ArrayList<Libro> buscarLibroPorTitulo(String titulo){
        ArrayList<Libro> coincidencias = new ArrayList<>();
        for(Libro libro: this.libros){
            if(libro.getTitulo().equals(titulo)){
                coincidencias.add(libro);
            }
        }return coincidencias;
    }public ArrayList<Libro> buscarLibroPorAutor(String autor){
        ArrayList<Libro> coincidencias = new ArrayList<>();
        for(Libro libro: this.libros){
            if(libro.getAutor().equals(autor)){
                coincidencias.add(libro);
            }
        }return coincidencias;
    }public boolean eliminarLibro(String titulo){
        for(Libro libro : this.libros){
            if(libro.getTitulo().equals(titulo) && libro.getCantidadDisponible() == 0){
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }public boolean prestarLibro(String titulo){
        for(Libro libro: this.libros){
            if(libro.getTitulo().equals(titulo) && libro.getDisponible()){
                libro.prestar();
                return true;
            }
        }return false;
    }public boolean devolverLibro(String titulo){
        for(Libro libro: this.libros){
            if(libro.getTitulo().equals(titulo)){
                libro.devolver();
                return true;
            }
        }return false;
    }
}
