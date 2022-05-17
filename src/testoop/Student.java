/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private String studentCode;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super(name, age, address);
        Random rand = new Random();
        this.studentCode = "SV_" + rand.nextInt(100);
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("%15s%n", getStudentCode());
    }

    public static void Title() {
        Person.Title();
        System.out.printf("%15s%n", "STUDENT CODE");

    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Random rand = new Random();
        setStudentCode("SV_" + rand.nextInt(100));
    }

}
