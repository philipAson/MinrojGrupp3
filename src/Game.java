import jdk.jfr.Percentage;

import java.util.Scanner;

public class Game {
    // Scanner for writing coordinates
    private Scanner scanner;
    // Instance variable Class Board
    private GameBoard gameBoard;
    // Default constructor
    public Game(Scanner scanner) {

        System.out.println("Please type in the size of your board.");
        int xy = sizeInput(scanner);
        System.out.println("please type in % of bombs");
        double bombPercentage = percentageInput(scanner);
        double totalMines = (xy * xy) * bombPercentage;
        gameBoard = new GameBoard(xy, xy, totalMines);
        gameBoard.MineGenerator();
        gameBoard.setCellAdjacent();
    }
    public double percentageInput(Scanner scanner){
        double bombPercentage ;
        while (true) {


            try {
                String percentage = scanner.nextLine();
                bombPercentage = Double.parseDouble(percentage) / 100;

                // Om man försöker att lägga in mer än 100 procent på bomber så får man not valid.
                // Och en chans att skriva in igen .
                if  (bombPercentage >= 1.0) {
                    throw new Exception();

                }



               return bombPercentage;




            } catch (Exception e) {

                    System.out.println("Not a valid percentage");

                }


            }

    }


    public int sizeInput(Scanner scanner) {
        while (true) {
            try {
                String size = scanner.nextLine();
                int xy = Integer.parseInt(size);
                return xy;
            } catch (Exception e) {
                System.out.println("Not a valid size");
            }
        }
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
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            try {
                do {
                    System.out.println("\n\nEnter coordinate for X");
                    String x = scanner2.nextLine();
                    input.x = Integer.parseInt(x) -1;

                    System.out.println("Enter coordinate for Y");
                    String y = scanner2.nextLine();
                    input.y = Integer.parseInt(y) - 1;
                } while (!isPositionValid(input));
                return input ;

            } catch (Exception e){
                System.out.println("Cant read coordinate");
            }
        }
    }
}