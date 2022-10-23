public class Cell {
    private boolean isFlagged; // flaggar ?!?
    private boolean bomb; // om det är en bomb eller inte
    private int adjacent; // hur många bomber som är runt om
    private boolean cleared; // om cellen är "avslöjad"
    public Cell(boolean bomb, int adjacent, boolean cleared) {
        this.bomb = bomb;
        this.adjacent = adjacent;
        cleared = cleared;
        isFlagged = false;
    }
    public Cell(int y, int x, boolean b, Cell[][] clone){
        this.bomb = false;
        this.adjacent = 0;
        cleared = false;
        isFlagged = false;
    }
    public boolean isBomb() {
        return bomb;
    }
    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }
    public int getAdjacent() {
        return adjacent;
    }
    public void setAdjacent(int adjacent) {
        this.adjacent = adjacent;
    }
    public boolean isCleared() {
        return cleared;
    }
    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }
    public void flag() {
        isFlagged = true;
    }
    public void unflag() {
        isFlagged = false;
    }
    // metod för att "avslöja" cellen, returnerar 0 om det är en bomb och annars antal bomber runt om
    public int sweep(){
        this.cleared = true;
        if (bomb){
            return 0;
        } else{
            return adjacent;
        }
    }
    // metod för att få ut en char att skriva ut i GameBoarden
    public String toString(){
        if (!cleared){
            String notCleared = colourString(" * ", ANSI_YELLOW);
            return notCleared;
        } else if (isBomb()){
            String isBomb = colourString(" B ", ANSI_RED);
            return isBomb;
        } else if (adjacent > 0){
            String number = String.valueOf(adjacent);
            if (number.equals("1")) {
                String isNeighbour1 = colourString(number, ANSI_PURPLE);
                return " " + isNeighbour1 + " ";
            } else {
                String isNeighbour = colourString(number, ANSI_CYAN);
                return " " + isNeighbour + " ";
            }
        } else {
            String isCleared = colourString("[ ]", ANSI_GREEN);
            return isCleared;
        }
    }
    private String colourString(String str, String colour) {
        return colour + str + ANSI_RESET;
    }
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
}