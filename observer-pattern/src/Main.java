public class Main {
    public static void main(String[] args) {

        // tao co phieu
        Stock stock = new Stock("ABC", 100);

        // tao nha dau tu
        Investor investor1 = new Investor("Alice", stock);
        Investor investor2 = new Investor("Bob", stock);

        // thay doi gia co phieu
        System.out.println("gia co phieu hien tai: " + stock.getPrice());
        stock.setPrice(200);
        System.out.println("-----------------");
        stock.setPrice(500);
        System.out.println("-----------------");
        stock.unregister(investor1);
        stock.setPrice(1000);

    }
}