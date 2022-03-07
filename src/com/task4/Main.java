package com.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        Scanner scan = new Scanner(System.in);

        /* 1. Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
        Через пробел либо с новой строки. */

        System.out.println("Четные числа от 1 до 100: ");
        for (int i = 2; i <= 100; i = i + 2)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();

        /* 2. Ввести с клавиатуры два числа m и n.
        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. */

        System.out.println("Давай нарисуем прямоугольник из восьмерок?");
        System.out.print("Введи длину в символах: ");
        int m = scan.nextInt();
        System.out.print("Введи ширину в символах: ");
        int n = scan.nextInt();

        System.out.println("Треугольник из восьмерок:");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        System.out.println();

        /* 3. Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10. */

        System.out.println("Давай нарисуем прямоугольный треугольник из восьмерок, длиной 10х10?");
        System.out.println("Сам треугольник:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        System.out.println();

        /* 4. Используя цикл for вывести на экран:
        - горизонтальную линию из 10 восьмёрок
        - вертикальную линию из 10 восьмёрок. */

        System.out.println("Давай нарисуем линии из 10 восьмерок?");
        System.out.println("Горизонтальная линия:");
        for (int i = 1; i <= 10; i++)
            System.out.print("8");
        System.out.println();
        System.out.println("Вертикальная линия:");
        for (int i = 1; i <= 10; i++)
            System.out.println("8");
        System.out.println();

        /* 5. Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]. */

        System.out.println("Если тебя любят, зачем держать это в себе, верно?");
        System.out.print("Как зовут ту, что тебя любит? - ");
        String name = scan.next();
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.println(name + " любит меня.");
    }
}
