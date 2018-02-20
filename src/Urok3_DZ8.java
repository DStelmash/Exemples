import java.util.Scanner;

///**
// * Написать код,
// который расширяет возможности кода из упражнения 7 так, что
// вводят символы два пользователя по очереди. Тот игрок, у которого будет три одинаковых символа
// в одной линии, станет победителем.
// Например, игрок 1 вводит символы X, игрок 2 вводит символы 0
// _ X _
// 0 01
// _ _ _
// Игрок 2 победил.
// */
public class Urok3_DZ8 {
    public static void main(String[] args) {
        int rowSize = 3;
        int input = -1;
        char[] mas = new char[rowSize * rowSize];
        boolean valet = false;
        Scanner sc = new Scanner(System.in);
        char firstPlayerSymbol = 'x';
        char secondPlayerSymbol = 'o';
        boolean firstPlayerMove = false;
        //заполнение игрового поля
        zapolnenie(mas);
        //вывод игрового поля с заполненными ячейками
        showField(rowSize, mas);
        while (true) {
            firstPlayerMove = !firstPlayerMove;
            //смена хода игроков
            if (firstPlayerMove) {
                System.out.println("Ходит первый игрок");
            } else {
                System.out.println("Ходит второй игрок");
            }

            valet = false;
            // выбор ячейки для заполнения
            while (!valet) {
                System.out.println("Выберите ячейку от 1 до 9 (кроме занятых) или 0 для выхода");
                //  askNumer() - запрос ячейки в которую записывать символ
                input = askNumer();
                // проверка на то что ячейчка пустая
                if (input == 0 || input >= 1 && input <= 9 && mas[input - 1] == '_') {
                    valet = true;
                }
            }
            // прерывание -  выход из игры если нажат 0
            if (input == 0) {
                break;
            }
            // присвоение ячейки символа игрока х или 0
            if (firstPlayerMove) {
                mas[input - 1] = firstPlayerSymbol;
            } else {
                mas[input - 1] = secondPlayerSymbol;
            }
            // вывод заполненного игрового поля
            showField(rowSize, mas);
            // опредение победителя
            int state = getGameState(mas, rowSize, firstPlayerSymbol, secondPlayerSymbol);
            switch (state) {
                case 0:
                    System.out.println("Ничья");
                    return;
                case 1:
                    System.out.println("Первый игрок победил");
                    return;
                case 2:
                    System.out.println("Второй игрок победил");
                    return;
            }
        }
    }

    // функция проверки соотвесвия условию три одинаковых символа в строке или по диагонали
    private static int getGameState(char[] mas, int rowSize, char firstPlayerSymbol, char secondPlayerSymbol) {
        for (int i = 0; i < mas.length; i += rowSize) {
            // проверка по строкам
            if (mas[i] == mas[i + 1] && mas[i + 1] == mas[i + 2]) {
                if (mas[i] == firstPlayerSymbol) {
                    return 1;
                }
                if (mas[i] == secondPlayerSymbol) {
                    return 2;
                }
            }
        }
        // проверка по диагонали с слева на право
        for (int i = 0; i < rowSize; i++) {
            if (mas[i] == mas[i + rowSize] && mas[i] == mas[i + 2 * rowSize]) {
                if (mas[i] == firstPlayerSymbol) {
                    return 1;
                }
                if (mas[i] == secondPlayerSymbol) {
                    return 2;
                }
            }
        }
        // проверка по первому столбику
        if (mas[0] == mas[rowSize + 1] && mas[0] == mas[mas.length - 1]) {
            if (mas[0] == firstPlayerSymbol) {
                return 1;
            }
            if (mas[0] == secondPlayerSymbol) {
                return 2;
            }
        }
        // проверка по второму столбику
        if (mas[rowSize - 1] == mas[rowSize + 1] && mas[rowSize + 1] == mas[2 * rowSize]) {
            if (mas[rowSize - 1] == firstPlayerSymbol) {
                return 1;
            }
            if (mas[rowSize - 1] == secondPlayerSymbol) {
                return 2;
            }
        }
        boolean empty = false;
        for (char c : mas) {
            if (c == '_') {
                empty = true;
                break;
            }
        }
        if (!empty) {
            return 0;
        }
        return -1;
    }

    // функция запроса номера ячейки в которую ставить будем символ
    private static int askNumer() {
        Scanner sc = new Scanner(System.in);
        // потому что 0 нельзя, т.к. массив с 0-го элемента начинается, а ввести можно любое число
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

    // выводит массив в  виде игрового поля 3*3 на экран
    private static void showField(int rowSize, char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            if ((i + 1) % rowSize == 0) {
                System.out.println();
            }
        }
    }

    // заполнение массива пустыми значеньями
    private static char[] zapolnenie(char[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = '_';
        }
        return mas;
    }
}

