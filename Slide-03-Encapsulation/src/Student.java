public class Student {
    private String name;
    private String studentId;
    private int age;

    public Student(String name, String studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 5 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    public void study() {
        System.out.println(name + " is studying.");
    }
}
