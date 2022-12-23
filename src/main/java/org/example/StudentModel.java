package org.example;

public class StudentModel {
    private String regNo;
    private String firstName;
    private  String lastName;
    private int age;

    public StudentModel(){}

    public StudentModel(String regNo, String firstName, String lastName, int age) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String output() {
        return
                "\n\nJamb Reg No.: " + regNo +
                "\nFull Name: " + firstName + " " + lastName +
                "\nAge: " + age;
    }
}
