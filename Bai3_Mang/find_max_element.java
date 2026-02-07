package Bai3_Mang;

import java.util.Scanner;

public class find_max_element {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do { 
            System.out.print("nhap size cua mang");
            size=scanner.nextInt();
            if(size>20){
                System.out.print ("nhap size nho hon 20");
            }
        } while (size >20);
        array= new int[size];
        for (int i=0; i< array.length;i++){
            System.out.print ("nhap phan tu: "+ (i+1)+" la: ");
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        int index=0;
        for (int i=0; i < array.length; i++){
            if(max<array[i]){ 
                max=array[i];
                index=i+1;
            }
        }
        System.out.print("gia tri lon nhat la: "+ max+" vi tri so: "+index);
    }
}
