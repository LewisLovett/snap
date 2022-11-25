package com.nology.cardgame;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    Timer timer;
    Boolean isGameOver;
    Boolean isPlayer1Turn;
    Card card1;
    Card card2;
    Player player1;
    Player player2;
    public Snap(String name){
        super(name);
        this.isGameOver = false;
        this.isPlayer1Turn = true;
    }
    public void play(){
        System.out.println("Please enter the name of player 1");
        String input = scanner.nextLine();
        player1 = new Player(input);
        System.out.println("Please enter the name of player 2");
        input = scanner.nextLine();
        player2 = new Player(input);

        System.out.println("Press enter to draw a card, enter snap when the cards symbols match");
        card1 = this.dealCard();
        card2 = this.dealCard();
        displayCards();
        timer = new Timer();

        timer.scheduleAtFixedRate(DrawCardTask,5000,5000);
        while(!isGameOver){
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (card1.getSymbol().equals(card2.getSymbol()) && input.equalsIgnoreCase("snap")){
                timer.cancel();
                gameEnd();
            }
        }


    }

    public void displayCards(){
        System.out.println(this.card1 + " " + this.card2);
    }
    public void gameEnd(){
        System.out.println("SNAP");
        if(isPlayer1Turn){
            System.out.println(String.format("SNAP! %s WINS", player1.getPlayerName()));
        }else{
            System.out.println(String.format("SNAP! %s WINS", player2.getPlayerName()));
        }
    }

    TimerTask DrawCardTask = new TimerTask() {
        @Override
        public void run() {
                card1 = card2;
                card2 = dealCard();
                displayCards();
                isPlayer1Turn = !isPlayer1Turn;
        }
    };


    public static void main(String[] args) {
        Snap snap = new Snap("snap");
        snap.shuffleDeck();
        snap.play();
    }
}
