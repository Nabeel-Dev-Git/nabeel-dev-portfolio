package patterns.module5;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(".");
            }

            for (int k = i+1; k <= (2*i) + 1; k++) {
                System.out.print(k);
            }

            for(int l = 2*i; l > i; l--) {
                System.out.print(l);
            }

            System.out.println();
        }


    }

}
