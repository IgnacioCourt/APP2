package Datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class CSVReader {

    public static void main(String... args) {
        List<Book> books = readBooksFromCSV("inventario APP2.txt");

        // let's print all the person read from CSV file
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static List<Book> readBooksFromCSV(String fileName) {
        List<Book> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Book book = createBook(attributes);

                // adding book into ArrayList
                books.add(book);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return books;
    }

    private static Book createBook(String[] metadata) {
        String id = metadata[0];
        String titulo = metadata[1];
        //int price = Integer.parseInt(metadata[2]);
        String autor = metadata[2];
        String anno = metadata[3];
        String estante_numero = metadata[4];
        String estante_seccion = metadata[5];
        String piso = metadata[6];
        String edificio = metadata[7];
        String sede = metadata[8];
        // create and return book of this metadata
        return new Book(id, titulo, autor, anno, estante_numero, estante_seccion, piso, edificio, sede);
    }

}