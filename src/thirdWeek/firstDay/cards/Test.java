package thirdWeek.firstDay.cards;

import java.util.Scanner;

public class Test {

    //карты с 36 картами
    //карты с 52 картами
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardsWith52Cards ran52 = new CardsWith52Cards();

        System.out.println("Напишите вид карточной игры которую вы хотите поиграть\n" +
                "1-(дро-покер)\n" +
                "2-(мы решили не добавлять еще игры если хотите выйти нажмите 2)\n");
        int numDeck = scanner.nextInt();

        if (numDeck==2) {
            System.out.println("Досвидание");
        } else {
            System.out.println("Сколько игроков будут играть");
            int numPlayers = scanner.nextInt();
            switch (numDeck) {
                case 1 -> ran52.runGameWith52Cards(numPlayers);
                default -> System.out.println("Неправильно ввели число");
            }
        }

    }

}
