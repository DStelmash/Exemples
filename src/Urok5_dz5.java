import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать код,
 который расширяет возможности кода из упражнения 4 так, чтобы в игру могли играть два человека по очереди.
 Сначала один загадывает слово, а второй отгадывает. Потом наоборот.
 То есть игра человека с человеком.
 */
public class Urok5_dz5 {
    public static void main(String[] args) {
        char [] slovo;
        Scanner str = new Scanner (System.in);
        int guess = 0;
        char symbol = '\r';
        String guessSlovo;
        System.out.println("Загадайте слово");
        guessSlovo = str.nextLine();
        slovo = guessSlovo.toCharArray();
        char [] temp = new char[slovo.length];
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
