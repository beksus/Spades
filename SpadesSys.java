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
//hello how are you
// how to upload the files in github?
    public SpadesSys(){
        
    }
    public SpadesSys(int numPlayers){

    }
    public void FillDeck(){

    }
    public void DealCards(){

    }
    public void SetCurrPlayer(int playerNum){
        
    }
    public Player GetCurrPlayer(){
        return null;
    }
    public void SetFirstPlayer(int playerNum){
        //this.firstPlayer=playerNum;
    }
    public Player GetFirstPlayer(){
        return null;
    }
    public boolean Play(Card card){
        return false;//change val
    }
    public Player GetTrickPlayer(){
        return null;
    }
    public Player TakeTrick(){
        return null;
    }
    public boolean IsRoundOver(){
        return false;//change val
    }
    public Player CheckWinner(){
        return null;
    }
    public boolean IsDeckEmpty(){
        return false;//change val
    }
}