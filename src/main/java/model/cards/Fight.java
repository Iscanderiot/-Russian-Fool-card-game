package model.cards;



import java.util.ArrayList;

public class Fight {
    Player attacker;
    Player defender;
    ArrayList<Player> sidePlayers = new ArrayList<>(); 
    Suit trumpSuit;
    ArrayList<Card> cards;
    Game game;

    public Fight(Game game, Player attacker, Player defender, Suit trumpSuit, ArrayList<Card> cards){
        this.attacker = attacker;
        this.defender = defender;
        this.trumpSuit = trumpSuit;
        this.cards = cards;
        this.game = game;
    }

    public Fight(Game game, Player attacker, Player defender, Suit trumpSuit){
        this.attacker = attacker;
        this.defender = defender;
        this.trumpSuit = trumpSuit;
        this.game = game;
    }

    public void engagePlayer(Player player){
        sidePlayers.add(player);
    }

    public ArrayList<Integer> findBeatingCardsIndexes(Card attackersCard){
        ArrayList<Card> defendersCards = this.defender.getCards();
        ArrayList<Integer> indexes = new ArrayList<>();
        if (attackersCard.getSuit() == this.trumpSuit){
            for (int i = 0; i < defendersCards.size(); i++){
                if ((defendersCards.get(i).getSuit() == trumpSuit) && (defendersCards.get(i).compareTo(attackersCard) == 1)){
                    indexes.add(i);
                }
            }
        }
        else{
            for (int i = 0; i < defendersCards.size(); i++){
                if ((defendersCards.get(i).getSuit() == trumpSuit)){
                    indexes.add(i);
                }
                else{
                    if (attackersCard.getSuit() == defendersCards.get(i).getSuit()){
                    if (defendersCards.get(i).compareTo(attackersCard) == 1){
                        indexes.add(i);
                    }
                }
                else{
                    continue;
                }
                }
            }
        }
        return indexes;
    }

    public ArrayList<Integer> findPassCardsIndexes(Card attackersCard){
        ArrayList<Card> defendersCards = this.defender.getCards();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < defendersCards.size(); i++){
                if ((defendersCards.get(i).getRank() == attackersCard.getRank())){
                    indexes.add(i);
                }
            }
            return indexes;
    }

    public boolean hasBeatingCards(Card card){
        ArrayList<Integer> cards = findBeatingCardsIndexes(card);
        return (cards.size() != 0);
    }

    public boolean hasPassCards(Card card){
        ArrayList<Integer> cards = findPassCardsIndexes(card);
        return (cards.size() != 0);
    }

    public String playOptionTerminal(Card card){
        boolean flag1 = hasPassCards(card);
        boolean flag2 = hasBeatingCards(card);
        String message = "";
        if (hasPassCards(card)){
            message = "Passing cards";
            ArrayList<Integer> indexes = findPassCardsIndexes(card);
            for (int index : indexes){
                message += defender.getCards().get(index).toString();
            }
            message +="\n";
        }
        else{
            message = "You have no cards to pass\n";
        }
        if (hasBeatingCards(card)){
            message = "Beating cards:";
            ArrayList<Integer> indexes = findBeatingCardsIndexes(card);
            for (int index : indexes){
                message += defender.getCards().get(index).toString();
            }
            message +="\n";
        }
        else{
            message += "You have no beating cards\n";
        }
        return message;
    }

    public void initiateFight(Card card){
        System.out.println(playOptionTerminal(card));
        
        
        
    }

    public static void main(String[] args) {
        Player attacker = new Player("Josh");
        Player defender = new Player("Jonathan");
        Board board = new Board();
        Game game = new Game(board);
        game.addPlayer(attacker);
        game.addPlayer(defender);
        Suit trumpSuit = Suit.CLUBS;
        System.out.println(game.getPlayers());
        game.dealCards();
        Fight fight = new Fight(game, game.getPlayer(0), game.getPlayer(1), trumpSuit);
        fight.initiateFight(attacker.putRandomCard());

    }
    
}
