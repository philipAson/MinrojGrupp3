public class GameBoard {

    // 2D Cell Array. Representing the "game board".
    private Cell cells [][];
    // Two int variables that represent width and height of the game board.
    private int width;
    private int height;
    // Constructor
    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        // Set the number of cells on Board (X x Y).
        cells = new Cell[width][height];
        // for loop for initializing the number of cells on the X and Y axis.
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[x][y] = new Cell();
            }
        }
    }
    // Prints the board
    public void printBoard() {
        for (int y = 0; y < height; y++) {
            System.out.println();
            for (int x = 0; x < width; x++) {
                System.out.print(cells[x][y].toString());
            }
        }
    }
    public void revealCell(int x, int y) {
        // Method .reveal is specified in Class:Cell.
        cells[x][y].sweep();
    }
}
