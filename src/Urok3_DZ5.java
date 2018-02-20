import java.util.Scanner;

/**
 * Написать код, который хранит массив букв - загаданное слово;
 * спрашивает у пользователя букву,
 * если такая буква входит в загаданное слово, то выводит на экран отгаданные буквы с указанием их расположения в слове;
 * продолжает исполнение, пока пользователь не отгадает слово или не захочет прекратить игру, введя 0.
 * <p>
 * Например,
 * загадано слово молоко, пользователь ввел букву о, программа вывела на экран
 * Верно, есть такая буква!
 * _о_о_о
 * Будете отгадывать дальше? (0 - для выхода или введите очередную букву)
 */
public class Urok3_DZ5 {
    public static void main(String[] args) {
        char[] slovo = new char[]{'д', 'о', 'м', 'о', 'в', 'о', 'й'};
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
        } else {
            System.out.println("Попробуйте еще");
        }
    }
}
