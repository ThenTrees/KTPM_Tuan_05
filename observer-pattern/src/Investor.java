public class Investor implements Observer {

    private String name;
    private Stock stock;

    public Investor(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
        this.stock.register(this);
    }


    @Override
    public void update(double price) {

        System.out.println("Notified " + name + " of " + stock.getStockName() + "'s " + "price change to " + price);
    }
}
