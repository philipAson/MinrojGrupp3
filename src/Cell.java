public class Cell {

    private boolean bomb;
    private int distance;
    private boolean cleared;

    public Cell(boolean bomb, int distance, boolean cleared) {
        this.bomb = bomb;
        this.distance = distance;
        this.cleared = cleared;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }
    
}
