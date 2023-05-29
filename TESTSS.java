
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
    int[] score = {6,4,4,4,8,9};
    String[] type={"D","H","C","S","S","C"};
    for(int i=0;i<score.length;i++){
      System.out.print("------------");
    }
    System.out.print("-\n");
    for(int i=0;i<score.length;i++){
      System.out.printf("|%d%s%9s",score[i],type[i]," ");
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
  public static void PrintTricks(Card[] tricks){
    for(int i=0;i<tricks.length;i++){
      System.out.print("-------------");
    }
    System.out.print("-\n");
    for(int i=0; i<=tricks.length;i++){
      if(i<tricks.length){
        if(tricks[i] instanceof Hearts){
          System.out.printf("|%s%s%10s",tricks[i],"H"," ");
        }
        else if(tricks[i] instanceof Diamonds){
          System.out.printf("|%s%s%10s",tricks[i],"D"," ");
        }
        else if(tricks[i] instanceof Spades){
          System.out.printf("|%s%s%10s",tricks[i],"S"," ");
        }
        else if(tricks[i] instanceof Clubs){
          System.out.printf("|%s%s%10s",tricks[i],"C"," ");
        }
      }
      else{
        System.out.printf("|%12s"," ");
      }
    }
    for(int j=0;j<4;j++){
      System.out.print("\n");
      for(int i =0; i<=tricks.length;i++){
        System.out.printf("|%12s"," ");
      }
    }
    
    System.out.print("\n");
    for(int i=0; i<=tricks.length;i++){
      if(i<tricks.length){
        System.out.printf("|%10s%s"," ",tricks[i]);
      }
      else{
        System.out.printf("|%12s"," ");
      }
    }
    System.out.print("\n");
    for(int i=0;i<tricks.length;i++){
      System.out.print("-------------");
    }
    
  }
}
