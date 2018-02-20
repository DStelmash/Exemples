import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать код,
 который выводит на экран квадратное поле в виде 9 символов подчеркивания
 _ _ _
 _ _ _
 _ _ _
 Затем спрашивает у пользователя, номер ячейки и символ, который поставить в эту ячейку,
 и заполняет выбранную ячейку заданым символом.
 Например, пользователь выбрал вторую ячейку и символ X
 Программа должны вывести на экран результат
 _ X _
 _ _ _
 _ _ _
 Недопустимо ставить символ в уже заполненную ячейку
 */
public class Urok5_dz6 {
    public static void main(String[] args) {
        int row = 3;
        char[] pole = new char[row * row];
        int cell = -1;
        boolean valet = false;
        Scanner str = new Scanner(System.in);
        Arrays.fill(pole, '_');
        while (true) {
            vivod(pole);
            valet = false;
            while (!(cell == 0 || (cell >= 1 && cell <= 9 && pole[cell - 1] == '_'))) {
                System.out.println("Введите ячейку куда буем ставить символ от 1 до 9 (0 для выхода)");
                try {
                cell = Integer.valueOf(str.nextLine());
                } catch (Exception e){
                }
            }
            if (cell == 0) {
                break;
            }
            while (!valet) {
                System.out.println("Введите символ который будем ставить в " + cell + " ячейку");
                try {
                    pole[cell - 1] = str.nextLine().charAt(0);
                    valet = true;
                } catch (Exception e) {
                }
            }
        }
    }

    private static void vivod(char[] pole) {
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
