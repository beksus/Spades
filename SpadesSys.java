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
     * 
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
     * @param playerNum
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
     * @return
     */
    public Player GetFirstPlayer(){
       return this.firstPlayer;
    }
    
    public void SwitchPlayer() {
       if (this.currPlayer.GetNum() == 4) {
          this.currPlayer = this.allPlayers[0];
       } else {
          this.currPlayer = this.allPlayers[this.currPlayer.GetNum() + 1];
       }
    }
    
    /**
     * @return type Player
     */
    public Player GetCurrPlayer(){
       return this.currPlayer;
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
    public Player TakeTrick(){
       return null;
    }
    
    /**
     * @return
     */
    public Player GetTrickTaker(){
       return this.lastTrickTaker;
    }
     
    /**
     * @return type boolean
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
     * @return
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
     * @return
     */
    public boolean IsDeckEmpty(){
        if(this.deck.length == 0){
            return true;
        }
        return false;//change val
    }
 }