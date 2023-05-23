public class SpadesSys{

    public final static int DEFAULT_NUM_PLAYERS = 2;
    public final static int MAX_NUM_PLAYERS = 4;
    public final static int WINNING_SCORE = 500;
 
    //private variables not initialized
    private Card[] deck;
    private Player[] allPlayers;
    private Player firstPlayer;
    private Player currPlayer;
    private Card[] currTrick;
    private int currLeadingSuit;
    private Player lastTrickTaker;
    private boolean isNewRound;
    
    /**
     * @param numPlayers
     */
    public SpadesSys(int numPlayers){
       this.deck = new Card[0];
       if (numPlayers <= MAX_NUM_PLAYERS && numPlayers >= DEFAULT_NUM_PLAYERS) {
          this.allPlayers = new Player[numPlayers];
          for (int i = 0; i < numPlayers; i++) {
             this.allPlayers[i] = new Player(i);
          }
       } else {
          this.allPlayers = new Player[DEFAULT_NUM_PLAYERS];
          for (int i = 0; i < DEFAULT_NUM_PLAYERS; i++) {
             this.allPlayers[i] = new Player(i);
          }
       }
    }
    
    private void fillClubs() {
       for (int i = 0; i < Card.FULL_SUIT; i++) {
          Card[] newDeck = new Card[this.deck.length + 1];
          newDeck[this.deck.length] = new Clubs(i + 1);
          this.deck = newDeck;
       }
    }
    
    private void fillDiamonds() {
       for (int i = 0; i < Card.FULL_SUIT; i++) {
          Card[] newDeck = new Card[this.deck.length + 1];
          newDeck[this.deck.length] = new Diamonds(i + 1);
          this.deck = newDeck;
       }
    }
    
    private void fillHearts() {
       for (int i = 0; i < Card.FULL_SUIT; i++) {
          Card[] newDeck = new Card[this.deck.length + 1];
          newDeck[this.deck.length] = new Hearts(i + 1);
          this.deck = newDeck;
       }
    }
    
    private void fillSpades() {
       for (int i = 0; i < Card.FULL_SUIT; i++) {
          Card[] newDeck = new Card[this.deck.length + 1];
          newDeck[this.deck.length] = new Spades(i + 1);
          this.deck = newDeck;
       }
    }
    
    /**
    *  method for removing card
            - for loop limited by length of the deck
            - statement for finding the value to remove
            - when the value found it will be skipped
            - and new deck will be setted to the this.deck
    */
   private void removeCard() {
       Card[] newDeck = new Card[this.deck.length - 1];
       int newDeckIndex = 0;
       for (int i = 0; i < this.deck.length; i++) {
          if (this.deck[i] != null) {
             newDeck[newDeckIndex] = this.deck[i];
             newDeckIndex++;
          }
       }
       this.deck = newDeck;
    }
    
    /**
     * method for filling deck by calling individual methods in SpadeSys class
     */
    public void FillDeck(){
       this.fillClubs();
       this.fillDiamonds();
       this.fillHearts();
       this.fillSpades();
    }
     
    /**
     * 
     */
    public void DealCards(Player player){
       Card[] hand = new Card[0];
       for (int i = 0; i < Card.FULL_HAND; i++) {
          Card[] newHand = new Card[hand.length + 1];
          newHand[hand.length] = this.deck[(int)(Math.random()*this.deck.length)];
          this.removeCard();
          hand = newHand;
       }
       player.SetHand(hand);
    }
    
    /**
     * the method setting the first player
              - statement for setting
              - setting randomly when is new round and setting the round to the false
              - setting to the lastTrickTaker when the round is continued
     */
    public void SetFirstPlayer(){
       if (this.isNewRound) {
          this.firstPlayer = this.allPlayers[(int)(Math.random()*this.allPlayers.length)];
          this.isNewRound = false;
       } else {
          this.firstPlayer = this.lastTrickTaker;
       }
    }
    
    /**
     * @return type Player
     *          - return the first player
     */
    public Player GetFirstPlayer(){
       return this.firstPlayer;
    }
    
    /**
     *  setting the current player by numerical order 
               - if statement for setting current player if the previous one is allPlayers.length-1
               - else for setting current for next one
     */
    public void SwitchPlayer() {
       if (this.currPlayer.GetNum() == this.allPlayers.length-1) {
          this.currPlayer = this.allPlayers[0];
       } else {
          this.currPlayer = this.allPlayers[this.currPlayer.GetNum() + 1];
       }
    }
    
    /**
     * @return type Player
               - return this.currPlayer 
     */
    public Player GetCurrPlayer(){
       return this.currPlayer;
    }
    
    /**
    * @param card
     * @return type boolean
              - return false(need to change)
     */
    public boolean Play(Card card){
       return false;//change val
    }
    
    /**
     * @return type Player
               - return null (need to change)
     */
    public Player TakeTrick(){
       return null;
    }
    
    /**
     * @return type Player 
               - return the this.lastTrickTaker variable
     */
    public Player GetTrickTaker(){
       return this.lastTrickTaker;
    }
     
    /**
     * @return type boolean 
               - the loop is limited by the numbers of players
               - if the player has no cards in the round the round is over
               - return false if the GetHand not equals to 0
               - return true if the GetHand equals to the 0
     */
    public boolean IsRoundOver(){
        for (int i = 0; i < this.allPlayers.length; i++){
            if (allPlayers[i].GetHand().length != 0){
                return false;
            }
        }
        this.isNewRound = true;
        return true;
    }
    
    /**
     * @return type Player
               - the loop is limited by the numbers of players
               - the statement for checking the player's value of winnin val
               - return player if the winning val is same or above WINNING_SCORE
               - return null if not
     */
    public Player CheckWinner(){
       for (int i = 0; i < this.allPlayers.length; i++) {
          if (this.allPlayers[i].GetScore() >= WINNING_SCORE) {
             return this.allPlayers[i];
          }
       }
       return null;
    }
    
    /**
     * @return type boolean
               - statement for checking the deck is empty or not
               - return true if the this.deck.length is equals to the 0
               - return false if the this.deck.length is not equal to the 0
     */
    public boolean IsDeckEmpty(){
        if(this.deck.length == 0){
            return true;
        }
        return false;//change val
    }
 }