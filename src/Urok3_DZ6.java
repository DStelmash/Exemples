import java.util.Scanner;

/**
 * // Написать код,
 * // который расширяет возможности кода из упражнения 5 так, чтобы в игру могли играть два человека по очереди.
 * // Сначала один загадывает слово, а второй отгадывает. Потом наоборот.
 */
public class Urok3_DZ6 {
    public static void main(String[] args) {
        char[] slovo = null;
        Scanner sc = new Scanner(System.in);
        boolean secondPlayer = true;
        int response = -1;
        String word = null;

        while (response != 0) {
            if (secondPlayer) {
                System.out.println("Первый игрок загадывает слово длинее 3 букв или нажает 0 для выхода");
            } else {
                System.out.println("Второй игрок загадывает слово длинее 3 букв или нажает 0 для выхода");
            }
            secondPlayer = !secondPlayer;
            word = "";
            while (word.length() < 3) {
                word = sc.nextLine();
                if (word.equalsIgnoreCase("0")) {
                    response = 0;
                    break;
                }
            }
            if (response != 0) {
                slovo = word.toCharArray();
                if (guessWord(slovo) < 0) {
                    response = 0;
                }
            }
        }
    }

    private static int guessWord(char[] slovo) {
        char[] line = new char[slovo.length];
        Scanner st = new Scanner(System.in);
        System.out.println("Загадано слово из " + slovo.length + " букв");
        for (int i = 0; i < slovo.length; i++) {
            line[i] = '*';
        }
        int guess = 0;
        int tryUser = 0;
        char user = '\r';

        while (guess < slovo.length) {
            tryUser++;
            System.out.println(new String(line));
            System.out.println("Введите букву чтобы отгадать загаданное слово");
            System.out.println("0 - для выхода или введите очередную букву");
            try {
                user = st.nextLine().charAt(0);
            } catch (Exception e) {
                user = '\r';
            }
            if (user == 0) {
                break;
            }
            for (int i = 0; i < slovo.length; i++) {
                if (user == slovo[i] && line[i] != slovo[i]) {
                    line[i] = slovo[i];
                    System.out.println("Поздравляю! Есть такая буква!");
                    guess++;
                }
            }
        }
        if (guess == slovo.length) {
            System.out.println("Слово <" + String.valueOf(slovo) + "> отгаданно за " + tryUser + " попыток");
            return 1;
        } else {
            System.out.println("Попробуйте еще");
            return -1;
        }
    }
}
