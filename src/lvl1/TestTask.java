package lvl1;

import java.util.Scanner;

public class TestTask {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = scanner.nextLine();
        System.out.println(calc(input));

    }

    public static String calc(String input) throws Exception {
        String[] j = input.split(" ");
        if (j.length < 3) {
            throw new Exception("т.к. строка не является математической операцией");
        }
        if (j.length > 3 || j[1].length() != 1) {

            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        int number1 = Integer.parseInt(j[0]);
        char symbol = j[1].charAt(0);
        if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/')
            throw new Exception("неизвестный символ, введите '+,-,*,/'");
        int number2 = Integer.parseInt(j[2]);
        if ((number1 >= 1 && number1 <= 10 && number2 >= 1 && number2 <= 10)) {
            int result = switch (symbol) {
                case '+' -> number1 + number2;
                case '*' -> number1 * number2;
                case '-' -> number1 - number2;
                case '/' -> number1 / number2;
                default -> 0;
            };
            return Integer.toString(result);
        } else throw new Exception("неподходящие числа, введите числа от 1 до 10");

    }
}
