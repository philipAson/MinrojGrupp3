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
        // instance variable
        Coordinate inputCoordinate;
        while (true){
            gameBoard.printBoard();
            inputCoordinate = getCoordinateInput();
            gameBoard.revealCell(inputCoordinate);
        }
    }
    public boolean isPositionValid (Coordinate coordinate) {
        if (!gameBoard.validPosition(coordinate)) {
            System.out.println("Not a valid position");
            return false;
        } else if (gameBoard.isCellRevealed(coordinate)) {
            System.out.println("Position has already been swept");
            return false;
        } else {
            return true;
        }
    }
    public Coordinate getCoordinateInput() {
        Coordinate input = new Coordinate(0,0);
        do {
           // System.out.println("\nEnter the coordinate you want to sweep by typing in Y(Space)X");
            // User sets coordinate to sweep
            System.out.println("\n Enter coordinate for Y");
            input.y = scanner.nextInt();

            System.out.println("\n Enter coordinate for X");
            input.x = scanner.nextInt();



        } while (!isPositionValid(input)); /// LÄGG TILLL VALIDPOSITION METOD INOM PARANTESERNA!!!!!!!!
        return input;
    }
}
