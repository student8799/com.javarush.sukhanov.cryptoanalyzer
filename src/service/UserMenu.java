package service;

import java.util.Scanner;

public class UserMenu {
    public static final String WELCOME = " *** Шифрование методом Цезаря *** ";

    public void start() {
        System.out.println(WELCOME + "\n");
        printMenu();
        restart();
    }

    private void printMenu() {
        Menu[] menu = Menu.values();

        for (Menu userMenu : menu) {
            System.out.println(userMenu.getMenu() + ":" + userMenu.ordinal());
        }

        System.out.println();
        System.out.println("введите значение:");
    }

    private void userEnter(int value) {
        Process process = new Process();

        switch (value) {
            case 1:
                process.enterValues();
                process.coder();
                break;
            case 2:
                process.enterValues();
                process.decoder();
                System.out.println("файл расшифрован" + "\n");
                break;
            case 3:
                process.bruteForce();
                break;
            case 0:
                System.out.println("программа завершена");
                break;
        }
    }

    private void restart() {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;

        do {
            if (console.hasNextInt()) {
                int num = console.nextInt();
                if (num > 0 && num < Menu.values().length) {
                    userEnter(num);
                    printMenu();
                    System.out.println();
                } else if (num == 0) {
                    userEnter(num);
                    isExit = true;
                } else {
                    System.out.println("введите число из списка");
                }
            } else {
                System.out.println("введите число из списка");
                restart();
                isExit = true;
            }
        } while (!isExit);
    }
}
