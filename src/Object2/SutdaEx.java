package Object2;
//7-1
public class SutdaEx {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        deck.deckList();
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck(){
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard(
                    i%10 + 1,i<10 && (i+1 == 1 || i+1 ==3 || i+1 == 8)? true : false);
        }
    }
    public void deckList(){
        for (int i = 0; i < cards.length; i++) {
            if(i!=0) System.out.print(",");
            if(i==10) System.out.println();
            System.out.print(cards[i]);
        }
        System.out.println("]\n");
    }
    public void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rand = (int) (Math.random() * cards.length);
            SutdaCard tmp = pick(i);
            cards[i] = cards[rand];
            cards[rand] = tmp;
        }
    }
    public SutdaCard pick(int index){
        return cards[index];
    }
    public SutdaCard pick(){
        int rand = (int) (Math.random() * cards.length);
        return cards[rand];
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(){
        this (1, true);
    }
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString(){
        return num + (isKwang ? "k" : "");
    }
}

