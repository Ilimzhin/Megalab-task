package thirdWeek.secondDay.basket;

public class User {
    String login;
    String password;
    Basket basket;

    public User() {
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User: " +
                " login: " + login +
                " password: " + password +
                " basket: " + basket;
    }
}
