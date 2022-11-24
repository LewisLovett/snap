package com.nology.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

    private ArrayList<Card> cardDeck = new ArrayList<>();
    private String name;

    public CardGame(String name){
        this.name = name;
        for (Suit suit : Suit.values()) {
            for (int i = 2; i < 15; i++) {
                Card card = new Card(suit,i);
                cardDeck.add(card);
            }
        }
    }
    public ArrayList<Card> getCardDeck(){
        return cardDeck;
    }
    public Card dealCard(){
        return cardDeck.get(0);
    }
    public void sortDeckInNumberOrder(){
        ArrayList<Card> sortedDeck = cardDeck;
        Collections.sort(sortedDeck, (o1, o2) -> {
            if(o1.getValue() == o2.getValue() ){
                return 0;
            } else if (o1.getValue() < o2.getValue() ) {
                return -1;
            }else{
                return 1;
            }
        });
        cardDeck = sortedDeck;
    }
    public void sortDeckIntoSuits(){
        sortDeckInNumberOrder();
        ArrayList<Card> sortedDeck = cardDeck;
        Collections.sort(sortedDeck, (o1, o2) -> {
            if(o1.getSuit().charAt(0) == o2.getSuit().charAt(0) ){
                return 0;
            } else if (o1.getSuit().charAt(0) < o2.getSuit().charAt(0) ) {
                return -1;
            }else{
                return 1;
            }
        });
        cardDeck = sortedDeck;
    }

    public void shuffleDeck(){
        ArrayList<Card> shuffledDeck = cardDeck;
        Collections.shuffle(shuffledDeck);
        cardDeck = shuffledDeck;
    }

    public static void main(String[] args) {
        CardGame cardGame = new CardGame("52");
        System.out.println(cardGame.getCardDeck());
        cardGame.sortDeckInNumberOrder();
        System.out.println(cardGame.getCardDeck());
        cardGame.sortDeckIntoSuits();
        System.out.println(cardGame.getCardDeck());
        cardGame.shuffleDeck();
        System.out.println(cardGame.getCardDeck());


    }
}
