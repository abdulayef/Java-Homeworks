package entities;

public class Game {

    int id;
    int stock;
    double price;
    String name;

    public Game(int id, int stock, double price, String name) {
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
