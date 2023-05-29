public class Displayer{
    /**
     * @param trick
     */
    public void PrintTricks(Card[] trick){
        for(int i=0;i<trick.length;i++){
            System.out.print("-------------");
          }
          System.out.print("-\n");
          for(int i=0; i<=trick.length;i++){
            if(i<trick.length){
              if(trick[i] instanceof Hearts){
                System.out.printf("|%s%s%10s",trick[i],"H"," ");
              }
              else if(trick[i] instanceof Diamonds){
                System.out.printf("|%s%s%10s",trick[i],"D"," ");
              }
              else if(trick[i] instanceof Spades){
                System.out.printf("|%s%s%10s",trick[i],"S"," ");
              }
              else if(trick[i] instanceof Clubs){
                System.out.printf("|%s%s%10s",trick[i],"C"," ");
              }
            }
            else{
              System.out.printf("|%12s"," ");
            }
          }
          for(int j=0;j<4;j++){
            System.out.print("\n");
            for(int i =0; i<=trick.length;i++){
              System.out.printf("|%12s"," ");
            }
          }
          
          System.out.print("\n");
          for(int i=0; i<=trick.length;i++){
            if(i<trick.length){
              System.out.printf("|%10s%s"," ",trick[i]);
            }
            else{
              System.out.printf("|%12s"," ");
            }
          }
          System.out.print("\n");
          for(int i=0;i<trick.length;i++){
            System.out.print("-------------");
          }
    }
    /**
     * @param player
     */
    public void PrintHand(Player player){
        char suit='S';
        for(int i=0;i<player.GetHand().length;i++){
            System.out.print("------------");
        }
        System.out.print("-\n");
        for(int i=0;i<player.GetHand().length;i++){
            if(player.GetHand()[i] instanceof Spades){     suit='S'; }
            else if(player.GetHand()[i] instanceof Hearts){    suit='H';    }
            else if(player.GetHand()[i] instanceof Diamonds){   suit='D';   }
            else if(player.GetHand()[i] instanceof Clubs){  suit='C';   }
            if(player.GetHand()[i].GetVal()==Card.ACE){
              System.out.printf("|A%s%10s",suit," ");
            }
            else if(player.GetHand()[i].GetVal()==Card.KING){
              System.out.printf("|K%s%10s",suit," ");
            }
            else if(player.GetHand()[i].GetVal()==Card.QUEEN){
              System.out.printf("|Q%s%10s",suit," ");
            }
            else if(player.GetHand()[i].GetVal()==Card.JACK){
              System.out.printf("|J%s%10s",suit," ");
            }
        }
        System.out.print("|\n");
        for(int i =0; i<player.GetHand().length;i++){
            System.out.printf("|%11s"," ");
        }
        System.out.print("|\n");
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