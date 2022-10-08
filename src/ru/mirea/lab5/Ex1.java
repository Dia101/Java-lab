package ru.mirea.lab5;

import java.util.Scanner;

public class Ex1 {
        public static void recursion1(int n){
            for (int i=1; i!=n+1; i++){
                for (int j=0; j!=i; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        private static void recursion2(int n) {
            for (int i=1; i!=n+1; i++)
            {
                System.out.print(i); // вызов рекурсивной функции
            }
            System.out.println();
        }

        private static void recursion3(int n1, int n2) {
            if (n2<n1){
                int t = n1;
                n1 = n2;
                n2=t;
            }
            for (int i=n1; i!=n2+1; i++)
            {
                System.out.print(i); // вызов рекурсивной функции
            }
            System.out.println();
        }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите значение для первой рекурсии:");
            int nfirst = in.nextInt();
            recursion1(nfirst);

            System.out.println("Введите значение для второй рекурсии:");
            nfirst = in.nextInt();
            recursion2(nfirst);

            System.out.println("Введите значение для третьей рекурсии:");
            nfirst = in.nextInt();
            int nsecond = in.nextInt();
            recursion3(nfirst, nsecond);
    }


}
