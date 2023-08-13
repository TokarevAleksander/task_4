import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число х: ");
        double x = scanner.nextDouble();

        System.out.print("Введите число у: ");
        double y = scanner.nextDouble();

        System.out.print("Введите число z: ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3;

        int result = (int) Math.floor(average / 2);

        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Результат деления на 2 и округления: " + result);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}