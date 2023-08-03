package tasks;

import java.util.Scanner;

public class task {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float res;
        do {
            res = getInputNumber();
        } while (res == -1);

        sc.close();
        System.out.println(res);
    }

    static float getInputNumber() {
        float a;

        try {
            if (sc.hasNextFloat()) {
                a = sc.nextFloat();
                return a;
            } else {
                System.out.println("Нужно ввести дробное число (с запятой) ");
                sc.next();
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Нужно ввести дробное число (с запятой) ");
            sc.next();
            return -1;
        }
    }
}