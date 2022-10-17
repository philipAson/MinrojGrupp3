public class Cell {
    // om det är en bomb eller inte
    private boolean bomb;

    // är platsen redan röjd
    private boolean clear;

    // ger oss ett nummer som indikerar närheten till bomb
    private int bombNear;



    //
    // förklarar en cell som bomb.

    public void bombPlace(){
        bomb = true;




    }
    // vi får true om cell är en bomb
    public boolean bombHit(){
        return bomb;
    }

    






    // exempel är att det kommer en siffra mellan 1-3 beroende på hur nära man är "bomben".

    //Den ska också meddela om det är upptaget redan eller om man träffar en "bomb" på GameBoard.

    //







}
