import java.util.Scanner;

/**
 * // Написать код,
 * // который выводит на экран квадратное поле в виде 9 символов подчеркивания
 * // _ _ _
 * // _ _ _
 * // _ _ _
 * // Затем спрашивает у пользователя, номер ячейки и символ, который поставить в эту ячейку,
 * // и заполняет выбранную ячейку заданым символом.
 * // Например, пользователь выбрал вторую ячейку и символ X
 * // Программа должны вывести на экран результат
 * // _ X _
 * // _ _ _
 * // _ _ _
 * // Недопустимо ставить символ в уже заполненную ячейку
 */
public class Urok3_DZ7 {
    public static void main(String[] args) {
        int rowSize = 3;
        int input = -1;
        char[] mas = new char[rowSize * rowSize];
        boolean valet = false;
        Scanner sc = new Scanner(System.in);
        zapolnenie(rowSize, mas);
        while (true) {
            showField(rowSize, mas);
            valet = false;
            while (!valet) {
                System.out.println("Выберите ячейку от 1 до 9 (кроме занятых) или 0 для выхода");
                input = askNumer();
                if (input == 0 || input >= 1 && input <= 9 && mas[input - 1] == '_') {
                    valet = true;
                }
            }
            if (input == 0) {
                break;
            }
            valet = false;
            while (!valet) {
                System.out.println("Введите символ, который будет поставлен в ячейку");
                try {
                    mas[input - 1] = sc.nextLine().charAt(0);
                    valet = true;
                } catch (Exception e) {
                }
            }
        }
    }

    private static int askNumer() {
        Scanner sc = new Scanner(System.in);
        int num = Integer.MIN_VALUE;
        while (num == Integer.MIN_VALUE) {
            try {
                num = Integer.valueOf(sc.nextLine());
            } catch (Exception e) {
                num = Integer.MIN_VALUE;
            }
        }
        return num;
    }

    private static void showField(int rowSize, char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            if ((i + 1) % rowSize == 0) {
                System.out.println();
            }
        }
    }

    private static char[] zapolnenie(int rowSize, char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = '_';
        }
        return mas;
    }
}
