import java.util.Scanner;

public class Game {
    // Scanner for writing coordinates
    private Scanner scanner;
    // Instance variable Class Board
    private GameBoard gameBoard;

    // Default constructor
    public Game(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        // Sets the default board to be 10 x 10 cells
        gameBoard = new GameBoard(10, 10);
    }

    // **********************
    void startGame() {
        // Prints board to Terminal
        gameBoard.printBoard();
        System.out.println("\nEnter your coordinate you want to sweep by typing in X(Space)Y");
        // User sets coordinates to sweep
        int posX = scanner.nextInt();
        int posY = scanner.nextInt();
        System.out.println("You entered the coordinates " + posX + " and " + posY + ".");
        /* "Reveals" chosen cell by setting boolean isRevealed to true.
        Thereby Cell.toString returns [ ] instead of * .                                            */
        gameBoard.revealCell(posX, posY);
        // Prints board with cell(s) revealed
        gameBoard.printBoard();
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }
}
