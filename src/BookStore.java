import java.util.HashMap;
import java.util.Hashtable;

public class BookStore {

    // HashMap вместо ArrayList, защото е много по-добро в този случай
    private HashMap<Book, Integer> books;

    public BookStore()
    {
        books = new HashMap<>();
    }

    public void Add(Book book, int numberOfCopies)
    {
        if(!books.containsKey(book))
        {
            books.put(book, numberOfCopies);
            return;
        }

        books.put(book, books.get(book) + numberOfCopies);
    }

    public void Sell(Book book)
    {
        if(!books.containsKey(book))
        {
            throw new RuntimeException("No such book.");
        }

        if (books.get(book) > 0)
        {
            books.put(book, books.get(book) - 1);
            System.out.println("The book '" + book.getName() + "' authored by "
                    + book.getAuthor().getName() + " was just sold at " + book.getPrice() + " lev.");
        }
        else
        {
            System.out.println("There are no available copies of the book '" + book.getName() + "' authored by "
                    + book.getAuthor().getName() + ".");
        }
    }
}
