public class HWApp { // ЗАДАНИЕ 1
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() { // ЗАДАНИЕ 2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() { // ЗАДАНИЕ 3
        int a = 7, b = 13;
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else if (a + b >= 0) {
            System.out.println("Сумма положительная");}
    }
    public static void printColor() { // ЗАДАНИЕ 4
        int value = 66;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        } else if (value >= 101) {
            System.out.println("Зеленый");}
    }
    public static void compareNumbers() { // ЗАДАНИЕ 5
        int a = 23, b = 44;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b){
            System.out.println("a < b");
        }
    }
    }
