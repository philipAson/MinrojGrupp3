public class GameBoard {

    //2D Array representing "Cells"
    private char[][] gameBoard = {
            {' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' '}};
    //Visual representation of gameboard.
    void printGameBoard() {
        System.out.println(
                "    1 | 2 | 3 | 4 | 5 | 6 |\n" +
                        "  ----+---+---+---+---+---|\n" +
                        "a | "+gameBoard[0][0]+" | "+gameBoard[0][1]+" | "+gameBoard[0][2]+" | "
                        +gameBoard[0][3]+" | "+gameBoard[0][4]+" | "+gameBoard[0][5]+" |\n"+
                        "  ----+---+---+---+---+---|\n" +
                        "b | "+gameBoard[1][0]+" | "+gameBoard[1][1]+" | "+gameBoard[1][2]+" | "
                        +gameBoard[1][3]+" | "+gameBoard[1][4]+" | "+gameBoard[1][5]+" |\n"+
                        "  ----+---+---+---+---+---|\n" +
                        "c | "+gameBoard[2][0]+" | "+gameBoard[2][1]+" | "+gameBoard[2][2]+" | "
                        +gameBoard[2][3]+" | "+gameBoard[2][4]+" | "+gameBoard[2][5]+" |\n"+
                        "  ----+---+---+---+---+---|\n" +
                        "d | "+gameBoard[3][0]+" | "+gameBoard[3][1]+" | "+gameBoard[3][2]+" | "
                        +gameBoard[3][3]+" | "+gameBoard[3][4]+" | "+gameBoard[3][5]+" |\n"+
                        "  ----+---+---+---+---+---|\n" +
                        "e | "+gameBoard[4][0]+" | "+gameBoard[4][1]+" | "+gameBoard[4][2]+" | "
                        +gameBoard[4][3]+" | "+gameBoard[4][4]+" | "+gameBoard[4][5]+" |\n"+
                        "  ----+---+---+---+---+---|\n" +
                        "f | "+gameBoard[5][0]+" | "+gameBoard[5][1]+" | "+gameBoard[5][2]+" | "
                        +gameBoard[5][3]+" | "+gameBoard[5][4]+" | "+gameBoard[5][5]+" |\n"+
                        "  ------------------------|\n");
    }
}
