/**
 * Написать код, который спрашивает у пользователя число от 1 до 10 (по одному числу за раз)
 * и знак числа, до тех пор, пока сумма этих чисел не станет равной 21.
 * Например, пользователь ввел число 2, затем число 5, затем число -4, их сумма будет
 * 2 + 5 + (-4) = 3
 */

import java.util.Scanner;

public class Urok3_DZ4 {
    public static void main(String[] args) {
        doWhile(); // вызов метода с циклом DO - WHILE
    }


    private static void doWhile() {
        Scanner sc = new Scanner(System.in); //ввод числа с клавиатуры
        int i = 0;
        int j = 0;
        do {
            System.out.println("Введите число от 1 до 10");
            i = sc.nextInt(); // поймали число
            Scanner ch = new Scanner(System.in); // определяем ввод символа
            String s1;
            System.out.println("Введите знак числа (+ или -)");
            s1 = ch.nextLine(); // поймали символ
            if (i >= 1 && i <= 10) {                                // проверка по числу чтобы попал в нужный диапазон
                if (s1.charAt(0) != '-' && s1.charAt(0) != '+') {   // проверка по символу чтобы был + или -
                    System.out.println("Вы ввели не тот символ");
                } else {
                    if (s1.charAt(0) == '-') {                      // присвоение отрицательного значения
                        i = 0 - i;
                    }
                    j = j + i;                                      // пересчет итоговой суммы
                    System.out.println(j);
                }
            } else {
                System.out.println("Вы ввели число больше 10");
            }

        } while (j != 21);
        System.out.println("Поздравляю вы набрали нужную сумму");
        j = 0;
        doWhile();

    }
}
