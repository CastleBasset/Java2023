import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // test commit
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начальное число: ");
        int start = input.nextInt();
        System.out.print("Введите конечное число: ");
        int end = input.nextInt();
        System.out.print("Введите делитель: ");
        int divider = input.nextInt();
        int res = 0;
        for (; start <= end; start++) {
            if (start % divider == 0) {
                res += start;
            }
        }
        System.out.println("Сумма чисел от " + start + " до " + end + " кратных " + divider + " равна " + res);
    }
}