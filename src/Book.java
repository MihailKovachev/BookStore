import java.util.Objects;

public class Book {

    protected String title;
    protected Author author;
    protected float price;

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

    public String getName() {
        return title;
    }

    public void setName(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book that = (Book) o;
        return title.equals(that.title) && author.getName().equals(that.getAuthor().getName());
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }
}

