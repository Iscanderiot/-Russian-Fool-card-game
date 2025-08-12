package model.cards;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Board board;
    private ArrayList<Player> players;
    private StandardDeck deck;

    public Game(Board board){
        this.board = board;
        this.deck = new StandardDeck();
        deck.shuffleDeck();
        this.players = new ArrayList<>();
    }

    public void dealCards(){
        for (Player player : players){
            for (int i = 0; i < 7; i++){
            player.takeCard(deck.pickTopCard());
            }
        }
    }

    public void playGameBots(){
        System.out.println("Enter the number of bots"); //add restriction that the number of bots should not be > than 6
        Scanner scanner = new Scanner(System.in);
        int numberOfBots = scanner.nextInt();
        for (int i = 0; i < numberOfBots; i++){
            this.addPlayer((new Player("Bot "+(i+1))));
        }

        for (Player player : this.getPlayers()){
            System.out.println(player);
        }
    }

    public Player getPlayer(int index){
        return this.getPlayers().get(index);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }
    
    public StandardDeck getDeck(){
        return this.deck;
    } 
    

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public static void main(String[] args) {
        Board board1 = new Board();
        Game game = new Game(board1);
        Player player1 = new Player("Joshua");
        Player player2 = new Player("Collins");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealCards();
        for (Player player : game.getPlayers()){
            System.out.println(player.getCards());
        }
        System.out.println(game.getDeck().toString());
    }
}
