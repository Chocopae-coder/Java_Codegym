package Bai3_Mang;
import java.util.Scanner;

public class say_hello {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ten cua ban:");
    String name = scanner.nextLine();
    System.out.println("Hello "+name);
    scanner.close();
}
}
