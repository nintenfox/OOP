package print;

public class Book implements Printable {
    private String book_title;
    private String author;

    public Book(String book_title, String author) {
        this.book_title = book_title;
        this.author = author;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + book_title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Book title is " + getBook_title() + " and Author is " + getAuthor());
    }
}
