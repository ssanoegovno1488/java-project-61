package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        scanner.close();
        return userName;
    }
}

