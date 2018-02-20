import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать код, который хранит массив букв - загаданное слово;
 спрашивает у пользователя букву,
 если такая буква входит в загаданное слово, то выводит на экран отгаданные буквы с указанием их расположения в слове;
 продолжает исполнение, пока пользователь не отгадает слово или не захочет прекратить игру, введя 0.
 Например,
 загадано слово молоко, пользователь ввел букву о, программа вывела на экран
 Верно, есть такая буква!
 _о_о_о
 Будете отгадывать дальше? (0 - для выхода или введите очередную букву)
 То есть игра человека с компьютером.
 */
public class Urok5_dz4_1 {
    public static void main(String[] args) {
        char [] slovo = new char [] {'m', 'o', 'l', 'o', 'k', 'o'};
        char [] temp = new char[slovo.length];
        Scanner str = new Scanner (System.in);
        int guess = 0;
        char symbol = '\r';
        System.out.println("Загадано слово из " + slovo.length + " букв");
        for (int i = 0; i < slovo.length; i++) {
            temp[i] = '*';
        }
        while (!Arrays.equals(slovo, temp)) {
            System.out.println(new String(temp));
            System.out.println("Введите букву чтобы отгадать загаданное слово \nНажмите 0 для выхода");
            try {
                symbol = str.nextLine().charAt(0);
            } catch (Exception e){
                symbol ='\r';
            }
            if (symbol == '0') {
                    break;
                }
            for (int i = 0; i < slovo.length; i++) {
                if (symbol == slovo[i]) {
                    temp[i]=symbol;
                    System.out.println("Есть такая буква!!!");
                  //  guess++;
                }
            }
        }
        if (Arrays.equals(slovo,temp)){
            System.out.println("Слово <" + String.valueOf(slovo) + "> отгадано");
        } else {
            System.out.println("Попробуй еще!!!");
        }
    }
}
