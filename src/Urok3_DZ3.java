/**
  * Написать код,
 * который создает два массива целых чисел и заполняет первый массив по формуле
 * x(i) = k*(i - t), где x(i) - i-ый элемент первого массива
 * x(i) = (k + t - i), где x(i) - i-ый элемент второго массива
 * где параметры k и t - целые числа, введенные пользователем, размер массивов
 * равен N - числу, так же введенному пользователем
 */
public class Urok3_DZ3 {
    public static void main(String[] args) {
        mas();
    }

    private static void mas() {
        int k=8, t=1, n=20;
        int [] mas1 = new int[n];
        int [] mas2 = new int[n];
        System.out.println("Massiv 1  Massiv2");
        for (int i = 0; i < n; i++) {
            mas1[i]=k*(i - t);
            mas2[i]=k + t - i;
            System.out.println(mas1[i] +"     " + mas2[i]);
        }

    }
}
