package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        //the authors object
        Author a1 = new Author("J.K. Rowling", "UK");
        Author a2 = new Author("Haruki Murakami", "Japan");

        //the books object
        Book b1 = new Book("Harry Potter", a1, 1997);
        Book b2 = new Book("Kafka on the Shore", a2, 2002);

        //library max 5 book
        Library lib = new Library("Malang City Library", 5);
        lib.addBook(b1);
        lib.addBook(b2);

        //show book before borrow
        lib.showBooks();

        //library members
        Member m1 = new Member("Hanzel", "ID001", 3);
        Member m2 = new Member("Putra", "ID002", 3);

        //borrow
        System.out.println("\n=== Borrowing Process ===");
        m1.borrowBook(b1);
        m2.borrowBook(b1);
        m2.borrowBook(b2);

        //show book after borrow
        System.out.println("\n=== Library After Borrowing ===");
        lib.showBooks();

        System.out.println("\n" + m1.info());
        System.out.println(m2.info());
    }
}

