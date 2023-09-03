package thirdWeek.firstDay.cards;

import thirdWeek.firstDay.cards.Test;

import java.util.Random;

public class CardsWith52Cards {

    Random random = new Random();
    String[] cards = {"♠", "♥", "♦", "♣"};
    String[] cardSuit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

    public void runGameWith52Cards(int numPlayers) {

        if (numPlayers <= 11) {
            String num = "cardss";
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print(i + " игрок получает 5 карт: ");
                for (int j = 1; j <= 5; ) {
                    int randomCardSuit = random.nextInt(0, cardSuit.length);
                    int randomCards = random.nextInt(0, cards.length);
                    String res = cards[randomCards] + cardSuit[randomCardSuit];
                    if (num.contains(res)) {
//                        System.out.print("!!!");
                    } else {
                        System.out.print(res);
                        num += res;
                        j++;
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Введите количество игроков меньше 10");
        }
    }
}
