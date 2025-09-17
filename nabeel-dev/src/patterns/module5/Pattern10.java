package patterns.module5;

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i <= n/2; i++) {

            for (int j =0; j <= (n/2)-i-1; j++) {
                System.out.print(".");
            }

            for (int k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int l = 1; l <= n/2; l++){
            for (int m = 1; m <= l; m++) {
                System.out.print(".");
            }
            for (int o = 1; o <= n-(2 * l); o++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
