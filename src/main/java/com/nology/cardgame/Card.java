package com.nology.cardgame;

import java.io.UnsupportedEncodingException;

public class Card {




//    private char cardCode = '\1F0';
    private String suit;
    private char suitCode;
    private String symbol;
    private int value;


    public Card(Suit suit, int value) {
        this.suit=suit.getSuitName();
        this.suitCode = suit.getSuitCode();
        this.value = value;
        if(value > 10){
            switch (value){
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
        }else{
            this.symbol = Integer.toString(value);
        }
    }

    public char getSuitCode() {
        return this.suitCode;
    }
    public String getSuit() {
        return this.suit;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString(){


        return (String.format("%c %s of %s", suitCode,symbol,suit));
    }
}
