package hexlet.code;


public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = Cli.getUserName();
        System.out.println("Hello, " + userName + "!");
    }
}