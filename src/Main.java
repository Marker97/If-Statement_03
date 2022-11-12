public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marcus", 25);
        System.out.println("Student: " + student.getName() + "\nAge : " + student.getAge());
        student.guessingAge();
    }
}