public class Clubs extends Card{

    /**
     * @param val
     */
    public Clubs(int val){
        super(val);
    }
    
    public int CalcTrickBonus(){
        return GetVal()*2;
    }
}