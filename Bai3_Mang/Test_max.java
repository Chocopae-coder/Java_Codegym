package Bai3_Mang;

public class Test_max {
    public static void main(String[] args) {
        int i=5;
        int j=7;
        int k = max(i,j);
        System.out.println("So lon nhat la: "+k);
    }
    public static int max(int num1, int num2){
        int result;
        if(num1>num2){
            result=num1;
        } else {
            result=num2;
        }
        return result;
    }
}
