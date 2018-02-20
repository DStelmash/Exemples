public class Urok2 { // Ctrl-Shift-Enter или Cmd-Shift-Enter
    public static void main(String[] args) {
        // СТЕК
        // в массивах можно хранить только примитивные типы данных
//        testStackOverflow(10); // Alt-Enter
//        testStackOverflow(); // Alt-Enter

        byte bt; // 1
        short sh; // 2
        int i = 2147483647; // 4
        long l = 4000000000L; // 8

        float f = 10.2f; // 4
        double d = 10.2; // 8

        boolean b = true; // 4

        char ch = 'E'; // 2 // единственный беззнаковый тип данных

        // КУЧА
        // ссылочные типы данных
        // все, что пишем с большой буквы + массивы
        // экземпляры классов

        Byte bt1 = 10;
        Byte bt2 = new Byte((byte) 10);
        Short sh1 = 10;
        Integer in1 = 10;
        Long l1;

        Float f1;
        Double d1;

        Boolean b1;
        Character ch1;

        String s = "hello";

        // "A" - всегда тип String
        // 'A' - всегда тип char

        System.out.println(Integer.MAX_VALUE);
        //testStackOverflow(50);
    }

    private static void testStackOverflow() {
        System.out.println("no params");
    }

    static void testStackOverflow(int i) { // 10802 чтобы память переполнилась в СТЕКЕ
        // sout + Tab
        System.out.println(i);
        testStackOverflow(i + 1);
    }
}