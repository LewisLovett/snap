package com.nology.cardgame;

public class Card {


    private String suit;
    private String symbol;
    private int value;


    public Card(Suit suit, int value) {
        switch (suit){
            case HEARTS:
                this.suit = "U+2661";
                break;
            case CLUBS:
                this.suit = "U+2667 ";
                break;
            case DIAMONDS:
                this.suit = "U+2662";
                break;
            case SPADES:
                this.suit = "U+2664";
                break;
        }
        this.value = value;
        switch (value){
            case 2:
                this.symbol = "2";
                break;
            case 3:
                this.symbol = "3";
                break;
            case 4:
                this.symbol = "4";
                break;
            case 5:
                this.symbol = "5";
                break;
            case 6:
                this.symbol = "6";
                break;
            case 7:
                this.symbol = "7";
                break;
            case 8:
                this.symbol = "8";
                break;
            case 9:
                this.symbol = "9";
                break;
            case 10:
                this.symbol = "10";
                break;
            case 11:
                this.symbol = "J";
                break;
            case 12:
                this.symbol = "Q";
                break;
            case 13:
                this.symbol = "K";
                break;
            case 14:
                this.symbol = "A";
                break;

        }
    }
    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString(){
        return (String.format("%s %f of %s", suit,value,symbol));
    }
}
