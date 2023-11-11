import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class BookStore {

    private List<Book> books;

    public BookStore()
    {
        books = new ArrayList<>();
    }

    public void sell(Book book)
    {
        int available = book.getAvailable();
        if (available > 0)
        {
            book.setAvailable(available - 1);
            System.out.println("The book '" + book.getTitle() + "' authored by "
                    + book.getAuthor().getName() + " was just sold at " + book.getPrice() + " lev.");
        }
        else
        {
            System.out.println("There are no available copies of the book '" + book.getTitle() + "' authored by "
                    + book.getAuthor().getName() + ".");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
