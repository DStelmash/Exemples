
public class Urok4 {
    public static void main(String[] args) {
        int hp = testRandom(20, 100);
        int damege = testRandom(10, 50);
        int shield = testRandom(40, 80);
        System.out.printf("Хиты: %d; Повреждение: %d; Защита: %d %n", hp, damege, shield);

        int resultDamege = damege - shield;
        if (resultDamege > 0) {
            hp -= resultDamege;
            damege -= shield;
            shield = 0;
        } else {
            shield -= damege;
            damege = 0;
        }
        System.out.printf("Хиты: %d; Повреждение: %d; Защита: %d %n", hp, damege, shield);
    }


    static int testRandom(int from, int to) {
        int result;
        result = (int) (from + Math.random() * (to - from)); // формируем случайное значение и преобразуем в инт
        return result;
    }
}