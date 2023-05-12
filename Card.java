public abstract class Card{
    //global variables
    public final static int ACE = 1;
    public final static int JACK = 1;
    public final static int QUEEN = 1;
    public final static int KING = 1;
    private int val;
    
    //methods
    public Card(int val){

    }
    public int GetCard(){
        return 0;//change alter
    }
    public abstract int CalcTrickBonus();
}