package cards;

enum Suit{
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}

