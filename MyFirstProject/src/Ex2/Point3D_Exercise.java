package Ex2;

public class Point3D_Exercise {
    public static void main(String[] args){
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Class cObj = Point3D.class;
        Point3D p3;
        System.out.println(cObj.toGenericString());
    }
}

class Point3D{
    int x,y,z;
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Point3D(){
        this(0,0,0);
    }
    public boolean equals(Object obj){
        if (obj instanceof Point3D){
            Point3D p = (Point3D)obj;
            return x==p.x && y==p.y && z==p.z;
        }
        return false;
    }
    public String toString(){
        return "["+x+","+y+","+z+"]";
    }
}
