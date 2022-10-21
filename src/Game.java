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
        gameBoard.MineGenerator();
        gameBoard.setCellAdjacent();

    }

    // **********************
    void startGame() {
        // instance variable
        Coordinate inputCoordinate;
        while (true){
            gameBoard.printBoard();
            inputCoordinate = getCoordinateInput();
            gameBoard.revealCell(inputCoordinate);
            if (gameBoard.isBombHit(inputCoordinate)){
                gameBoard.printBoard();

                System.out.println("\nYou Lose!");
                break;
            }
            if (gameBoard.hasWon()){
                gameBoard.printBoard();
                System.out.println("\nYou Win!" );
                break;
            }
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
        // System.out.println("\nEnter the coordinate you want to sweep by typing in Y(Space)X");
        // User sets coordinate to sweep
        // Also catches exception
        while (true) {
            try {
                do {
                    System.out.println("\n\nEnter coordinate for X");
                    String x = scanner.nextLine();
                    input.x = Integer.parseInt(x) -1;

                    System.out.println("Enter coordinate for Y");
                    String y = scanner.nextLine();
                    input.y = Integer.parseInt(y) - 1;
                } while (!isPositionValid(input));
                return input ;

            } catch (Exception e){
                System.out.println("Cant read coordinate");
            }
        }
    }
}