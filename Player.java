public class Player{
    //global variable
    public static int FULL_HAND;

    //private variables
    private int num;
    private int score;
    private int numBid;
    private int numTricks;
    private int numOverTricks;
    private Card[] hand;//crtl-alt-k

    public Player(){

    }
    public Player(int num){

    }
    public void SetHand(Card[] hand){

    }
    public Card[] GetHand(){
        return null;
    }
    public void SetNumBid(int numBid){
        this.numBid = numBid;
    }
    public int GetNumBid(){
        return this.numBid;
    }
    
    public int GetNumTricks(){
        return this.numTricks;
    }
    public void AddTricks(){
        
    }
    public void AddTrickBonus(int trickBonus){

    }
    
    public void CalcScore(int score){
        this.score+=score;//adding score to val
    }
    public int GetScore(){
        return this.score;
    }
    public void NewRound(){

    }
    
}