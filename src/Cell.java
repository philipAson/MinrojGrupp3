public class Cell {
    private boolean isMine, isFlagged, isCovered;
    private int number;

    public Cell(){
        isMine = false;
        isFlagged = false;
        isCovered = false;
        number = 0;
    }
    public void flag() {
        isFlagged = true;
    }

    public void unflag() {
        isFlagged = false;
    }
    public void setMine() {
        isMine = true;
    }
    public boolean isMine(){
        return isMine;
    }

    public void reveal() {
        isCovered = false;
    }
    public void setNumber(int i){
        number = i;
    }
    public int getNumber(){
        return number;
    }
    public boolean isFlagged(){
        return isFlagged;
    }

    public boolean isCovered() {
        return isCovered;
    }
}
