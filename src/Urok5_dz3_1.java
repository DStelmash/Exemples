import java.util.Scanner;

/**
 Напишите код, который в цикле спрашивает у пользователя число от 1 до 10 (по одному числу за раз),
 до тех пор, пока сумма этих чисел не станет равной 21.
 Если сумма чисел превысила 21, то завершите программу.
 Если сумма чисел составила точно 21, то поздравьте пользователя с выигрышем.
 Например, пользователь ввел число 2, затем число 5, затем число 6, их сумма будет
 2 + 5 + 6 = 13
 */
public class Urok5_dz3_1 {
    public static void main(String[] args) {
        int total = 0;
        int i = -1;
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10 (0 для выхода)");
        while (total != 21) {
            System.out.println("Введите число");
            i = str.nextInt();
            if (i == 0){
                break;
            }
            if (i < 0 || i > 10){
                System.out.println("Введите число от 1 до 10");
            } else {
            total += i;
            }
            System.out.println("Сумма равна " + total);
            if (total >= 21){
                break;
            }
        }
        if (total > 21){
            System.out.println("Вы проиграли ваш результат: " + total);
        } else {
            System.out.println("Поздравляем вы выйграли");
        }
    }
}
