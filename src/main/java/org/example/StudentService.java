package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentService implements StudentInterface {

    public List<StudentModel> students= new ArrayList<>();
    @Override
    public String addStudent(String id, StudentModel student) {

        for(StudentModel stud : students){
            if(stud.getRegNo().equals(id)){
                return "Student with " + id + " already exists";
            }
        }

        StudentModel studentDetails = new StudentModel(student.getRegNo(), student.getFirstName(), student.getLastName(), student.getAge(), student.getCourse());
        students.add(studentDetails);
        return "Student details saved successfully";

    }

    @Override
    public List<StudentModel> viewAllStudents(StudentModel student) {
        return  students;
    }

    @Override
    public List<StudentModel> viewStudentById(String id, StudentModel student) {
        Stream<StudentModel> studentModelStream = students.stream().filter(stud -> stud.getRegNo().equals(id));
        return studentModelStream.toList();
    }

    @Override
    public String editStudent(String id, StudentModel student) {
        for(StudentModel stud : students){
            if(stud.getRegNo().equals(id)){
                stud.setFirstName(stud.getFirstName());
                stud.setLastName(stud.getLastName());
                stud.setAge(stud.getAge());
                stud.setCourse(stud.getCourse());
                return "Student Details edited successfully";
            }
        }

        return "Students with " + id + " does not exist";

    }

    @Override
    public List<StudentModel> viewStudentByCourse(String course, StudentModel student) {
        Stream<StudentModel> studentModelStream = students.stream().filter(stud -> stud.getCourse().equals(course));
        return studentModelStream.toList();
    }

    @Override
    public List<StudentModel> viewStudentOfGivenMinimumAge(int age, StudentModel student) {
        Stream<StudentModel> studentModelStream = students.stream().filter(stud -> stud.getAge() >= age);
        return studentModelStream.toList();
    }
}
