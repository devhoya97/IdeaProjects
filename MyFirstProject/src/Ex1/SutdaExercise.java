package Ex1;

public class SutdaExercise {
    public static void main(String[] args){
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.CARD_NUM; i++){
            System.out.printf(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
//        System.out.println(Deck.pick(1));
//        System.out.println(Deck.cards[1]);
        SutdaCard card1 = new SutdaCard(3,true);
        SutdaCard card2 = new SutdaCard(3,true);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card1.equals(card2));


    }
}
