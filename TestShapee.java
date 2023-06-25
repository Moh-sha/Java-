mport java.util.Scanner;

public class TestShapee {
    public static void main(String[]args){

        Shape obj1 ;
        obj1 = new Rectangle();
        obj1.getArea();
        obj1.tostring();

        obj1= new Triangle();
        obj1.getArea();
        obj1.tostring();


    }
}



 abstract class Shape {
    Scanner in = new Scanner(System.in);

    private String color ;

   abstract void getArea();
   abstract void tostring();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


 class Rectangle extends Shape {

    int length , width , area1 ;

    @Override
    void getArea() {

        System.out.println(" give length ? ");
        length=in.nextInt();
        System.out.println(" give width  ? ");
        width=in.nextInt();
        area1 = length*width;


    }

    @Override
    void tostring() {
        System.out.println(" color name ? ");
        setColor(in.next());
        System.out.println(" AREA OF RECTANGLE : "+area1+" & COLOR :"+getColor()+"\n");

    }

}

 class Triangle extends Shape{

    int base , height ;
    double area2  ;

    @Override
    void getArea() {

        System.out.println(" give base ? ");
        base =in.nextInt();
        System.out.println(" give height  ? ");
        height=in.nextInt();
        area2 = (0.5*base*height);

    }

    @Override
    void tostring() {
        System.out.println(" color name ? ");
        setColor(in.next());
        System.out.println(" AREA OF TRIANGLE : "+area2+" & COLOR :"+getColor());
    }

}