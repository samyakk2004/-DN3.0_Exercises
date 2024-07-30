package com.example;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("111", "Samyak Bhattacharya", "A+");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Rahul Agarwal");
        controller.setStudentGrade("B+");

        controller.updateView();
    }
}
