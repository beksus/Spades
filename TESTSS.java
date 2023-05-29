
public class TESTSS{
  public static void main(String[] args){
    
    //==========THE TRICKS===========
    int[] players = {1,2,3,4};
    String[] tricks = {"3H","4C","5D"};
    for(int i=0;i<players.length;i++){
      System.out.print("-------------");
    }
    System.out.print("-\n");
    for(int i=0; i<=players.length;i++){
      if(i<tricks.length){
        System.out.printf("|%s%10s",tricks[i]," ");
      }
      else{
        System.out.printf("|%12s"," ");
      }
    }
    for(int j=0;j<4;j++){
      System.out.print("\n");
      for(int i =0; i<=players.length;i++){
        System.out.printf("|%12s"," ");
      }
    }
    
    System.out.print("\n");
    for(int i=0; i<=players.length;i++){
      if(i<tricks.length){
        System.out.printf("|%10s%s"," ",tricks[i]);
      }
      else{
        System.out.printf("|%12s"," ");
      }
    }
    System.out.print("\n");
    for(int i=0;i<players.length;i++){
      System.out.print("-------------");
    }
    
    
    
    
    
    
    System.out.println("\n\n");
    //============ THE HAND===========
    int[] score = {6,4,4,4,8,11};
    String[] type={"D","H","C","S","S","C"};
    for(int i=0;i<score.length;i++){
      System.out.print("------------");
    }
    System.out.print("-\n");
    
    for(int i=0;i<score.length;i++){
      if(score[i]==11){
        System.out.printf("|J%s%9s",type[i]," ");
      }
      else if(score[i]==12){
        System.out.printf("|Q%s%9s",type[i]," ");
      }
      else if(score[i]==13){
        System.out.printf("|K%s%9s",type[i]," ");
      }
      else if(score[i]==14){
        System.out.printf("|A%s%9s",type[i]," ");
      }
      else{
        System.out.printf("|%d%s%9s",score[i],type[i]," ");
      }
    }
    System.out.print("|\n");
    for(int i =0; i<score.length;i++){
      System.out.printf("|%11s"," ");
    }
    System.out.print("|\n");
    for(int i=0;i<score.length;i++){
      System.out.print("============");
    }
    System.out.print("=\n");
  }
  
  public static void PrintHand(Player player){
    
    for(int i=0;i<player.GetHand().length;i++){
      System.out.print("------------");
    }
    System.out.print("-\n");
    for(int i=0;i<player.GetHand().length;i++){
      System.out.printf("|%d%10s",player.GetHand()[i].GetVal()," ");
    }
    System.out.print("|\n");
    for(int i =0; i<player.GetHand().length;i++){
      System.out.printf("|%11s"," ");
    }
    System.out.print("|\n");
  }
  public void PrintTricks(Card[] trick){
    char suit='S';
    char val = 'A';
    for(int i=0;i<trick.length;i++){
      System.out.print("-------------");
    }
    System.out.print("-\n");
    for(int i=0; i<=trick.length;i++){
      if(i<trick.length){
        
        
        
        
        
        if(trick[i].GetVal()==Card.ACE){
          suit='A';
        }
        else if(trick[i].GetVal()==Card.KING){
          suit='K';
        }
        else if(trick[i].GetVal()==Card.QUEEN){
          suit='Q';
        }
        else if(trick[i].GetVal()==Card.JACK){
          suit = 'J';
        }
        
        
        if(trick[i] instanceof Hearts){
          val = 'H';
        }
        else if(trick[i] instanceof Diamonds){
          val = 'D';
        }
        else if(trick[i] instanceof Spades){
          val = 'S';
        }
        else if(trick[i] instanceof Clubs){
          val = 'C';
        }
        
        if(trick[i].GetVal()>10){
          System.out.printf("|%s%s%10s",trick[i],val," ");
        }
        else{
          System.out.printf("|%s%s%10s",trick[i],val," ");
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
}
