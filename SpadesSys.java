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
     * @param playerNum set to the currPlayer 
     */
    public void SetCurrPlayer(int playerNum){
        this.currPlayer=allPlayers[playerNum];
    }
    /**
     * @return type Player
     */
    public Player GetCurrPlayer(){
        return this.currPlayer;
    }
    /**
     * @param playerNum
     */
    public void SetFirstPlayer(int playerNum){
        this.firstPlayer=this.allPlayers[playerNum];
    }
    /**
     * @return
     */
    public Player GetFirstPlayer(){
        return this.firstPlayer;
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
     * @return type boolean
     */
    public boolean IsRoundOver(){
        if(IsDeckEmpty()){
            return true;
        }
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
        if(deck.length==0){
            return true;
        }
        return false;//change val
    }
}