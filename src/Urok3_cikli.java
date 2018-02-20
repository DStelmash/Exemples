/**
 * Написать код, который спрашивает у пользователя два целых числа и выводит на экран:
 * произведение двух чисел, если у чисел разные знаки (одно положительное, а другое отрицательное)
 * разницу двух чисел, если первое число больше второго !!!
 * сумму двух чисел, если оба числа отрицательные !!!
 * остаток от деления первого числа на второе – во всех остальных случаях.
 */
public class Urok3_cikli {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        sravnenie(i, j);
    }

    static void sravnenie(int i, int j) {
        if (i > 0 && j < 0) {
            System.out.println(i * j);
        } else if (i < 0 && j < 0) {
                System.out.println(i + j);
            } else if (i > j) {
                System.out.println(i - j);
            } else if (i<0 && j>0){
            System.out.println(i * j);
            } else {
                System.out.println(i / j);
            }
        }
    }
