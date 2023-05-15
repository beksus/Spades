public class Player{
    //global variable
    public final static int FULL_HAND=13;

    //private variables
    private int num;
    private int score;
    private int numBid;
    private int numTricks;
    private Card[] hand;

    /**
     * 
     */
    public Player(){

    }
    /**
     * @param num
     */
    public Player(int num){

    }
    /**
     * @param hand
     */
    public void SetHand(Card[] hand){
        this.hand = hand;
    }
    /**
     * @return
     */
    public Card[] GetHand(){
        return this.hand;
    }
    /**
     * @param numBid
     */
    public void SetNumBid(int numBid){
        this.numBid = numBid;
    }
    /**
     * @return
     */
    public int GetNumBid(){
        return this.numBid;
    }
    
    /**
     * @return
     */
    public int GetNumTricks(){
        return this.numTricks;
    }
    /**
     * 
     */
    public void AddTrick(){
        this.numTricks++;
    }
    /**
     * @param trickBonus
     */
    public void AddTrickBonus(int trickBonus){
        this.numTricks+=trickBonus;
    }
    
    /**
     * @param score
     */
    public void CalcScore(int score){
        this.score+=score;//adding score to val
    }
    /**
     * @return
     */
    public int GetScore(){
        return this.score;
    }
    /**
     * 
     */
    public void NewRound(){
        if(this.hand.length==0){
            this.numTricks=0;
            this.numBid=0;
        }
    }
}