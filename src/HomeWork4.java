
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static int SIZE = 5;
    public static char DOT_EMPTY = '•';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        showMap();
        while (true) {
            humanTurn();
            showMap();
            if (isWinner(DOT_X) || isWinnerDs(DOT_X)) {
                System.out.println("John Connor Win"); break;}
            if (isMapFull()) {
                System.out.println("Draw"); break;}
            aiTurn();
            showMap();
            if (isWinner(DOT_O) || isWinnerDs(DOT_O)) {
                System.out.println("T-800 Win"); break;}
            if (isMapFull()) {
                System.out.println("Draw"); break; }
    }
        System.out.println("GAME OVER");
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1));
            System.out.print((" "));
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]);
               System.out.print((" ")); }
            System.out.println(); }
        System.out.println();
    }
    public static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static void aiTurn() {
        int x;
        int y;
        Random myRandom = new Random();
        do {
            x = myRandom.nextInt(SIZE);
            y = myRandom.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точки: ");
        System.out.println("X-" + (x + 1));
        System.out.println("Y-" + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)  return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

public static boolean isWinner(char symb) {
    boolean F1 = true, T1 = true;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            F1 &= (map[i][j] == symb);
            T1 &= (map[j][i] == symb);}
        if (F1 || T1) return true;
    }
    return false;
}
    public static boolean isWinnerDs(char symb) {
        boolean F2 = true, T2 = true;
        for (int i = 0; i < 4; i++) {
            F2 &= (map[i][i] == symb);
            T2 &= (map[4-i-1][i] == symb);
        }
        if (F2 || T2) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }
}
//        int[] A1 = {map[0][0], map[0][1], map[0][2]};
//        int[] B2 = {map[1][0], map[1][1], map[1][2]};
//        int[] C3 = {map[2][0], map[2][1], map[2][2]};
//        int[] D4 = {map[0][0], map[1][1], map[2][2]};
//        int[] E5 = {map[0][0], map[1][0], map[2][0]};
//        int[] F6 = {map[0][1], map[1][1], map[2][1]};
//        int[] G7 = {map[0][2], map[1][2], map[2][2]};
//        int a = A1.length, b = B2.length, c = C3.length, d = D4.length, e = E5.length, f = F6.length, g = G7.length;
//        if (a == symb || b == symb || c == symb || d == symb || e == symb || f == symb || g == symb);

//    public static boolean isWinner(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
//            return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
//            return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
//            return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
//            return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb)
//            return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb)
//            return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb)
//            return true;
//        return false;
//    }