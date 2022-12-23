package org.example;

import java.util.List;

public interface StudentInterface {

    public String addStudent(String id, CourseModel student);
    public List<CourseModel> viewAllStudents(CourseModel student);
    public List<CourseModel> viewStudentById(String id, CourseModel student);
    public String editStudent(String id, CourseModel student);
    public List<CourseModel> viewStudentByCourse(String course, CourseModel student);
    public List<CourseModel> viewStudentOfGivenMinimumAge(int age, CourseModel student);
}
