package isp.lab6.exercise1;

import java.util.*;
import java.util.HashMap;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        List<Student> students = new ArrayList<>();
        while (choice != 6) {
            System.out.println("Menu:");
            System.out.println("1. Add a student to the list");
            System.out.println("2. Remove a student from the list");
            System.out.println("3. Update a student's information");
            System.out.println("4. Calculate the average of a student");
            System.out.println("5. Display the list of students");
            System.out.println("6. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    Student stud = new Student(name,id);
                    System.out.println("Enter the number of subjects: ");
                    int number = scanner.nextInt();
                    for(int i = 1; i <= number;i++) {
                        System.out.print("Enter the subject: ");
                        String subject = scanner.next();
                        System.out.print("Enter the grade: ");
                        int grade = scanner.nextInt();
                        stud.addGrade(subject,grade);
                    }
                    scanner.nextLine();
                   students.add(stud);
                    break;
                case 2:
                    System.out.print("Enter index of the student: ");
                    int index1 = scanner.nextInt();
                    Student who3 = students.get(index1-1);
                    students.remove(who3);
                    break;
                case 3:
                        System.out.println("For who do you want to update?");
                        int ind = scanner.nextInt();
                        Student who = students.get(ind-1);
                        System.out.println("What do you want to update?");
                        int choice2 = 0;
                        while (choice2 != 4){
                            System.out.println("1.Name");
                            System.out.println("2.ID");
                            System.out.println("3.Grade");
                            System.out.println("4.Exit");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    System.out.print("The name to change to: ");
                                    String num = scanner.next();
                                    who.setName(num);
                                break;
                                case 2:
                                    System.out.print("The ID to change to: ");
                                    int id2 = scanner.nextInt();
                                    who.setID(id2);
                                break;
                                case 3:
                                    System.out.print("The grade to change to");
                                    int gr = scanner.nextInt();
                                    System.out.print("The subject:");
                                    String sub = scanner.next();
                                    who.addGrade(sub,gr);
                                case 4:
                                    System.out.println("Exiting");
                                break;
                                default:
                                    System.out.println("Wrong option");
                            }
                        }
                    break;
                case 4:
                    System.out.println("For who do you want to calculate the average? Enter the number: ");
                    for (Student student : students) {
                        System.out.println(student.getName());
                    }
                    int ind2 = scanner.nextInt();
                    Student who2 = students.get(ind2);
                    System.out.println("Average is: " + who2.getAverageGrade());
                    break;
                case 5:
                    System.out.println("Displaying the students: ");
                    for (Student s : students) {
                        System.out.println("Name: " + s.getName() + ", ID: " + s.getID());
                        HashMap<String, Integer> grades = s.getGrades();
                        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }



     /*
        Student student1 = new Student("Ana", 2);
        student1.addGrade("Math", 10);
        student1.addGrade("CS", 10);
        students.add(student1);
        Student student2 = new Student("Dana", 3);
        student2.addGrade("Math", 8);
        student2.addGrade("CS", 9);
        students.add(student2);
        Student student3 = new Student("Raul", 4);
        student3.addGrade("Math", 7);
        student3.addGrade("CS", 8);
        students.add(student3);
        Student student4 = new Student("Marian", 1);
        student4.addGrade("Math", 5);
        student4.addGrade("CS", 5);
        students.add(student4);

        students.remove(student2);

        student1.setName("Anamaria");
        student1.setID(6);
        student1.addGrade("Math", 9);

        System.out.println("Grades Average: " + student1.getAverageGrade());


        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", ID: " + s.getID());
            HashMap<String, Integer> grades = s.getGrades();
            for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        */
    }
}

