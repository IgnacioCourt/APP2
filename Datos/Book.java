package Datos;

public class Book {
    public int id;
    public String titulo;
    public String autor;
    public int anno;
    public int estante_numero;
    public String estante_seccion;
    public int piso;
    public String edificio;
    public String sede;

    // Constructor
    public Book(String idBook,String title,String author,String year,String shelf_number, String shelf_section,String floor,String building,String office){
        id = idBook;
        titulo = title;
        autor = author;
        anno = year;
        estante_numero = shelf_number;
        estante_seccion = shelf_section;
        piso = floor;
        edificio  = building;
        sede = office;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnno() {
        return this.anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getEstante_numero() {
        return this.estante_numero;
    }

    public void setEstante_numero(String estante_numero) {
        this.estante_numero = estante_numero;
    }

    public String getEstante_seccion() {
        return this.estante_seccion;
    }

    public void setEstante_seccion(String estante_seccion) {
        this.estante_seccion = estante_seccion;
    }

    public String getPiso() {
        return this.piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getEdificio() {
        return this.edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
