package assignment;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender ? "Male" : "Female";
    }

    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + gender + ".";
    }
}
