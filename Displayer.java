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
        double n=3;// to have a dinamic displayer
        if(player.length>2&&player.length<4){
            n=4;
        }
        else if(player.length>3&&player.length<5){
            n=4.5;
        }

        for(int i=0; i<player.length;i++){//upper line for board
            System.out.print("------------");
        }

        System.out.print("-\n");// next line
        System.out.print("|");//closing brackets for board

        for(int i =0;i<player.length*n;i++){//printing the space to middle the name
            System.out.printf("%s"," ");
        }
        
        System.out.print("SCORE BOARD");//printing the score board name
        
        for(int i=0;i<player.length*n;i++){//printing the space for backets to align
            System.out.printf("%s"," ");
        }
        System.out.print("|\n");//printing the next line

        for(int i=0;i<player.length;i++){//printing the middle line
            System.out.print("------------");
        }

        System.out.print("-\n");//next line
        for(int i=0;i<player.length;i++){//printing the score and aligning 
            System.out.printf("|%6d%5s",player[i].GetScore(),"");
        }
        System.out.print("|\n");//next line
        for(int i=0;i<player.length;i++){//printing the bottom line
            System.out.print("------------");
        }
        System.out.print("-");
        
    }   
}