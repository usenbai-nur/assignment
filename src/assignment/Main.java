package assignment;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equalsIgnoreCase("Male");
                List<Integer> grades = new ArrayList<>();
                for (int i = 4; i < parts.length; i++) {
                    grades.add(Integer.parseInt(parts[i]));
                }
                school.addMember(new Student(name, surname, age, gender, grades));
            }
        } catch (IOException e) {
            System.out.println("Error reading students file: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("teachers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String surname = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equalsIgnoreCase("Male");
                String subject = parts[4];
                int yearsOfExperience = Integer.parseInt(parts[5]);
                int salary = Integer.parseInt(parts[6]);
                Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
                if (yearsOfExperience > 10) {
                    teacher.giveRaise(10);
                }
                school.addMember(teacher);
            }
        } catch (IOException e) {
            System.out.println("Error reading teachers file: " + e.getMessage());
        }

        System.out.println(school.toString());
    }
}
