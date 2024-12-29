package assignment;

import java.util.*;

public class Student extends Person {
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
