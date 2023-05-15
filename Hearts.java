public class Hearts extends Card{
    /**
     * @param val
     */
    public Hearts(int val){
        super(val);
    }
    
    public int CalcTrickBonus(){
        return GetVal()*4;
    }
}