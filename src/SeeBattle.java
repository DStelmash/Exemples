import java.util.Arrays;
import java.util.Scanner;

/**
 * Плоский морской бой в процедурном стиле с одним короблем
 */
public class SeeBattle {
    public static void main(String[] args) {
        doGame();
    }

    static void doGame() {
        char[] cells;
        char[] temp;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер поля");
        size = sc.nextInt();
        sc.nextLine();
        cells = new char[size];
        temp = new char[size];
        Arrays.fill(temp, '.');
        Arrays.fill(cells, '.');
        int shipPosition = 0;
        shipPosition = (int) (Math.random() * (size));
        cells[shipPosition] = 'X';
        int shoot = 0;

        do {
            while (cells[shoot] == 'X') ;
            {
                System.out.println(temp);
                System.out.println("Укажите куда будем стрелять");

                while (true) {
                    if (sc.hasNextInt()) {
                        shoot = (sc.nextInt() - 1);
                        break;
                    } else {
                        sc.nextLine();
                    }
                }
                switch (cells[shoot]) {
                    case '.':
                        System.out.println("Промах");
                        temp[shoot] = '*';
                        cells[shoot] = '*';
                        break;
                    case 'X':
                        System.out.println("Попали");
                        temp[shoot] = '#';
                        cells[shoot] = '#';
                        break;
                    case '*':
                        System.out.println("Уже сюда стреляли");
                        break;
                }
            }
        } while (cells[shipPosition] == 'X');
        System.out.println(temp);

    }
}
