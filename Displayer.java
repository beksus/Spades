public class Displayer{
    /**
     * @param trick
     */
    public void PrintTricks(Card[] trick){

    }
    /**
     * @param player
     */
    public void PrintHand(Player player){ 

    }
    /**
     * @param player
     */
    public void PrintScoreboard(Player[] player){
        for(int i=0; i<player.length;i++){
            System.out.println(player[i].GetScore());
        }
    }
}