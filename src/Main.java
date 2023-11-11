import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookStore store = new BookStore();

        List<Book> books = store.getBooks();

        while (true)
        {
            System.out.println("Do you want to add a book (Yes/No)? ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("No"))
            {
                break;
            }
            else if (answer.equalsIgnoreCase("Yes"))
            {
            }
            else
            {
                System.out.println("Please enter either 'Yes' or 'No'.");
                continue;
            }

            System.out.println("Enter book title: ");
            String title = sc.nextLine();

            System.out.println("Enter author name: ");
            String authorName = sc.nextLine();

            System.out.println("Enter author age: ");
            int authorAge = Integer.parseInt(sc.nextLine());

            System.out.println("Enter number of copies: ");
            int numberOfCopies = Integer.parseInt(sc.nextLine());

            System.out.println("Enter book price: ");
            float bookPrice = Float.parseFloat(sc.nextLine());

            System.out.println("Enter book type (BOOK, CHILDRENS_BOOK, COMIC_BOOK): ");
            String bookType = sc.nextLine();

            if (bookType.equalsIgnoreCase("BOOK"))
            {
                books.add(new Book(title, new Author(authorName, authorAge), bookPrice));
                store.getBooks().get(books.size() - 1).setAvailable(numberOfCopies);
            }
            else if (bookType.equalsIgnoreCase("CHILDRENS_BOOK")) {
                System.out.println("Enter the age the book is oriented towards: ");
                int bookAge = Integer.parseInt(sc.nextLine());

                books.add(new ChildrensBook(title, new Author(authorName, authorAge), bookPrice, bookAge));
                store.getBooks().get(books.size() - 1).setAvailable(numberOfCopies);
            }
            else if (bookType.equalsIgnoreCase("COMIC_BOOK"))
            {
                System.out.println("Enter the main character's name: ");
                String characterName = sc.nextLine();

                books.add(new ComicBook(title, new Author(authorName, authorAge), bookPrice, characterName));
                store.getBooks().get(books.size() - 1).setAvailable(numberOfCopies);
            }
            else {
                System.out.println("Not a valid book type.");
                continue;
            }

            System.out.println("Book added.");

        }

        for (int i = 0; i < books.size(); ++i)
        {
            if (i % 2 == 0)
                store.sell(books.get(i));
        }

        // C# > Java
    }
}