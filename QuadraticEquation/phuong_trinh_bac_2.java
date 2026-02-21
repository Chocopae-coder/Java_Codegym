package QuadraticEquation;

public class phuong_trinh_bac_2 {
    double a, b, c;
    public phuong_trinh_bac_2(){

    }
    public phuong_trinh_bac_2( double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getdelta(){
        return b*b-4*a*c;
    }
    public double getroot1(){
        return (-b+Math.pow(getdelta(), 0.5))/(2*a);
    }
    public double getroot2(){
        return (-b-Math.pow(getdelta(), 0.5))/(2*a);
    }
}
