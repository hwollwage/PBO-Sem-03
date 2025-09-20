package Tugas;

public class Member {
    private String name;
    private String id;
    private Book[] borrowedBooks;
    private int borrowedCount = 0;

    public Member(String name, String id, int maxBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new Book[maxBooks];
    }

    public void setName(String name) {this.name = name;}
    public void setId(String id) {this.id = id;}

    public String getName() {return name;}
    public String getId() {return id;}

    public void borrowBook(Book book) {
        if(!book.isAvailable()) {
            System.out.println("Sorry, the book "+book.getTitle()+" is already borrowed");
        }
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount] = book;
            borrowedCount++;
            book.setAvailable(false);
            System.out.println(name + " successfully borrowed " + book.getTitle());
        } else {
            System.out.println("Borrow limit reached! " + name + " cannot borrow more books.");
        }
    }

    public String info() {
        String info = "Member: " + name + " (ID: " + id + ")\nBorrowed Books:\n";
        if (borrowedCount == 0) {
            info += "- None\n";
        } else {
            for (int i = 0; i < borrowedCount; i++) {
                Book b = borrowedBooks[i];
                info += "- " + b.getTitle() + " (" + b.getYear() + ")\n";
            }
        }
        return info;
    }
}
