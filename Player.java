public class Player{

    //private variables
    private int num;
    private int score;
    private int numBid;
    private int numTricks;
    private int numOvertricks;
    private Card[] hand;
    private Card currPlay;
    
    /**constructor
     * @param num - setting the input num to the this.num
     */
    public Player(int num){
       this.num = num;
    }
    
    public int GetNum(){
       return this.num;
    }
    
    /**Method
     * @param hand - setting the hand to this.hand
     */
    public void SetHand(Card[] hand){
       this.hand = hand;
    }
    
    /**Method
     * @return this.hand
     */
    public Card[] GetHand(){
       return this.hand;
    }
    
    /**Method
     * @param numBid - is setting the this.numBid to the input value
     */
    public void SetNumBid(int numBid){
       this.numBid = numBid;
    }
    
    /**Method
     * @return numBid
     */
    public int GetNumBid(){
       return this.numBid;
    }
    
    public void SetCurrPlay(Card play) {
       this.currPlay = play;
    }
    
    public Card GetCurrPlay() {
       return this.currPlay;
    }
    
    /**Method
     * adding adding 1 to the numTricks each time when it called
     */
    public void AddTrick(){
       this.numTricks++;
    }
    
    /**Method
    * @return numTricks 
     */
    public int GetNumTricks(){
       return this.numTricks;
    }
    
    /**Method
     * @param trickBonus - adding the tricks for numTricks
     */
    public void AddTrickBonus(int trickBonus){
       this.score+=trickBonus;
    }
    
    /**Method
     * @param score - adding the point earned to the score
     */
    public void CalcScore(int score){
       if (this.numTricks >= this.numBid) {
          this.score += this.numBid*10;
          this.numOvertricks += this.numTricks - this.numBid;
          if (this.numOvertricks >= 10) {
             this.score -= 100;
             this.numOvertricks = 0;
          }
       }
    }
    
    /**Method
     * @return type int - returning the player's score
     */
    public int GetScore(){
       return this.score;
    }
    
    /**Method
     * resetting the variables for numTricks and numBid if the round is new 
     * by getting the length of this.hand and if it is 0 then it is new round
     */
    public void StartNewRound(){
       if(this.hand.length==0){
          this.numTricks=0;
          this.numBid=0;
       }
    }
 }