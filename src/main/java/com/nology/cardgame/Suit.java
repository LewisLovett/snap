package com.nology.cardgame;

public enum Suit {
    HEARTS("hearts",'\u2661'),
    CLUBS("clubs",'\u2667'),
    DIAMONDS("diamonds",'\u2662'),
    SPADES("spades",'\u2664');

    private String suitName;
    private char suitCode;

    Suit(String suitName,char suitCode){
        this.suitName = suitName;
        this.suitCode = suitCode;

    }
    public String getSuitName() {
        return suitName;
    }

    public char getSuitCode() {
        return suitCode;
    }
}
