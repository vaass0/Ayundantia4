public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro(String titulo, String autor,String genero, String isbn, int cantidadDisponible, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean prestar(){
        int cantidad = getCantidadDisponible() - 1;
        if ( cantidad> 0){
            setCantidadDisponible(cantidad);
            return true;
        }else if(cantidad == 0){
            setCantidadDisponible(cantidad);
            setDisponible(false);
            return true;
        }
        return false;
    }
    public boolean devolver(){
        int cantidad = getCantidadDisponible() + 1;
        if(cantidad == 1){
            setCantidadDisponible(cantidad);
            setDisponible(true);
            return true;
        }else if (cantidad > 1){
            setCantidadDisponible(cantidad);
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Titulo: "+this.titulo+"Autor: "+this.autor+"Genero: "+this.genero+"ISBN: "+this.isbn+"Cantidad: "+this.cantidadDisponible+"Disponibilidad: "+this.disponible;
    }
    public void mostrarInfo(){
        System.out.println(toString());
    }


}
