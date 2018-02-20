import java.util.Arrays;
import java.util.Scanner;

//Написать код,
//        1) который при запуске спрашивает у пользователя три числа и сохраняет их в три переменные k, t, n;
//        2) создает два массива целых чисел (arr1 и arr2), каждый длинной n элементов.
//        3) заполняет первый массив по формуле
//        arr1[i] = k * (i - t), где arr1[i] - i-ый элемент первого массива
//        4) заполняет второй массив по формуле
//        arr2[i] = (k + t - i), где arr2[i] - i-ый элемент второго массива
//        5) выводит содержимое обоих массивов
public class Urok5_dz2 {
    public static void main(String[] args) {
        int k = 0;
        int t = 0;
        int n = 0;
        Scanner str = new Scanner(System.in);
        System.out.println("Введите первое число");
        while (true){
            if (str.hasNextInt()){
                k = str.nextInt();
                str.nextLine();
                break;
            } else {
                String temp = str.nextLine();
                System.out.println("Введите число!!!");
            }
        }
        System.out.println("Введите второе число");
        while (true){
            if (str.hasNextInt()){
                t = str.nextInt();
                str.nextLine();
                break;
            } else {
                String temp = str.nextLine();
                System.out.println("Введите число!!!");
            }
        }
        System.out.println("Введите третье число");
        while (true){
            if (str.hasNextInt()){
                n = str.nextInt();
                str.nextLine();
                break;
            } else {
                String temp = str.nextLine();
                System.out.println("Введите число!!!");
            }
        }
        int []  arr1 = new int[n];
        int []  arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = k * (i - t);
            arr2[i] = (k + t - i);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
