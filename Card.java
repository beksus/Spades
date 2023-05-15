public abstract class Card{
    //global variables
    public final static int ACE = 14;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    private int val;
    
    //methods
    /**
     * @param val
     */
    public Card(int val){

    }
    /**
     * @return
     */
    public int GetVal(){
        return this.val;//change alter
    }
    /**
     * @return
     */
    public abstract int CalcTrickBonus();
}