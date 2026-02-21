package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a, b, c: ");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        phuong_trinh_bac_2 giai_pt=new phuong_trinh_bac_2(a, b, c);
        if(giai_pt.getdelta()<0){
            System.out.println("phuong trinh vo nghiem");
        } else if(giai_pt.getdelta()==0){
            System.out.printf("phuong trinh co 1 nghiem la: "+String.format("%.4f",giai_pt.getroot1()));
        } else {
            System.out.printf("phuong trinh co 2 nghiem la: "+String.format("%.3f",giai_pt.getroot1())+" va "+String.format("%.3f",giai_pt.getroot2()));
        }
    }
}
