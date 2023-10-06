package Ex1;

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i =0;

    void buy(Product p){
        if(money < p.price) {
            System.out.println("잔액이 부족하여"+p+"을/를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }
    void add(Product p){
        if (i >= cart.length){
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }
        cart[i++] = p;
    }

    void summary(){
        String cartList = "";
        int sum = 1000 - money;
        for(int j=0; j<i; j++){
            if(cart[j] instanceof Tv)
                cartList += "Tv, ";
            else if(cart[j] instanceof Computer)
                cartList += "Computer, ";
            else if(cart[j] instanceof Audio)
                cartList += "Audio, ";
        }
        System.out.println("구입한 물건:"+cartList);
        System.out.println("사용한 금액"+sum);
        System.out.println("남은 금액"+money);
    }
}

class TvExercise {
    public static void main(String[] args){
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
//    public static void main(String[] args){
//        Tv tv1 = new Tv();
//        System.out.println(tv1);
//        Tv tv2 = new Tv(10000);
//        System.out.println(tv2);
//    }
//    public static void main(String[] args){
//        MyTv2 tv = new MyTv2();
//        tv.setChannel(10);
//        tv.setVolume(20);
//        System.out.println("CH:"+tv.getChannel());
//        System.out.println("VOL:"+tv.getVolume());
//
//    }
//    public static void main(String[] args){
//        MyTv2 tv = new MyTv2();
//        tv.setChannel(10);
//        System.out.println("CH:"+ tv.getChannel());
//        tv.setChannel(20);
//        System.out.println("CH:"+ tv.getChannel());
//        tv.gotoPrevChannel();
//        System.out.println("CH:"+ tv.getChannel());
//        tv.gotoPrevChannel();
//        System.out.println("CH:"+ tv.getChannel());
//    }
}
