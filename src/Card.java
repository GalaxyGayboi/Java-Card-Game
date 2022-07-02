public class Card {
    private String suit = "Blank";
    private String color = "Colorless";


    private int num = -1;

    public void setNum(int num) {
        this.num = num;
    }

    public void setSuitAndColor(int num) {
        switch (num / 13) {
            case 0:
                this.suit = "Clubs";
                this.color = "Black";
                break;
            case 1:
                this.suit = "Hearts";
                this.color = "Red";
                break;
            case 2:
                this.suit = "Spades";
                this.color = "Black";
                break;
            case 3:
                this.suit = "Diamonds";
                this.color = "Red";
                break;
            default:
                System.out.println("setSuitAndColor Failed");
                break;
    }
    }

    public String getSuit() {
        return suit;
    }
    public String getColor() {
        return color;
    }
    public int getNum() {
        return num;
    }
    public String getFullCard() {
        return color + " " + num + " of " + suit;
    }




}
