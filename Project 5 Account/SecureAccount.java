public class SecureAccount extends ComputerAccount
{
    boolean its;
    String pass;
    char[] anArray;
    anArray = new char[30];
    int a;
    boolean aa;
    public void getGood(boolean gg){
        pass = gg;
    }
    
    public boolean goodPassword() {
        aa = false;
        a = 0;
        while (AR[a] < pass.lenth){
            AR[a] = pass.next;
            
            a++;
        }
        
        while (AR.length + 1 > 0){
            if (AR[a].nextChar = true){
                aa = true;
            }
            if (AR[a].nextInt = true){
                aa = true;
            }
            a++;
        }
        
        if (aa = true){
            return true;
        }
        else { return false;}
    }
}