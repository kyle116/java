//Written by:           Kyle Liu
//Assignment:         Assignment info (ex.: HW05 - Page 113 - #3.24)
//Class:                   CO SCI 290
//Date:                    03/14/2018
//Description:        Game: pick a card

public class PickCard {
    public static void main(String[] args) {
        System.out.println("This program simulates picking a card from a deck\n" +
                "of 52 cards.");
        int card = (int)((Math.random() * 13) + 1);
        int suit = (int)(Math.random() * 4);
        System.out.print("The card you picked is ");
        switch(card) {
            case 1: System.out.print("Ace");
                    break;
            case 2: System.out.print(card);
                    break;
            case 3: System.out.print(card);
                    break;
            case 4: System.out.print(card);
                    break;
            case 5: System.out.print(card);
                    break;
            case 6: System.out.print(card);
                    break;
            case 7: System.out.print(card);
                    break;
            case 8: System.out.print(card);
                    break;
            case 9: System.out.print(card);
                    break;
            case 10: System.out.print(card);
                    break;
            case 11: System.out.print("Jack");
                    break;
            case 12: System.out.print("Queen");
                    break;
            case 13: System.out.print("King");
        }
        switch (suit) {
            case 0: System.out.println(" of Clubs");
                    break;
            case 1: System.out.println(" of Diamonds");
                    break;
            case 2: System.out.println(" of Hearts");
                    break;
            case 3: System.out.println(" of Spades");
        }
    }
}
