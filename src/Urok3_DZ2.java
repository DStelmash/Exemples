/**
 * Написать код,
 * который спрашивает у пользователя 10 целых чисел и упорядочивает
 * введеные числа по убыванию, затем выводит результат сортировки на экран
 */
public class Urok3_DZ2 {
    public static void main(String[] args) {
        sortirovka();
    }

    private static void sortirovka() {
        double[] mas = new double[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.println(mas[i]);
        }
        System.out.println("Sort");
        for (int i = 0; i < mas.length; i++) {
            double max = mas[i];
            int imax = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    imax = j;
                }
            }
            if (i != imax) {
                double temp = mas[i];
                mas[i] = mas[imax];
                mas[imax] = temp;
            }
            System.out.println(mas[i]);
        }

    }
}
