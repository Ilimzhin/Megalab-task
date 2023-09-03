package thirdWeek.firstDay;

import java.util.Random;
import java.util.Scanner;

public class CardsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        String[] cards = {"♠", "♥", "♦", "♣"};
        String[] cardSuit = {"Туз", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Кароль"};
        String num = "cardss";
        if (numPlayers <= 11) {
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print(i + " игрок получает 5 карт( ");
                for (int j = 1; j <= 5; ) {
                    int randomCardSuit = random.nextInt(0, cardSuit.length);
                    int randomCards = random.nextInt(0, cards.length);
                    String result = cards[randomCards] + cardSuit[randomCardSuit];
                    if (num.contains(result)) {
                    } else {
                        num += result;
                        System.out.print(result);
                        j++;
                    }
                }
                System.out.println(")");
            }
        } else {
            System.out.println("Максивамальное число играков 10");
        }
        for (String sss : cards) {
            System.out.print(sss);
        }
        System.out.println();
        for (String ssst : cardSuit) {
            System.out.print(ssst);
        }
    }
}
