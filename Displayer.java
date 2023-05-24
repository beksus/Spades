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
                
        for(int i=0;i<player.length;i++){
            System.out.print("-------------");
        }
        System.out.print("-\n");
        for(int i=0;i<player.length;i++){
            System.out.printf("|%6d%6s",player[i].GetScore(),"");
        }
        System.out.print("|\n");
        for(int i=0;i<player.length;i++){
            System.out.print("-------------");
        }
        System.out.print("-");
    }
}