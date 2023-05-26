
public class TESTSS{
  public static void main(String[] args){
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
}
