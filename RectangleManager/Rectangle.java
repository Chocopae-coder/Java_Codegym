package RectangleManager;

public class Rectangle {
    double width, height;
    public Rectangle(){

    }
    public Rectangle( double width, double height){
        this.width = width;
        this.height=height;
    }
    public double getarea(){
        return width*height;
    }
    public double getperimeter(){
        return (width+height)*2;
    }
    public String display(){
        return "Rectangle {"+"width: "+width+" height: "+ height+" }";
    }
}
