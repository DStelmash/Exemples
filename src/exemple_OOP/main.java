package exemple_OOP;

public class main {
    public static void main(String[] args) {
        final int SIZE = 10;
        cat[] cats = new cat[SIZE];

        cats[0] = new cat("Tom", 5, 2); //экземпляр класса или ОБЪЕКТ

        System.out.println(feedCat(cats[0]));
        cats[0].mur();  //вызов метода из класса
    }

    private static String feedCat(cat cat) {
        if (cat.age > 6) {
            cat.weight += 1;
        } else {
            cat.weight += 2;
        }
        return cat.name + " вес стал " + cat.weight;
    }

}
