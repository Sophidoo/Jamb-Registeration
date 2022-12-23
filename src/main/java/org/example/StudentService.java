package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentService implements StudentInterface {

    public List<CourseModel> students= new ArrayList<>();
    @Override
    public String addStudent(String id, CourseModel student) {

        for(StudentModel stud : students){
            if(stud.getRegNo().equals(id)){
                return "Student with " + id + " already exists";
            }
        }

        CourseModel studentDetails = new CourseModel(student.getRegNo(), student.getFirstName(), student.getLastName(), student.getAge(), student.getCourseId(), student.getCourseName());
        students.add(studentDetails);
        return "Student details saved successfully";

    }

    @Override
    public List<CourseModel> viewAllStudents(CourseModel student) {
        return  students;
    }

    @Override
    public List<CourseModel> viewStudentById(String id, CourseModel student) {
        Stream<CourseModel> studentModelStream = students.stream().filter(stud -> stud.getRegNo().equals(id));
        return studentModelStream.toList();
    }

    @Override
    public String editStudent(String id, CourseModel student) {
        for(CourseModel stud : students){
            if(stud.getRegNo().equals(id)){
                stud.setFirstName(stud.getFirstName());
                stud.setLastName(stud.getLastName());
                stud.setAge(stud.getAge());
                stud.setCourseName(stud.getCourseName());
                return "Student Details edited successfully";
            }
        }

        return "Students with " + id + " does not exist";

    }

    @Override
    public List<CourseModel> viewStudentByCourse(String course, CourseModel student) {
        Stream<CourseModel> studentModelStream = students.stream().filter(stud -> stud.getCourseName().equals(course));
        return studentModelStream.toList();
    }

    @Override
    public List<CourseModel> viewStudentOfGivenMinimumAge(int age, CourseModel student) {
        Stream<CourseModel> studentModelStream = students.stream().filter(stud -> stud.getAge() >= age);
        return studentModelStream.toList();
    }
}
