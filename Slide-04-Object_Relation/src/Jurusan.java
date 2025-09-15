public class Jurusan {
    private String name;
    private String accreditation;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void tampilkanInfo() {
        System.out.println("Major : "+name);
        System.out.println("Accreditation : "+accreditation);
    }
}
