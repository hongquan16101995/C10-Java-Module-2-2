package bai20.singleton;

public class Main {
    public static void main(String[] args) {
        BookBorrow bookBorrow = new BookBorrow();
        bookBorrow.borrowBook();
        System.out.println(bookBorrow.getAuthorAndTitle());
        bookBorrow.returnBook();
        System.out.println(bookBorrow.getAuthorAndTitle());
        BookSingleton bookSingleton = BookSingleton.borrowBook("Hi");
        try {
            System.out.println(bookSingleton.getAuthorAndTitle());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
