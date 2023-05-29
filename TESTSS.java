
public class TESTSS{
  public static void main(String[] args){
    int[] player = {1,2,4};
    double n=3;// to have a dinamic displayer
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
            System.out.printf("| Player:%3d%5s",player[i],"");
        }
        System.out.print("|\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the score and aligning 
            System.out.printf("| Bid:%6d%5s",player[i],"");
        }
        System.out.print("|\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the score and aligning 
            System.out.printf("| Tricks:%3d%5s",player[i],"");
        }
        System.out.print("|\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the score and aligning 
            System.out.printf("| Over Tricks:%2d%1s",player[i],"");
        }
        System.out.print("|\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the score and aligning 
            System.out.printf("| Score:%3d%6s",player[i],"");
        }
        System.out.print("|\n");//next line
        
        for(int i=0;i<player.length;i++){//printing the bottom line
            System.out.print("-----------------");
        }
        System.out.print("-");
  }
}