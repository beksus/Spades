public class SpadesSys{
    //GLOBAL VARIABLE FOR CARDS
    public final static int CLUBS = 1;
    public final static int DIAMONDS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;
    public final static int DEFAULT_NUM_PLAYERS=2;

    //private variables not initialized
    private Card[] deck;
    private Player[] allPlayers;
    private Player firstPlayer;
    private Player currPlayer;
    private Card[] currTrick;
    private int currLeadingSuit;
    /**
     * 
     */
    public SpadesSys(){
        
    }
    /**
     * @param numPlayers
     */
    public SpadesSys(int numPlayers){

    }
    /**
     * 
     */
    public void FillDeck(){

    }
    /**
     * 
     */
    public void DealCards(){

    }
    /**
     * @param playerNum
     */
    public void SetCurrPlayer(int playerNum){
        
    }
    /**
     * @return
     */
    public Player GetCurrPlayer(){
        return null;
    }
    /**
     * @param playerNum
     */
    public void SetFirstPlayer(int playerNum){
        //this.firstPlayer=playerNum;
    }
    /**
     * @return
     */
    public Player GetFirstPlayer(){
        return null;
    }
    /**
     * @param card
     * @return
     */
    public boolean Play(Card card){
        return false;//change val
    }
    /**
     * @return
     */
    public Player GetTrickTaker(){
        return null;
    }
    /**
     * @return
     */
    public Player TakeTrick(){
        return null;
    }
    /**
     * @return
     */
    public boolean IsRoundOver(){
        return false;//change val
    }
    /**
     * @return
     */
    public Player CheckWinner(){
        return null;
    }
    /**
     * @return
     */
    public boolean IsDeckEmpty(){
        return false;//change val
    }
}