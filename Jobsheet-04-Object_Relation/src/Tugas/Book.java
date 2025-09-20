package Tugas;

public class Book {
    private String title;
    private Author author;
    private int year;
    private boolean available = true;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(Author author) {this.author = author;}
    public void setYear(int year) {this.year = year;}
    public void setAvailable(boolean available) {this.available = available;}

    public String getTitle() {return title;}
    public Author getAuthor() {return author;}
    public int getYear() {return year;}
    public boolean isAvailable() {return available;}

    public String info() {
        String status = available ? "Available" : "Borrowed";
        return "Book : "+title+" ("+year+") ["+status+"]\n"+author.info();
    }
}
