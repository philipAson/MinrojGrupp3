public class Cell {

// <<<<<<< philip (behåller för att underlätta implementering till Game och GameBoard)
//    private boolean isRevealed;
    // Default constructor for isRevealed that sets it to false;
//    public Cell() {
//        this.isRevealed = false;
//    }
    // Reveals a cell and set isRevealed to true;
//    public void reveal() {
//        isRevealed = true;
//    }
    // isRevealed getter
//    public boolean getIsRevealed() {
//        return isRevealed;
//    }
    /* To String method > returns "string"
    This method will be used to determine what character to show representing the state of the cell. */
//    public String toString() {
//        if (getIsRevealed()) {
//            return "[ ]";
//        } else {
//            return " * ";
//        }
// =======

    private boolean isFlagged; // flaggar ?!?
    private boolean bomb; // om det är en bomb eller inte
    private int adjacent; // hur många bomber som är runt om
    private boolean cleared; // om cellen är "avslöjad"

    private boolean alreadyTaken; // om cellen redan är avslöjad

    public Cell(boolean bomb, int adjacent, boolean cleared) {
        this.bomb = bomb;
        this.adjacent = adjacent;
        cleared = cleared;
        isFlagged = false;
        alreadyTaken = false;
    }

    public Cell(int y, int x, boolean b, Cell[][] clone){
        this.bomb = false;
        this.adjacent = 0;
        cleared = false;
        isFlagged = false;
        alreadyTaken = false;
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
            return " * ";
        } else {
            return "[ ]";
        }
    }

    public boolean isAlreadyTaken() {
        return alreadyTaken;
    }
    public void AlreadyTaken() {
        if (alreadyTaken) {
            throw new IllegalStateException("This cell is already revealed!");
        }
    }
}
