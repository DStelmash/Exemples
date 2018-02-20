import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 Напишите код, который в цикле спрашивает у пользователя число от 1 до 10 (по одному числу за раз),
 до тех пор, пока сумма этих чисел не станет равной 21.
 Если сумма чисел превысила 21, то завершите программу.
 Если сумма чисел составила точно 21, то поздравьте пользователя с выигрышем.
 Числа выбираются случайным образом
 */
public class Urok5_dz3_2 {
    public static void main(String[] args) {
        int total = 0;
        int i = -1;
        Scanner str = new Scanner(System.in);
        System.out.println("Нажмите 1 для продолжения или 0 для выхода");
        while (total != 21) {
//            System.out.println("Введите число");
            i = str.nextInt();
            if (i == 0){
                System.out.println("Ваш результат:" + total);
                break;
            }
            i = (int) (Math.random() * 11);
            total += i;
            System.out.println("Сумма равна " + total);
            System.out.println("Продолжаем?");
            if (total >= 21){
                System.out.println("Вы проиграли ваш результат: " + total);
                break;
            }
        }
        if (total == 21){
            System.out.println("Поздравляем вы выйграли");
        }
    }
}
