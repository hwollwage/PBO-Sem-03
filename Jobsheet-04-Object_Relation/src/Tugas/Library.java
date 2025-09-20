package Tugas;

public class Library {
    private String name;
    private Book[] books;
    private int bookCount = 0;

    public Library(String name, int maxBooks) {
        this.name = name;
        this.books = new Book[maxBooks];
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].info());
        }
    }
}
