package Ex1;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i<cards.length; i++){
            int num = i%10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    void shuffle(){
        for(int i=0; i<cards.length; i++){
            int randNum = (int)(Math.random()*cards.length);
            SutdaCard tmp = new SutdaCard();
            tmp = cards[i];
            cards[i] = cards[randNum];
            cards[randNum] = tmp;
        }
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*cards.length)];
    }
    SutdaCard pick(int index){
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }
}
