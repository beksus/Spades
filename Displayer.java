public class Displayer{
    /**
     * @param trick
     */
    public void PrintTricks(Card[] trick){
      char suit='N';// just to initialize the suit for printing
      char val = 'S';//this variable is for printing the signs like King, Queen, Jack and Ace
        for(int i=0;i<trick.length;i++){//dynamic printing the line for displaying the board
            System.out.print("-------------");
          }
          System.out.print("-\n");//next line
          for(int i=0; i<=trick.length;i++){// dynamic printing the board and its content 
            if(i<trick.length){//statement for printing the not empty slot
              if(trick[i].GetVal()==Card.ACE){val='A';}//printing case for Ace
              else if(trick[i].GetVal()==Card.KING){val='K';}// case for King
              else if(trick[i].GetVal()==Card.QUEEN){val='Q';}// case for Queen
              else if(trick[i].GetVal()==Card.JACK){val = 'J';}// case for Jack
              
              if(trick[i] instanceof Hearts){suit = 'H';}// statement for priting the suit for Hearts
              else if(trick[i] instanceof Diamonds){suit = 'D';}// case for Diamond
              else if(trick[i] instanceof Spades){suit = 'S';}// case for Spades
              else if(trick[i] instanceof Clubs){suit = 'C';}// case for Clubs
              
              if(trick[i].GetVal()>10){//printing the card with the values over 10 like Jack, Queen, King and Ace
                System.out.printf("|%s%s%10s",val,suit," ");
              }
              else{
                System.out.printf("|%d%s%10s",trick[i].GetVal(),suit," ");//printing the regular card with the values lower than 11
              }
            }
            else{
              System.out.printf("|%12s"," ");//printing the empty slot for the card
            }
          }
          for(int j=0;j<4;j++){//loop to make it like card layout
            System.out.print("\n");
            for(int i =0; i<=trick.length;i++){//printing the layout for the card
              System.out.printf("|%12s"," ");
            }
          }
          
          System.out.print("\n");
          for(int i=0; i<=trick.length;i++){
            if(i<trick.length){//statement for printing the not empty slot
              if(trick[i].GetVal()==Card.ACE){val='A';}//printing case for Ace
              else if(trick[i].GetVal()==Card.KING){val='K';}// case for King
              else if(trick[i].GetVal()==Card.QUEEN){val='Q';}// case for Queen
              else if(trick[i].GetVal()==Card.JACK){val = 'J';}// case for Jack
              
              if(trick[i] instanceof Hearts){suit = 'H';}// statement for priting the suit for Hearts
              else if(trick[i] instanceof Diamonds){suit = 'D';}// case for Diamond
              else if(trick[i] instanceof Spades){suit = 'S';}// case for Spades
              else if(trick[i] instanceof Clubs){suit = 'C';}// case for Clubs
              
              if(trick[i].GetVal()>10){//printing the card with the values over 10 like Jack, Queen, King and Ace
                System.out.printf("|%10s%s%s"," ",val,suit);// printing the opposite site
              }
              else{
                System.out.printf("|%10s%d%s"," ",trick[i].GetVal(),suit);//printing the regular card with the values lower than 11 and printint the opposite side
              }
            }
            else{
              System.out.printf("|%12s"," ");//printing the empty slot for the card
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
            else{
              System.out.printf("|%d%s%10s",player.GetHand()[i].GetVal(),suit," ");
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
        double n=5.5;// to have a dinamic displayer
        if(player.length>2&&player.length<4){
          n=6.3333333333333343788;
        }
        else if(player.length>3&&player.length<5){
          n=6.8;
        }

        for(int i=0; i<player.length;i++){//upper line for board
          System.out.print("-----------------");
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
            System.out.print("-----------------");
        }

        System.out.print("-\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the score and aligning 
          System.out.printf("| Player:%3d%5s",player[i].GetNum(),"");
      }
      System.out.print("|\n");//next line
      
      for(int i=0;i<player.length;i++){//printing the score and aligning 
          System.out.printf("| Bid:%6d%5s",player[i].GetNumBid(),"");
      }
      System.out.print("|\n");//next line
      
      for(int i=0;i<player.length;i++){//printing the score and aligning 
          System.out.printf("| Tricks:%3d%5s",player[i].GetNumTricks(),"");
      }
      System.out.print("|\n");//next line
      
      for(int i=0;i<player.length;i++){//printing the score and aligning 
          System.out.printf("| Overtricks:%2d%2s",player[i].GetOvertricks(),"");
      }
      System.out.print("|\n");//next line
      
      for(int i=0;i<player.length;i++){//printing the score and aligning 
          System.out.printf("| Score:%3d%6s",player[i].GetScore(),"");
      }
        System.out.print("|\n");//next line
        for(int i=0;i<player.length;i++){//printing the bottom line
            System.out.print("-----------------");
        }
        System.out.print("-");
        
    }   
}