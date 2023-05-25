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
        double n=3;
        if(player.length>2&&player.length<4){
            n=4;
        }
        else if(player.length>3&&player.length<5){
            n=4.5;
        }
        for(int i=0; i<player.length;i++){
            System.out.print("------------");
        }
        System.out.print("-\n");
        System.out.print("|");
        for(int i =0;i<player.length*n;i++){
            System.out.printf("%s"," ");
        }
        
        System.out.print("SCORE BOARD");
        
        for(int i=0;i<player.length*n;i++){
            System.out.printf("%s"," ");
        }
        System.out.print("|\n");
        for(int i=0;i<player.length;i++){
            System.out.print("------------");
        }
        System.out.print("-\n");
        for(int i=0;i<player.length;i++){
            System.out.printf("|%6d%5s",player[i].GetScore(),"");
        }
        System.out.print("|\n");
        for(int i=0;i<player.length;i++){
            System.out.print("------------");
        }
        System.out.print("-");
        
    }   
}