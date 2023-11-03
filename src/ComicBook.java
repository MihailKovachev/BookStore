import java.sql.SQLOutput;

public class ComicBook extends Book{
    public static final BookType TYPE = BookType.COMIC_BOOK;
    private String characterName;

    public ComicBook()
    {
        super();
        characterName = "";
    }

    public ComicBook(String name, Author author, float price, String characterName) {
        super(name, author, price);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public float getPrice()
    {
        return getPrice(0.6f);
    }

    public float getPrice(float discount)
    {
        if (discount < 0.0f || discount > 1.0f)
        {
            throw new RuntimeException("Discount must be a value between 0 and 1");
        }

        return (1.0f - discount) * price;
    }

    public float getPrice(boolean printInfo)
    {
        if (!printInfo) { return getPrice(); }

        System.out.println("The comic book " + title + " authored by " + author.getName() +
                " has a price of " + getPrice() + " lev.");

        return getPrice();
    }
}
