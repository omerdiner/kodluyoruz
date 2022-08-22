package BookList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Hey", 100, "John", "2010"));
        books.add(new Book("Hey2", 200, "Nick", "1523"));
        books.add(new Book("Hey3", 30, "Helga", "1743"));
        books.add(new Book("Hey4", 400, "Marie", "1454"));
        books.add(new Book("Hey5", 130, "Bob", "1896"));
        books.add(new Book("Hey6", 60, "Nash", "1999"));
        books.add(new Book("Hey7", 40, "Tom", "1910"));
        books.add(new Book("Hey8", 350, "John", "2010"));
        books.add(new Book("Hey9", 202, "Kent", "2014"));
        books.add(new Book("Hey10", 520, "Oliver", "2010"));


        LinkedHashMap<String, String> book_author = new LinkedHashMap<>();
        books.stream().forEach(book -> book_author.put(book.getName(), book.getAuthor()));

        for (String book : book_author.keySet()) {
            System.out.println(book + " - " + book_author.get(book));
        }
        System.out.println("--------------------------------------");

        List<Book> list = books.stream().filter(book -> book.getPage() > 100).toList();

        list.stream().forEach(book -> System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getPage()));


    }
}
