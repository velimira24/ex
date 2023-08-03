package tasks;

import java.util.InputMismatchException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на ноль!");
        } catch (Throwable ex) {
            System.out.println("Попробуйте еще раз.");
        }
    }

    public static void printSum(Integer a, Integer b) throws InputMismatchException {
        System.out.println(a + b);
    }
}
