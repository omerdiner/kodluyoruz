package BookSorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> byName = new TreeSet<>();
        TreeSet<Book> byPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPages() - o2.getPages();
            }
        });
        Book[] books = {new Book("Aaa", "Default", 500, "2001"), new Book("Bbb", "Noname", 432, "2004"),
                new Book("Omer", "Diner", 240, "2012"), new Book("Aba", "JR", 672, "1980"), new Book("Z", "Hulk", 100, "2020")};

        byName.addAll(Arrays.asList(books));
        byPage.addAll(Arrays.asList(books));

        System.out.println("------BY NAME-----");
        for (Book b : byName) {
            System.out.println(b.toString());
        }
        System.out.println("--------BY PAGE------");
        for(Book b:byPage){
            System.out.println(b.toString());
        }

    }
}
