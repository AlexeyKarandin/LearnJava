package fundamentals.main;


import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Hello! " + args[0]);

        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        for (int i = 0; i < Integer.parseInt(args[2]); ++i) {
            System.out.println((int) (Math.random() * 10) + " ");
        }
        for (int i = 0; i < Integer.parseInt(args[2]); ++i) {
            System.out.print((int) (Math.random() * 10) + " ");
        }
        System.out.println();

        // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        System.out.println("Сумма: " + args[3] + " + " + args[4] +
                " = " + (Integer.parseInt(args[3]) + Integer.parseInt(args[4])));
        System.out.println("Произведение: " + args[3] + " * " + args[4] +
                " = " + (Integer.parseInt(args[3]) * Integer.parseInt(args[4])));

        // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.
        String[] mounts = {"", "January", "February", "March", "April", "May", "June", "Jule", "August",
                "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        int enterNumber;
        do {
            System.out.print("Введите число в диапозоне [1,12]: ");
            enterNumber = scanner.nextInt();
        } while (!(enterNumber <= 12 && enterNumber >= 1));
        System.out.println("Соответствующий месяц: " + mounts[enterNumber]);

    }

}
