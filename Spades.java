public class Spades extends Card{

    /**
     * @param val
     */
    public Spades(int val){
        super(val);
    }
    
    public int CalcTrickBonus(){
        return GetVal()*5;
    }
}