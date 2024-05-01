package Ch06.CompanyNum;

public class CardCompany {
    private static int cardNum = 1000;
    public int uniqueNum;
    public CardCompany(){
        uniqueNum=cardNum++;
    }
    public static void main(String[] args) {
        CardCompany card= new CardCompany();
        CardCompany card1= new CardCompany();
        CardCompany card2= new CardCompany();
        CardCompany card3= new CardCompany();
        System.out.println(card.uniqueNum);
        System.out.println(card1.uniqueNum);
        System.out.println(card2.uniqueNum);
        System.out.println(card3.uniqueNum);
    }
}
