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
        Player player = new Player(scanner.nextLine());

        while (true) {
            Game game = new Game(new Scanner(System.in), player);
            game.startGame();
            System.out.println(player.getName() + " has won " + player.getNumberOfWins() +
                    " times. Would you like to play again? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equals("n") || choice.equals("N")){
                break;
            }
        }
    }
}