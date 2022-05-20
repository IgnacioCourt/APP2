package Datos;


import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

    private String nombre;
    private File internalFile;

    public Archivo(String nombre) {
        this.nombre = nombre;
        internalFile = new File(nombre);
    }

    public List<Book> leerDatos() throws IOException {
        List<Book> libros = new ArrayList<Book>();
        File r = new File("./Ejemplo.txt");
        r.createNewFile();
        Scanner obj = null;
        try {
            obj = new Scanner(internalFile);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe!");
        } finally {
            System.out.println("Adios!");
        }
        return libros;
    }
}
