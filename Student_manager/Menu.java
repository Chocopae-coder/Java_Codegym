package studentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Nên tách 2 loại input
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    StudentManager studentManager = new StudentManager(); // quản lý dữ liệu (CRUD danh sách Students)

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("============ Student Manager ============");
            System.out.println("1.Add Student");
            System.out.println("2.Edit Student");
            System.out.println("3.Remove Student");
            System.out.println("4.Get All");
            System.out.println("5.Get Detail Student");
            System.out.println("6.Find by name");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showEditMenu();
                    break;
                case 3:
                    showRemoveMenu();
                    break;
                case 4:
                    getAllMenu();
                    break;
                case 5:
                    getDetailMenu();
                    break;
                case 6:
                    getByNameMenu();
                    break;
                case 0:
                    System.out.println("Goodbye! See you again.");
                    break;
                default:
                    System.out.println("Invalid choice! Pls try again.");
            }
        } while (choice != 0);
    }

    public void getByNameMenu() {
        System.out.println("============ Search ============");
        System.out.println("Enter keyword: ");
        String keyword = inputStr.nextLine();
        ArrayList<Student> list = studentManager.getByNameContains(keyword);
        System.out.println("List Student found by key '" + keyword + "': ");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public void getDetailMenu() {
        System.out.println("============ Detail Student ============");
        System.out.println("Enter student id: ");
        int id = inputNumber.nextInt();
        Student student = studentManager.getById(id);
        System.out.println(student);
    }

    public void showEditMenu() {
        System.out.println("============ Edit Student ============");
        System.out.println("Enter student edit id: ");
        int idEdit = inputNumber.nextInt();
        System.out.println("Enter student name: ");
        String name = inputStr.nextLine();
        System.out.println("Enter student gender: ");
        String gender = inputStr.nextLine();
        Student newStudent = new Student(idEdit, name, gender);
        studentManager.update(idEdit, newStudent);
        System.out.println("Edit Successfully!");
    }

    public void showRemoveMenu() {
        System.out.println("============ Remove Student ============");
        System.out.println("Enter remove id: ");
        int removeId = inputNumber.nextInt();
        studentManager.remove(removeId);
        System.out.println("Remove Successfully");
    }

    public void getAllMenu() {
        ArrayList<Student> list = studentManager.getAll();
        System.out.println("List Student: ");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public void showAddMenu() {
        System.out.println("============ Add Student ============");
        System.out.println("Enter student id: ");
        int id = inputNumber.nextInt();
        System.out.println("Enter student name: ");
        String name = inputStr.nextLine();
        System.out.println("Enter student gender: ");
        String gender = inputStr.nextLine();
        Student newStudent = new Student(id, name, gender);
        studentManager.add(newStudent); // yêu cầu 1 student là dữ liệu từ người dùng.
        System.out.println("Add Successfully!");
    }
}

/*
Luyện tập lại bài quản lý hoàn chỉnh như trên.
Bài tập tập quản lý Product (id, price, name, quantity)
Thực hiện xây menu có các tính năng sau:
+ CRUD sản phẩm
+ Tìm theo tên gần đúng.
+ Tìm theo khoảng giá.
+ Tìm theo id.
+ Tìm theo khoảng số lượng
+ Tìm sản phẩm có giá lớn nhất
+ Tìm sản phẩm có giá và số lượng nhỏ nhất.

 */