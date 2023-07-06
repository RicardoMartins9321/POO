package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gradebook {

    private List<Student> students;

    public Gradebook() {
        students = new ArrayList<>();
    }

    public void load(String fileName) {
        try{
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] data = line.split("\\|");
                String name = data[0].trim();
                List<Double> grades = new ArrayList<>();

                for (int i = 1; i < data.length; i++) {
                    grades.add(Double.parseDouble(data[i].trim()));
                }
                students.add(new Student(name, grades)); 
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + fileName);
        }
    }
        
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String name) { 
        Student student = getStudent(name);
        if (student != null) {
            List<Double> grades = student.getGrades();
            IGradeCalculator calculator = new SimpleGradeCalculator();
            return calculator.calculate(grades);
        }

        return -1;
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Nome: " + student.getName());
        }
    }

    
}
