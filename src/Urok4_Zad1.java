
public class Urok4_Zad1 {
    public static void main(String[] args) {
        double rost = 1.8;
        double massa = 90;
        System.out.print("Индекс массы тела составляет " + indexTela(rost, massa));
    }

    private static double indexTela(double rost, double massa) {
        double index = massa / (rost * rost);
        return index;
    }
}
