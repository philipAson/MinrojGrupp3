import java.util.Scanner;


public class Game {
    // Scanner for writing coordinates
    private Scanner scanner = new Scanner(System.in);

    // Instance variable Class Board
    private GameBoard gameBoard;



    // Default constructor
    public Game(Scanner scanner) {
        // Sets the dynamic board
        System.out.println("Enter desired width and height");
        int gameboardx = scanner.nextInt();
        int gameboardy = scanner.nextInt();
        gameBoard = new GameBoard(gameboardx, gameboardy );
        //setGameboard();
        gameBoard.MineGenerator();
        gameBoard.setCellAdjacent();
        //getGameboard();
    }

    public GameBoard getGameboard() {
        return this.gameBoard;
    }

    // **********************
    void startGame() {
        // instance variable
        Coordinate inputCoordinate;
        while (true) {
            gameBoard.printBoard();
            inputCoordinate = getCoordinateInput();
            gameBoard.revealCell(inputCoordinate);
            if (gameBoard.isBombHit(inputCoordinate)) {
                gameBoard.printBoard();

                System.out.println("\nYou Lose!");
                break;
            }
            if (gameBoard.hasWon()) {
                gameBoard.printBoard();
                System.out.println("\nYou Win!");
                break;
            }
        }
    }

    public boolean isPositionValid(Coordinate coordinate) {
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
    public int setGameboard() {
        System.out.println("Enter desired width and height");
        int gameboardx = scanner.nextInt();
        int gameboardy = scanner.nextInt();
        return gameboardx;

    }


    public Coordinate getCoordinateInput() {
        Coordinate input = new Coordinate(0, 0);
        // System.out.println("\nEnter the coordinate you want to sweep by typing in Y(Space)X");
        // User sets coordinate to sweep
        // Also catches exception
        while (true) {
            try {
                do {
                    System.out.println("\n\nEnter coordinate for X");
                    String x = scanner.nextLine();
                    input.x = Integer.parseInt(x) - 1;

                    System.out.println("Enter coordinate for Y");
                    String y = scanner.nextLine();
                    input.y = Integer.parseInt(y) - 1;
                } while (!isPositionValid(input));
                return input;

            } catch (Exception e) {
                System.out.println("Cant read coordinate");
            }
        }
    }


}
