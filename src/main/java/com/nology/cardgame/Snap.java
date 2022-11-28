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

    String input;
    public Snap(String name){
        super(name);
        this.isGameOver = false;
        this.isPlayer1Turn = true;
    }
    public void play(){
        System.out.println("Please enter the name of player 1");
        input = scanner.nextLine();
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
            if (card1.getSymbol().equals(card2.getSymbol())){
                timer.cancel();
                gameEnd(input.equalsIgnoreCase("snap"));
            }
        }


    }

    public void displayCards(){
        String output = this.card1 + " " + this.card2 + " Current player:" ;
        if(isPlayer1Turn){
            output+= player1.getPlayerName();
        }else{
            output+= player2.getPlayerName();
        }
        System.out.println(output);
    }
    public void gameEnd(Boolean isSnapEntered){

        if(isSnapEntered){
            System.out.println("SNAP");
        }else {
            System.out.println("You missed the SNAP");
        }
        if((isPlayer1Turn && isSnapEntered) || (!isPlayer1Turn && !isSnapEntered)){
            System.out.println(String.format("%s WINS", player1.getPlayerName()));
        }else{
            System.out.println(String.format("%s WINS", player2.getPlayerName()));
        }
    }

    TimerTask DrawCardTask = new TimerTask() {
        @Override
        public void run() {
            if (card1.getSymbol().equals(card2.getSymbol())){
                timer.cancel();
                gameEnd(input.equalsIgnoreCase("snap"));
            }
                card1 = card2;
                card2 = dealCard();
                isPlayer1Turn = !isPlayer1Turn;
                displayCards();

        }
    };


    public static void main(String[] args) {
        Snap snap = new Snap("snap");
        snap.shuffleDeck();
        snap.play();
    }
}
