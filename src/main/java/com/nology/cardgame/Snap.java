package com.nology.cardgame;

import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    Boolean gameOver;

    Card card1;
    Card card2;
    public Snap(String name){
        super(name);
        this.gameOver = false;
    }
    public void play(){
        System.out.println("Press enter to draw a card, enter snap when the cards symbols match");
        card1 = this.dealCard();
        card2 = this.dealCard();
        displayCards();
        while (!gameOver){
            String input = scanner.nextLine();
            if (this.card1.getSymbol().equals(this.card2.getSymbol()) && input.equalsIgnoreCase("snap")){
                gameOver = true;
            }else{
                this.card1 = this.card2;
                this.card2 = this.dealCard();
                displayCards();
            }
        }

        System.out.println("SNAP");

    }

    public void displayCards(){
        System.out.println(this.card1 + " " + this.card2);
    }

    public static void main(String[] args) {
        Snap snap = new Snap("snap");
        snap.shuffleDeck();
        snap.play();
    }
}
