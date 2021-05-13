package entities;

public class Campaign {

    int id;
    int discountRate;
    Game game;

    public Campaign(int id, int discountRate, Game game) {
        this.id = id;
        this.discountRate = discountRate;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public Game getGame() {
        return game;
    }
}
