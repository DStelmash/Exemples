//Написать код, который спрашивает у пользователя два целых числа и выводит на экран:
//если у чисел разные знаки (одно положительное, а другое отрицательное), то выводит на экран произведение двух чисел,
//иначе, если первое число больше второго, то выводит разницу двух чисел,
//иначе, если оба числа отрицательные, то сумму двух чисел,
//остаток от деления первого числа на второе – во всех остальных случаях.

import java.util.Scanner;

public class Urok5_dz1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int i,j;
        System.out.println("Введите любое число");
        while (true) {
            if (str.hasNextInt()) {
                i = str.nextInt();
                str.nextLine();
                break;
            } else {
                String temp = str.nextLine();
                System.out.println("Введите число!!!");
            }
        }
        System.out.println("Введите еще одно число");
        while (true) {
            if (str.hasNextInt()) {
                j = str.nextInt();
                str.nextLine();
                break;
            } else {
                String temp = str.nextLine();
                System.out.println("Введите число!!!");
            }
        }
        if ((i > 0 && j < 0) || (i <0 && j > 0)){
            System.out.printf("%d * %d = %d %n", i, j, i*j );
        } else {
            if(i > j){
                System.out.printf("%d - %d = %d %n", i, j, i-j);
            } else {
                if (i < 0 && j < 0) {
                    System.out.printf("%d + %d = %d %n", i, j, i+j);
                } else {
                    System.out.printf("%d % %d = %d %n", i, j, i%j);
                }
            }
        }
    }
}
