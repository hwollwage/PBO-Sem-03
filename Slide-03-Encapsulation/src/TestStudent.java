public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Hanzel", "244107020157", 19);

        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getStudentId());
        System.out.println("Age: " + s1.getAge());

        s1.study();
        s1.setAge(20);
        System.out.println("New Age: " + s1.getAge());
    }
}
