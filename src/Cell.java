public class Cell {

    private boolean bomb; // om det är en bomb eller inte
    private int adjacent; // hur många bomber som är runt om
    private boolean cleared; // om cellen är "avslöjad"

    public Cell(boolean bomb, int adjacent, boolean cleared) {
        this.bomb = bomb;
        this.adjacent = adjacent;
        this.cleared = cleared;
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
    public char toChar(){
        if (!cleared){
            return 'x';
        } else if (bomb){
            return 'B';
        } else{
            return (char)adjacent; // Type-castar om int:en adjacent till en char
        }
    }
}
