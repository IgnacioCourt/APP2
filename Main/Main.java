package Main;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*public class bookss {

    static final public void main(String... javautodidacta) {
    String archCSV = "books.csv";
    CSVReader csvReader = new CSVReader(new FileReader(archCSV));
    String[] fila = null;
    while((fila = csvReader.readNext()) != null) {
        System.out.println(fila[0]
                  + " | " + fila[1]
                  + " |  " + fila[2]);
    }

    csvReader.close();
    }
}*/



class Main {
    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        List<Book> books = reader.readBooksFromCSV("inventario APP2.csv");
        // Ahora se imprimen los libros del csv:
        for (Book b : books) {
            System.out.println(b.getTitulo());
        }
    }
}
