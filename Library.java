import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available");
            return;
        }

        for (Book b : books) {
            System.out.println("ID : " + b.id);
            System.out.println("Title : " + b.title);
            System.out.println("Author : " + b.author);
            System.out.println("Status : " + (b.issued ? "Issued" : "Available"));
            System.out.println("--------------------");
        }
    }

    public void searchBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                System.out.println("Book Found");
                System.out.println(b.title);
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Already Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book Returned");
                } else {
                    System.out.println("Book Already Available");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }
}