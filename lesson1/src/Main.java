import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        String WelcomStr;
//        WelcomStr="Hello world";
//        System.out.println(WelcomStr);
//
//        String Name = "Alexandr";
//        String Surname = "Kapralov";
//        String space = " ";
//        System.out.println(Name + space + Surname);
//
//        int a = 2;
//        int b = 3;
//        int r = 5;
//        int result = a * r + b;
//        System.out.println("a * r + b = " + result);

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int res =  a * c + b;
        System.out.println("я ввёл: " + res);

    }
}