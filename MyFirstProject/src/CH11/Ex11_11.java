package CH11;
import java.util.*;
class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj){
        if (obj instanceof SutdaCard){
            SutdaCard tmp = (SutdaCard) obj;
            return num == tmp.num && isKwang == tmp.isKwang;
        }
        return false;
    }
    public int hashCode(){
        return toString().hashCode();
    }
    public String toString(){
        return num+(isKwang? "K" : "");
    }
}

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    int pos = 0;
    HashMap jokbo = new HashMap();
    SutdaDeck(){
        for(int i=0; i<cards.length; i++){
            int num = i%10 + 1;
            boolean isKwang = i < 10 && (num==1 || num==3 || num==8);
            cards[i] = new SutdaCard(num, isKwang);
        }
        registerJokbo();
    }
    void registerJokbo(){
        jokbo.put("KK", 4000);
        for(int i=1; i<=10; i++){
            jokbo.put(i+""+i, 3000+10*i);
        }
        jokbo.put("12", 2060);
        jokbo.put("21", 2060);
        jokbo.put("14", 2050);
        jokbo.put("41", 2050);
        jokbo.put("19", 2040);
        jokbo.put("91", 2040);
        jokbo.put("110", 2030);
        jokbo.put("101", 2030);
        jokbo.put("410", 2020);
        jokbo.put("104", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }
    int getPoint(Player p){
        if (p == null)
            return 0;
        SutdaCard c1 = p.c1;
        SutdaCard c2 = p.c2;
        int point = 0;
        if (c1.isKwang && c2.isKwang)
            point = (int) jokbo.get("KK");
        else {
            if (jokbo.get(c1.toString() + c2.toString()) == null)
                point = (c1.num + c2.num) % 10 + 1000;
            else
                point = (int) jokbo.get(c1.toString() + c2.toString());
        }
        p.point = point;
        return point;
    }
    SutdaCard pick() throws Exception{
        SutdaCard c= null;

        if (0 <= pos && pos < CARD_NUM){
            c = cards[pos];
            cards[pos++] = null;
        }
        else{
            throw new Exception("남아있는 카드가 없습니다.");
        }
        return c;
    }

    void shuffle(){
        for (int x=0; x < CARD_NUM*2; x++){
            int i = (int)(Math.random()*CARD_NUM);
            int j = (int)(Math.random()*CARD_NUM);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}
class Player{
    String name;
    SutdaCard c1;
    SutdaCard c2;
    int point;
    Player(String name, SutdaCard c1, SutdaCard c2){
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }
    public String toString(){
        return "["+name+"]"+c1.toString()+", "+c2.toString();
    }
}
public class Ex11_11 {
    public static void main(String[] args) throws Exception{
        SutdaDeck deck = new SutdaDeck();
        deck.shuffle();
        Player[] pArr = {
                new Player("타짜", deck.pick(), deck.pick()),
                new Player("고수", deck.pick(), deck.pick()),
                new Player("물주", deck.pick(), deck.pick()),
                new Player("중수", deck.pick(), deck.pick()),
                new Player("하수", deck.pick(), deck.pick()),
        };
        TreeMap rank = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Player && o2 instanceof Player){
                    Player tmp1 = (Player) o1;
                    Player tmp2 = (Player) o2;
                    return tmp2.point - tmp1.point;
                }
                return 0;
            }
        });
        for (int i=0; i<pArr.length; i++){
            deck.getPoint(pArr[i]);
            rank.put(pArr[i], pArr[i].point);
        }
        Set set = rank.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Player p = (Player)e.getKey();
            System.out.println(p.toString()+" "+p.point);
        }
    }
}
