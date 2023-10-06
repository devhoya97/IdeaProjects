package Ex1;

class Parent{
    int x =  100;
    Parent(){
        this.x = 200;
    }
    int getX(){
        return x;
    }
}

class Child extends Parent{
    int x =1000;
    int childOnlyMember = 999;
    Child(){
        this.x=2000;
    }
    int getX(){
        return x;
//        return childOnlyMember;
    }
}
class ParentTest {
    public static void main(String[] args){
        Child c = new Child();
        System.out.println("x ="+c.getX());
        Parent p = c;
        System.out.println("x ="+p.getX());

    }
}
