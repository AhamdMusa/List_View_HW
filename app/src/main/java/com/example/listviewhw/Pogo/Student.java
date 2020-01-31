package com.example.listviewhw.Pogo;

import java.util.ArrayList;

public class Student {
    private String StudentName, studentID;
    private int image;

    public Student() {

    }

    public Student(String studentName, String studentID, int image) {
        StudentName = studentName;
        this.studentID = studentID;
        this.image = image;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<Student> getAllStudent(){
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("kjhgkljgh","rcoi34y9",65765765));
        arrayList.add(new Student("gfgdf","rcoi34y9",65765765));
        arrayList.add(new Student("kjhggrgrkljgh","rcoi34y9",65765765));
        arrayList.add(new Student("kjhgvfssagaskljgh","rcoi34y9",65765765));
        arrayList.add(new Student("dsgsgaa","rcoi34y9",65765765));
        arrayList.add(new Student("kjhgasgveterkljgh","rcoi34y9",65765765));
        return arrayList;
    }
}

