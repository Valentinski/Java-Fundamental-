package MethodsExercises;

import java.util.Scanner;

public class NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        matrix(n);
    }

    public static Integer matrix (int n){
        int element = n;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j <= n){
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
        return element;
    }
}
