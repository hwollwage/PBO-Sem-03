package Tugas;

public class Author {
    private String name;
    private String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public void setName(String name) {this.name = name;}
    public void setNationality(String nationality) {this.nationality = nationality;}
    public String getName() {return name;}
    public String getNationality() {return nationality;}

    public String info() {
        return "Author : "+name+" ("+nationality+")";
    }
}
