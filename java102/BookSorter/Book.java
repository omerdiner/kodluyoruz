package BookSorter;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int pages;
    private String releaseDate;

    public Book(String name, String author, int pages, String releaseDate) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
