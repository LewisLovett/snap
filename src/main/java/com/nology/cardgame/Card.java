package com.nology.cardgame;


public class Card {

    private String[][] cardCodes = {{"\uD83C\uDCA2", "\uD83C\uDCA3", "\uD83C\uDCA4", "\uD83C\uDCA5", "\uD83C\uDCA6", "\uD83C\uDCA7", "\uD83C\uDCA8", "\uD83C\uDCA9", "\uD83C\uDCAA", "\uD83C\uDCAB", "\uD83C\uDCAC", "\uD83C\uDCAD", "\uD83C\uDCAE", "\uD83C\uDCA1"},
            {"\uD83C\uDCB2", "\uD83C\uDCB3", "\uD83C\uDCB4", "\uD83C\uDCB5", "\uD83C\uDCB6", "\uD83C\uDCB7", "\uD83C\uDCB8", "\uD83C\uDCB9", "\uD83C\uDCBA", "\uD83C\uDCBB", "\uD83C\uDCBC", "\uD83C\uDCBD", "\uD83C\uDCBE", "\uD83C\uDCB1"},
            {"\uD83C\uDCC2", "\uD83C\uDCC3", "\uD83C\uDCC4", "\uD83C\uDCC5", "\uD83C\uDCC6", "\uD83C\uDCC7", "\uD83C\uDCC8", "\uD83C\uDCC9", "\uD83C\uDCCA", "\uD83C\uDCCB", "\uD83C\uDCCC", "\uD83C\uDCCD", "\uD83C\uDCCE", "\uD83C\uDCC1"},
            {"\uD83C\uDCD2", "\uD83C\uDCD3", "\uD83C\uDCD4", "\uD83C\uDCD5", "\uD83C\uDCD6", "\uD83C\uDCD7", "\uD83C\uDCD8", "\uD83C\uDCD9", "\uD83C\uDCDA", "\uD83C\uDCDB", "\uD83C\uDCDC", "\uD83C\uDCDD", "\uD83C\uDCDE", "\uD83C\uDCD1"}};


    private String suit;
    private char suitCode;
    private String cardCode;
    private String symbol;
    private int value;


    public Card(Suit suit, int value) {
        this.suit = suit.getSuitName();
        this.suitCode = suit.getSuitCode();
        this.value = value;
        if (value > 10) {
            switch (value) {
                case 11:
                    this.symbol = "J";
                    this.cardCode = cardCodes[suit.getCardCodeSuitIndex()][10];
                    break;
                case 12:
                    this.symbol = "Q";
                    this.cardCode = cardCodes[suit.getCardCodeSuitIndex()][11];
                    break;
                case 13:
                    this.symbol = "K";
                    this.cardCode = cardCodes[suit.getCardCodeSuitIndex()][12];
                    break;
                case 14:
                    this.symbol = "A";
                    this.cardCode = cardCodes[suit.getCardCodeSuitIndex()][13];
                    break;
            }
        } else {
            this.symbol = Integer.toString(value);
            this.cardCode = cardCodes[suit.getCardCodeSuitIndex()][value - 2];
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
    public String toString() {
        String symbolOutput;

        switch (this.symbol) {
            case "J":
                symbolOutput = "Jack";
                break;
            case "Q":
                symbolOutput = "Queen";
                break;
            case "K":
                symbolOutput = "King";
                break;
            case "A":
                symbolOutput = "Ace";
                break;
            default:
                symbolOutput = this.symbol;
            }

            return (String.format("[%c %s of %s %s]", this.suitCode, symbolOutput, this.suit, this.cardCode));
        }

}
