package org.example;

import java.util.Scanner;

public class StudentView {
    static Scanner input = new Scanner(System.in);

    public void StudentConsole(){
        StudentService studentfunc = new StudentService();
        CourseModel student = new CourseModel();
        Scanner input = new Scanner(System.in);

        String proceed = "yes";

        System.out.println("|========================================================================|");
        System.out.println("|======================== JAMB REGISTERATION FORM =======================|");
        System.out.println("|========================================================================|");

        while (proceed.equalsIgnoreCase("yes")){

            System.out.println();
            System.out.println("<<1>> Add Students ");
            System.out.println("<<2>> View All Students ");
            System.out.println("<<3>> View student By Id");
            System.out.println("<<4>> Edit student");
            System.out.println("<<5>> View students by course");
            System.out.println("<<6>> View Students of required minimum age");
            System.out.println("<<7>> Exit");

            int response = optionValidation();

            if(response == 1){
                System.out.println();
                System.out.println(">> Please enter the Student's Registeration Number");
                student.setRegNo(input.next());
                System.out.println(">> Please enter the Student's First Name");
                student.setFirstName(input.next());
                System.out.println(">> Please enter the Student's Last Name");
                student.setLastName(input.next());
                System.out.println(">> Please enter the Student's age");
                student.setAge(input.nextInt());
                System.out.println(">> Please enter the Student's Course Name");
                student.setCourseName(input.next());
                student.setCourseId(student.getCourseName().substring(0,2).toUpperCase() + Math.round(Math.random()));
                System.out.println();
                System.out.println(studentfunc.addStudent(student.getRegNo(), student));
            }
            else if(response == 2){
                System.out.println();
                System.out.println(studentfunc.viewAllStudents(student));
            }
            else if(response == 3){
                System.out.println();
                System.out.println(">>> Please Enter the Student's id");
                String id = input.next();
                System.out.println(studentfunc.viewStudentById(id, student));
            }
            else if(response == 4){
                System.out.println();
                System.out.println(">>> Please Enter the Student's Registration number you want to edit");
                String id = input.next();
                System.out.println(">> Please enter the Student's First Name");
                student.setFirstName(input.next());
                System.out.println(">> Please enter the Student's Last Name");
                student.setLastName(input.next());
                System.out.println(">> Please enter the Student's age");
                student.setAge(input.nextInt());
                System.out.println(">> Please enter the Student's Course Id");
                student.setCourseId(input.next());
                System.out.println(">> Please enter the Student's Course Name");
                student.setCourseName(input.next());
                System.out.println();
                System.out.println(studentfunc.editStudent(id, student));
            }
            else if(response == 5){
                System.out.println();
                System.out.println(">>> Please enter the course");
                String course = input.next();
                System.out.println(studentfunc.viewStudentByCourse(course, student));
            }
            else if(response == 6){
                System.out.println();
                System.out.println(">>> Please Enter the minimum Age");
                int age = input.nextInt();
                System.out.println(studentfunc.viewStudentOfGivenMinimumAge(age, student));
            }


            if(response == 7){
                System.out.println("Thank you");
                proceed = "no";

            }
            else{
                System.out.println("\nDo you want to continue?");
                proceed = input.next();
            }
        }


    }
    public static int optionValidation(){
        int response = input.nextInt();
        while(response < 1 || response > 7){
            System.out.println("Please Input a valid number");
            response = input.nextInt();
        }

        return  response;
    }
}
