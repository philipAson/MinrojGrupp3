import java.util.Random;

public class GameBoard {

    // 2D Cell Array. Representing the "game board".
    private Cell cells [][];
    // Two int variables that represent width and height of the game board.
    private int width;
    private int height;
    // Constructor
    int totalMines;
    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        // Set the number of cells on Board (X x Y).
        cells = new Cell[width][height];
        // for loop for initializing the number of cells on the X and Y axis.
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[x][y] = new Cell(y, x, false, cells.clone());
            }
        }
    }
    // Prints the board
    public void printBoard() {
        for (int y = 0; y < height; y++) {
            System.out.print(" " + y + " ");
        }
        System.out.println("");
        for (int y = 0; y < height; y++) {
            System.out.println();
            for (int x = 0; x < width; x++) {
                System.out.print(cells[x][y].toString());
            }
            System.out.print("   " + y);
        }
    }
    public void revealCell(Coordinate coordinate) {
        // Method .reveal is specified in Class:Cell.
        cells[coordinate.x][coordinate.y].sweep();
    }

    public boolean hasWon(){
        for (Cell[] i : cells){ //för alla kolumner i 2D arrayen
            for (Cell j : i){ //för alla celler i kolumnen
                if (!j.isCleared() && !j.isBomb()){ //om någon cell inte är "vänd på" (om den inte är en bomb)
                    return false; //då har man inte vunnit
                }
            }
        }
        return true; //annars har man vunnit (om alla celler förutom bomber är "vända på")
    }

    public void MineGenerator() {

        int currentMines = 0;
        Random random = new Random();

        while (currentMines < totalMines){

            for (int y = 0; y <height; y++){
                for (int x = 0; x < width; x++){

                    double chance = random.nextDouble();

                    if(cells[y][x] == null){
                        cells[y][x] = new Cell(y,x,false, cells.clone());

                    } else if (cells[y][x].isBomb()){
                    } else if(chance > 0.99 && currentMines < totalMines){
                        cells[y][x] = new Cell(y, x,true, cells.clone());
                        currentMines++;
                    }
                }
            }


        }

    }
    public boolean validPosition(Coordinate coordinate) {
        /*A valid position is one that matches with coordinates inside the bounds of the cells array.
        We already have a width and height variable, and arrays start at 0 so these can be used to check the validity.
        The method should return true if all the following conditions are true.
        If any are false, the result should be false.*/
        if (coordinate.x >= 0 && coordinate.y >= 0 && coordinate.x < width && coordinate.y < height) {
            return true;
        } else {
            return false;
        }
    }
    // Checks if the coordinate is already revealed. Method specified in Class: Cell.
    public boolean isCellRevealed(Coordinate coordinate) {
        return cells[coordinate.x][coordinate.y].isCleared();
    }
}