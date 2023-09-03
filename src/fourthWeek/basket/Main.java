package fourthWeek.basket;


public class Main {
    public static void main(String[] args) {
        Initialization authorization = new Initialization();
        Store store = new Store();
        if (authorization.initialization()) {
            Initialization.localNotifications(7);
            store.transaction();
        } else System.exit(0);
    }
}
