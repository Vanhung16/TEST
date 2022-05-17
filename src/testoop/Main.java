/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    static ArrayList<Student> list = new ArrayList<Student>();
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student student = new Student();
        student.nhap();
        list.add(student);
        Student sv1 = new Student("Hung", 20, "Ung Hoa");
        Student sv2 = new Student("Hoang", 21, "Bac Giang");
        Student sv3 = new Student("Hieu", 22, "Soc Son");
        Student sv4 = new Student("Cuong", 19, "Thai Binh");
        Student sv5 = new Student("Van Hung", 21, "Ha Tay");
        Student sv6 = new Student("Xuan Hoang", 19, "Yen The");
        Student sv7 = new Student("Manh Hieu", 22, "Ha Tay");
        Student sv8 = new Student("Manh Hieu", 22, "Ha Tay");

        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);
        list.add(sv5);
        list.add(sv6);
        list.add(sv7);
       list.add(sv8);
//        list.add(sv8);

        student.Title();
        View(list);
        System.out.println(list.size());
        sortStudentToGroup();

    }

    public static void View(ArrayList<Student> list) {
        Iterator<Student> i = list.iterator();
        while (i.hasNext()) {
            Student sv = i.next();
            sv.xuat();
        }
    }

    public static void getRandomStudent(int totalStudentOfGroup, int totalGroup, Random rand) {
        for (int i = 0; i < totalGroup; i++) {
            ArrayList<Student> list = new ArrayList<>();

            for (int j = 0; j < totalStudentOfGroup; j++) {
                if (Main.list.size() > 0) {
                    int index = rand.nextInt(Main.list.size());
                    list.add(Main.list.get(index));
                    Main.list.remove(index);
                } else {
                    break;
                }
            }
            System.out.println("Danh sach sinh vien Gr " + (i + 1));
            View(list);
        }
    }

    public static void sortByNumberofStudent() {
        System.out.print("Nhap so sinh vien trong nhom: ");
        int members;
        int totalGroup;
        while (true) {
            try {
                int temp = sc.nextInt();
                if (temp <= 0) {
                    throw new Exception("Sai!Nhap lai members");
                }
                members = temp;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (members >= list.size()) {
            totalGroup = 1;
        } else if (list.size() % members == 0) {
            totalGroup = list.size() / members;
        } else {
            totalGroup = list.size() / members + 1;
        }

        getRandomStudent(members, totalGroup, rand);
    }

    public static void sortByNumberofGroup() {
        System.out.print("Nhap so nhom: ");
        int members;
        int totalGroup;
        while (true) {
            try {
                int temp = sc.nextInt();
                if (temp <= 0 || temp > list.size()) {
                    throw new Exception("Sai!Nhap lai Groups");
                }
                totalGroup = temp;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (totalGroup == list.size()) {
            members = 1;
        } else if (list.size() % totalGroup == 0) {
            members = list.size() / totalGroup;
        } else {
            members = list.size() / totalGroup + 1;
        }

        getRandomStudent(members, totalGroup, rand);
    }

    public static void sortStudentToGroup() {
        System.out.println("Bạn muốn phân nhóm như nào");
        System.out.println("1.Nhap so sinh vien trong nhom");
        System.out.println("2.Nhap so nhom");
        System.out.print("Nhap lua chon(1/2): ");
        int choose1;
        while (true) {
            try {
                int choose = sc.nextInt();
                if (choose <= 0 || choose > 2) {
                    throw new Exception("\nLua chon khong hop le, Nhap lai lua chon");
                }
                choose1 = choose;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (choose1) {
            case 1:
                sortByNumberofStudent();
                break;
            case 2:
                sortByNumberofGroup();
                break;
        }

    }

}
