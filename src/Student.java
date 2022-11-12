import java.util.Random;

public class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void guessingAge(){
    Random randomNumber = new Random();
    int random = randomNumber.nextInt(35);
    System.out.println("Random number is: " + random);

    if(random == this.age){
        System.out.println("Random number is equal to Student's age.");
    }else if (random > this.age) {
        System.out.println("Random number is great than Student's age.");
    }else{
        System.out.println("Random number is small than Student's age.");
    }
    }
}
