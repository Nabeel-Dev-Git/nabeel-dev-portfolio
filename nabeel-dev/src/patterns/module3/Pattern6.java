package patterns.module3;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            int count = 0;
            for(int j = i; j <=n; j++) {
                System.out.print((char)(64+j) + " ");
                count++;
            }
            System.out.println();
        }

    }
}
