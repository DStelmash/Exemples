import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * По памяти или пересмотрите лекцию и сделайте зачаток игры крестики-нолики.
 Пока без ввода-вывода от пользователя.
 Просто создайте и проинициализируйте массивы, затем сделайте главный игровой цикл.
 В этом цикле сделайте так, что как будто игроки ходят по очереди,
 и в каждый проход цикла в консоли отображается обновленное игровое поле.
 */
public class Urok4_DZ {
    public static void main(String[] args) {
        int row = 3;
        char [][] pole = new char[row][row];
        char firsthPlayerSymbol = 'x';
        char secondPlayerSymbol = '0';
        boolean firsthPlayerMove = false;
        boolean valet = false;
        int input = -1;
        zapolnenie (pole);
        showField (pole);
        while (true){
            firsthPlayerMove =!firsthPlayerMove;
            if (firsthPlayerMove){
                System.out.println("Ходит первый игрок");
            } else {
                System.out.println("Ходит второй игрок");
            }
            while (!valet){
                System.out.println("выберите координату (от 1 до 9) куда ходить или нажмите 0 для выхода");
                input = askNumber ();
                if (input == 0 || input >= 1 && input <= 9) {
                    valet = true;   
                    }
                }
            if (input == 0){
                break;
            }
            //условие прислове ячейки символа первого или второго игрока
            showField (pole);
        }
    }

    private static void zapolnenie(char[][] pole) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[i][j] = '.';
            }
        }
    }

    private static void showField(char[][] pole) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole [i][j]+ " ");
            }
            System.out.println();
        }
    }


    private static int askNumber() {
    //написать выбор ячейки если 0 то 0,0, если 1 то 0,1, если 2, то 0,2, если 4 то 1,0 и т.д.
    //как вернуть кордмнаты двумерного массива, например (2,2)???
    return 1;
    }
}
