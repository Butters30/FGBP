import java.util.Arrays;
public class HomeWork3 {
    public static void main(String[] args) {
        H1();
        H2();
        H3();
        H4();
        H5(7, 3);
    }

    // ЗАДАНИЕ 1
    public static void H1() {
        int[] H1 = {0, 0, 1, 0, 1, 1, 0, 0};
        int x = H1.length;
        for (int i = 0; i < x; i++) {
            if (H1[i] == 1) H1[i] = 0;
            else H1[i] = 1;
        }
        for (int y : H1) {
            System.out.println(y);
        }
    }

    //         ЗАДАНИЕ 2
    public static void H2() {
        int[] H2 = new int[100];
        for (int i = 0; i < 100; i++) {
            H2[i] = i + 1;
        }
        System.out.println(Arrays.toString(H2));
    }

    //        // ЗАДАНИЕ 3
    public static void H3() {
        int[] H3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int z = H3.length;
        for (int i = 0; i < z; i++) {
            if (H3[i] < 6) H3[i] = H3[i] * 2;
        }
        for (int j : H3) {
            System.out.print(j + " ");
        }
    }

    //ЗАДАНИЕ 4
    public static void H4() {
        int[][] H4 = new int[6][6];
        int u = H4.length;
        for (int i = 0; i < u; i++) {
            for (int j = 0; j < u; j++) {
                if (i == j) H4[i][j] = 1;
                else H4[i][j] = 0;
                System.out.print(H4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    //ЗАДАНИЕ 5
    public static void H5(int len, int initialValue) {
        int[] p = new int[len];
        for (int i = 0; i < len; i++) {
            p[i] = initialValue;
            System.out.print("[" + i + "]" + p[i] + " ");
        }
    }
}

