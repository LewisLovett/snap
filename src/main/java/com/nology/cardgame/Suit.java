package com.nology.cardgame;

public enum Suit {
    SPADES("spades",'\u2660',0),
    HEARTS("hearts",'\u2665',1),
    DIAMONDS("diamonds",'\u2666',2),
    CLUBS("clubs",'\u2663',3);


    private String suitName;
    private char suitCode;

    private int cardCodeSuitIndex;



    Suit(String suitName, char suitCode, int cardCodeSuitIndex){
        this.suitName = suitName;
        this.suitCode = suitCode;
        this.cardCodeSuitIndex = cardCodeSuitIndex;

    }
    public String getSuitName() {
        return suitName;
    }

    public char getSuitCode() {
        return suitCode;
    }
    public int getCardCodeSuitIndex() {
        return cardCodeSuitIndex;
    }
}
