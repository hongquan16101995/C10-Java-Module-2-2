package bai20.singleton;

public class BookSingleton {
    private final String author;
    private final String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton(String author) {
        this.author = author;
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook(String author) {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton(author);
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
