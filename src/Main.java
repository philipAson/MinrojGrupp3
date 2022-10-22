import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("*============================*");
        System.out.println("*============================*");
        System.out.println("*==Welcome to minesweeper!===*");
        System.out.println("*============================*");
        System.out.println("*============================*");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 enter name: ");
        String player = scanner.nextLine();

        Game game = new Game(new Scanner(System.in));
        game.startGame();
    }
}