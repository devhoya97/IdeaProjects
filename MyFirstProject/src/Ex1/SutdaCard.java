package Ex1;

class SutdaCard {
    final int NUM;
    final boolean IS_KWANG;
    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }
    public boolean equals(Object obj){
        if (obj instanceof SutdaCard) {
            if (((SutdaCard) obj).NUM == NUM && ((SutdaCard)obj).IS_KWANG == IS_KWANG)
                return true;
        }
        return false;
    }
    public String toString(){
        return NUM + (IS_KWANG ? "K" : "");
    }
}