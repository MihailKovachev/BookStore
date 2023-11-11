import java.util.Objects;

public class Book {

    protected String title;
    protected Author author;
    protected float price;

    protected int available;

    protected int hashCode;
    public static final BookType TYPE = BookType.BOOK;

    public Book()
    {
        title = "";
        author = new Author();
        price = 0.0f;

        hashCode = Objects.hash(title, author.getName());
    }

    public Book(String name, Author author, float price)
    {
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

}

