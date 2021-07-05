public class TeenNumberChecker {
    public static boolean hasTeen(int par1,int par2, int par3){
        if((par1>=13 && par1<=19)||(par2>=13 && par2<=19)||(par3>=13 && par3<=19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int par){
        if(par>=13 && par<=19){
            return true;
        }
        return false;
    }
}
