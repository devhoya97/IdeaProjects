package Ex2;

public class MathTest {
    static double round(double val, int num){
        return Math.round(val*Math.pow(10,num))/(Math.pow(10,num));
    }
    public static void main(String[] args){
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
