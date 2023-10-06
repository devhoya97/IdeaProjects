package Ex1;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class ExceptionReThrowing {
    static int method1() throws MyException{
        try{
            throw new MyException("MyException happened");
        }catch(Exception e) {
            throw new MyException("re-throw");
        }
    }
    public static void main(String[] args){
        int a = 10;
        try{
            a = method1();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("MyException is processed in MAIN");
            System.out.println(a);
        }
    }
}
