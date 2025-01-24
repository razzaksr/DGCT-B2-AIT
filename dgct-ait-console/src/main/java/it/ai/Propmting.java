package it.ai;

import java.io.IOException;
import java.util.Scanner;

public class Propmting {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the app to open.... ");
        Runtime runObject = Runtime.getRuntime();// single ton
        Process process = runObject.exec(scanner.next());
    }
}
