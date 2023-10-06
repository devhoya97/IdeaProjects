package Ex1;

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
    }
}

class Marine extends Unit{
    void move(int x, int y){}
    void stimpac(){}
}

class Tank extends Unit{
    void move(int x, int y){}
    void changeMode(){}
}

class Dropship{
    void move(int x, int y){}
    void load(){}
    void unload(){}
}

public class UnitTest {
    public static void main(String[] args){
        Marine m1 = new Marine();
        Tank t1 = new Tank();
        Dropship d1 = new Dropship();
        System.out.println(m1+"\n"+t1+"\n"+d1);
    }
}
