public class Cell {

    private boolean isRevealed;
    // Default constructor for isRevealed that sets it to false;
    public Cell() {
        this.isRevealed = false;
    }
    // Reveals a cell and set isRevealed to true;
    public void reveal() {
        isRevealed = true;
    }
    // isRevealed getter
    public boolean getIsRevealed() {
        return isRevealed;
    }
    /* To String method > returns "string"
    This method will be used to determine what character to show representing the state of the cell. */
    public String toString() {
        if (getIsRevealed()) {
            return "[ ]";
        } else {
            return " * ";
        }

    }
}
