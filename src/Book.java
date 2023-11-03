public class Book {

    private String name;
    private Author author;
    private float price;
    private final BookType type = BookType.BOOK;

    public Book()
    {
        name = "";
        author = new Author();
        price = 0.0f;
    }

    public Book(String name, Author author, float price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public BookType getType() {
        return type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

