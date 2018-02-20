package exemple_OOP;

public class cat {
    // ПЕРЕМЕННЫЕ
    String name;
    int age;
    int weight;

    //Конструкторы
    cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    //Методы
    void mur() {
        System.out.println("Murr");
    }
}
