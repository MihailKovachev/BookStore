import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookStore store = new BookStore();
        Book exampleBook = new Book("Example Book", new Author("Example Author", 24), 23.99f);
        store.Add(exampleBook, 1);

        ComicBook exampleComicBook = new ComicBook("Example Comic Book", new Author("Example Author", 24), 23.99f, "Example Character");
        store.Add(exampleComicBook, 1);

        ChildrensBook exampleChildrensBook = new ChildrensBook("Example Children Book", new Author("Example Author", 24), 23.99f, 11);
        store.Add(exampleChildrensBook, 1);

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
                store.Add(new Book(title, new Author(authorName, authorAge), bookPrice), numberOfCopies);
            }
            else if (bookType.equalsIgnoreCase("CHILDRENS_BOOK")) {
                System.out.println("Enter the age the book is oriented towards: ");
                int bookAge = Integer.parseInt(sc.nextLine());

                store.Add(new ChildrensBook(title, new Author(authorName, authorAge), bookPrice, bookAge), numberOfCopies);
            }
            else if (bookType.equalsIgnoreCase("COMIC_BOOK"))
            {
                System.out.println("Enter the main character's name: ");
                String characterName = sc.nextLine();

                store.Add(new ComicBook(title, new Author(authorName, authorAge), bookPrice, characterName), numberOfCopies);
            }
            else {
                System.out.println("Not a valid book type.");
                continue;
            }

            System.out.println("Book added.");

        }

        store.Sell(exampleBook);
        store.Sell(exampleBook);

        store.Sell(exampleChildrensBook);
        store.Sell(exampleChildrensBook);

        store.Sell(exampleComicBook);
        store.Sell(exampleComicBook);

        // C# > Java
    }
}