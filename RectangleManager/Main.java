package RectangleManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap width");
        double width=scanner.nextDouble();
        System.out.println("nhap height");
        double height=scanner.nextDouble();
        Rectangle rect=new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rect.display());
        System.out.println("Perimeter of the Rectangle: "+ rect.getperimeter());
        System.out.println("Area of the Rectangle: "+ rect.getarea());
    }
}
