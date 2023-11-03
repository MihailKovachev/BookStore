public class ChildrensBook extends Book {
    public static final BookType TYPE = BookType.CHILDRENS_BOOK;

    private int age;

    public ChildrensBook()
    {
        super();
        age = 0;
    }

    public ChildrensBook(String name, Author author, float price, int age)
    {
        super(name, author, price);

        if (age < 0)
        {
            throw new RuntimeException("Age must be non-negative.");
        }

        this.age = age;
    }

    @Override
    public float getPrice() {
        return (1.0f - 0.7f) * price;
    }

    public float getPrice(boolean printInfo)
    {
        if (!printInfo) { return getPrice(); }

        System.out.println("The comic book " + name + " authored by " + author.getName() +
                " has a price of " + getPrice() + " lev.");

        return getPrice();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
        {
            throw new RuntimeException("Age must be non-negative.");
        }

        this.age = age;
    }
}
