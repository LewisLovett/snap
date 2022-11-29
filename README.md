# snap
Snap game by Lewis Lovett
Classes
1. Card - Class for individual cards, contains getters and setters for card properties. Contains multidimensional array contiaining UNI code for each individual card icon.
2. CardGame - Superclass for Snap game, contains methods for initalising a deck, sorting the deck, shuffling the deck and dealing a card from the deck.
3. Player - Simple class that stores the name of the player.
4. Snap - Child class for CardGame, contains methods for playing snap, displaying the cards, ending the game and a TimerTask.
Enum
1. Suit - Stores information for each card suit -- Suit name string, UNI code for suit symbol and card code suit index for accessing the array of the individual card icons in the Card class

PLAYING THE GAME
- The game starts with player 1 then player 2 entering their names.
- Then two cards are drawn from the deck and shown to the players. Player 1 goes first and they must type 'snap' if the cards match. 
- After 5 seconds a new card is drawn and it is now Player 2's turn.
- The game ends when the player enters 'snap' on their turn when the cards match or if 'snap' is not entered when the cards match which means the player whos turn it currently is loses.
