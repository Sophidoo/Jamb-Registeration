package org.example;

import java.util.List;

public interface StudentInterface {

    public String addStudent(String id, StudentModel student);
    public List<StudentModel> viewAllStudents(StudentModel student);
    public List<StudentModel> viewStudentById(String id, StudentModel student);
    public String editStudent(String id, StudentModel student);
    public List<StudentModel> viewStudentByCourse(String course, StudentModel student);
    public List<StudentModel> viewStudentOfGivenMinimumAge(int age, StudentModel student);
}
