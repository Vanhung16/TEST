/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

import java.util.Scanner;

public class Person implements IStudent {

    protected String name;
    protected int age;
    protected String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
//    static Scanner sc = new Scanner(System.in);

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        setName(sc.nextLine());
        while (true) {
            try {
                System.out.print("Nhap tuoi: ");
                int age = sc.nextInt();
                if (age <= 0) {
                    throw new Exception("Tuoi khong hop le! Nhap lai");
                }
                setAge(age);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhap dia chi: ");sc.nextLine();
        setAddress(sc.nextLine());
    }

    public static void Title() {
        System.out.printf("%10s %10s %10s", "NAME", "AGE", "ADDRESS");

    }

    @Override
    public void xuat() {
        System.out.printf("%10s %10s %10s", getName(), getAge(), getAddress());
    }

}
