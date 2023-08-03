package tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws myException {
        System.out.print("Введите число: ");
        String num = checkedInputUser();
        System.out.println(num);
    }

    static String checkedInputUser() throws myException {
        String a = null;
        Scanner sc = new Scanner(System.in);
        while (a == null || a.trim().isEmpty()) {
            try {
                a = sc.nextLine();
                if (a.trim().isEmpty()) {
                    throw new myException("Пустая строрка, повторите ввод!");
                }
            } catch (myException e) {
                System.out.println(e.getMessage());
                System.out.print("Повторите ввод: ");
            }
        }
        return a;
    }

    static class myException extends Exception {
        public myException(String message) {
            super(message);
        }
    }
}
