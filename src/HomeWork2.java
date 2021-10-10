public class HomeWork2 {
    public static void main (String [] args){
        task1(6,9);
        task2(-5);
        task3(22);
        task4(5, "i'll be back");
    }
    public static boolean task1(int x, int y) { //ЗАДАНИЕ 1
        boolean z = (x + y >= 10 && x + y <= 20);
        System.out.println(z);
        return z;
    }
    public static void task2(int a){ //ЗАДАНИЕ 2
        if (a >= 0){
            System.out.println("Положительное число");}
        if (a < 0){
            System.out.println("Отрицательное число");
        }
    }
    public static boolean task3(int d){ //ЗАДАНИЕ 3
        if (d >= 0) {
            System.out.println(false);
        return false;}
        else {
            System.out.println(true);
            return true;}
    }
    public static void task4(int times, String message){ //ЗАДАНИЕ 4
        for (int i = times; i < 8; i++){
            System.out.println(message);}
    }
}
