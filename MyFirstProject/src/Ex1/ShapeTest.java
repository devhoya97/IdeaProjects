package Ex1;

abstract class Shape{
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea();

    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }
}
class Point implements Cloneable{
    int x,y;
    Point(){
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "["+x+","+y+"]"+hashCode();
    }
    public Point clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
        return (Point)obj;
    }
    void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape implements Cloneable{
    double r;
//    static final double PI = 3.141592;
    Circle(){
        this(new Point(),1);
    }
    Circle(double r){
        this(new Point(), r);
    }
    Circle(Point p){
        this(p, 1);
    }
    Circle(Point p, double r){
        super(p);
        this.r = r;
    }
    public String toString(){
        return p.toString() +"r : "+r;
    }
    @Override
    double calcArea() {
        return Math.PI*r*r;
    }
    public Circle clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
        return (Circle)obj;
    }
}

class Rectangle extends Shape{
    double width, height;
    Rectangle(){
        this(1,1);
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    double calcArea(){
        return width*height;
    }
    boolean isSquare(){
        return width == height;
    }

}
public class ShapeTest {
    static double sumArea(Shape[] arr){
        double sum = 0;
        for(Shape s : arr){
            sum += s.calcArea();
        }
        return sum;
    }
    public static void main(String[] args){
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합 : "+sumArea(arr));

        Point p1 = new Point(1,2);
        Point p2 = p1.clone();
        p2.setPoint(10,20);
        System.out.println(p1);
        System.out.println(p2);

        Circle c1 = new Circle(p1, 1);
        Circle c2 = c1.clone();
        c2.p.x = 100;
        c2.p.y = 200;
        c2.r = 100;
        System.out.println(c1);
        System.out.println(c2);
    }

}
