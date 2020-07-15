package ru.kondratenko.tm;

import ru.kondratenko.tm.constant.TerminalConst;

import java.util.Arrays;
import java.util.Scanner;

import static ru.kondratenko.tm.constant.TerminalConst.*;

public class App {

    public static void main(final String[] args) {
        displayWelcome();
        process();
    }

    private static void process() {
        final Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!EXIT.equals(command)) {
            command = scanner.nextLine();
            run(command);
            System.out.println();
        }
    }

    private static int run(final String param) {
        if (param == null || param.isEmpty()) System.exit(-1);
        switch (param) {
            case VERSION:
                return displayVersion();
            case ABOUT:
                return displayAbout();
            case HELP:
                return displayHelp();
            case EXIT:
                return displayExit();
            default:
                return displayError();
        }
    }

    private static int displayError() {
        System.out.println("Error! Unknown program argument...");
        return -1;
    }

    private static int displayExit() {
        System.out.println("Terminate console application...");
        return 0;
    }

    private static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

    private static int displayHelp() {
        System.out.println("version - Display application version.");
        System.out.println("about - Display developer info.");
        System.out.println("help - Display list of commands.");
        System.out.println("exit - Terminate console application.");
        return 0;
    }

    private static int displayVersion() {
        System.out.println("1.0.0");
        return 0;
    }

    private static int displayAbout() {
        System.out.println("Kondratenko Iulia");
        System.out.println("kondratenko_yg@nlmk.com");
        return 0;
    }

}
