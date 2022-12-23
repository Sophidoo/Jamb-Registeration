package org.example;

public class CourseModel extends StudentModel{
    private String courseId;
    private String courseName;

    public CourseModel() {}

    public CourseModel(String regNo, String firstName, String lastName, int age, String courseId, String courseName) {
        super(regNo, firstName, lastName, age);
        this.courseId = courseId;
        this.courseName = courseName;
    }


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return output() +
                "\nCourse Id: " + courseId +
                "\nCourse Name: " + courseName;
    }
}
