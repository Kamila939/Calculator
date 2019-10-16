import java.util.Scanner;

public class Calculator {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Введите по одной переменные");
        a = scanner.nextInt();
        b = scanner.nextInt();
        char c = scanner.nextLine().charAt(0);
        int result;
        float result1;
        if (c == '+') {
            result = plus(a, b);
        }
        else if(c == '-'){
            result = minus(a, b);
        }
        else if(c == '*'){
            result = multiple(a, b);
        }
        else if(c == '/'){
            result = div(a, b);
        }
    }
    private static int div(int a, int b) {
        return a / b;
    }

    private static int multiple(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int plus(int a, int b) {
        return a + b;

    }


}

