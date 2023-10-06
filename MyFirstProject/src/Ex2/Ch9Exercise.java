package Ex2;

class Card{
    int num;
    String kind;
    Card(){
        this(1,"SPADE");
    }
    Card(int num, String kind){
        this.num = num;
        this.kind = kind;
    }
    public String toString(){
        return num+" "+kind;
    }
}

public class Ch9Exercise {
    public static void main(String[] args){
        Card c = new Card();
        System.out.println(c);
    }
}
