public class Player {

    private String name;
    private int numberOfWins;

    public Player(String name) {
        this.name = name;
        numberOfWins = 0;
    }

    public void addWin(){
        numberOfWins = numberOfWins + 1;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }
}
