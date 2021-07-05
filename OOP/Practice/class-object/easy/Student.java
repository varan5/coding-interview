package com.company;

import java.util.Date;

public class Student {
    private int studentUniqueId;
    private int age;
    private int rollNumber;
    private int studentRecordGrade;
    private boolean isFeesPaid;
    private double currentYearFees;
    private String firstName;
    private String lastName;
    private String middleName;
    private String currentClass;
    private String gender;
    private Date dateOfBirth;
    private Date dateOfAdmission;

    public int getStudentUniqueId() {
        return studentUniqueId;
    }

    public void setStudentUniqueId(int studentUniqueId) {
        this.studentUniqueId = studentUniqueId;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getStudentRecordGrade() {
        return studentRecordGrade;
    }

    public void setStudentRecordGrade(int studentRecordGrade) {
        this.studentRecordGrade = studentRecordGrade;
    }

    public boolean isFeesPaid() {
        return isFeesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        isFeesPaid = feesPaid;
    }

    public double getCurrentYearFees() {
        return currentYearFees;
    }

    public void setCurrentYearFees(double currentYearFees) {
        this.currentYearFees = currentYearFees;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student(int studentUniqueId, int age, int rollNumber, int studentRecordGrade, boolean isFeesPaid, double currentYearFees, String firstName, String lastName, String middleName, String currentClass, String gender, Date dateOfBirth, Date dateOfAdmission) {
        this.studentUniqueId = studentUniqueId;
        this.age = age;
        this.rollNumber = rollNumber;
        this.studentRecordGrade = studentRecordGrade;
        this.isFeesPaid = isFeesPaid;
        this.currentYearFees = currentYearFees;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.currentClass = currentClass;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAdmission = dateOfAdmission;
    }
}
