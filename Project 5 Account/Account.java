
public class Account
{
    protected String userName;
    protected String phoneNumber;
    
    public Account (String username, String phonenumber){
        this.userName = username;
        this.phoneNumber = phonenumber;
    }
    
    public String getName(){
        return userName;
    }

    public String getNumber(){
        return phoneNumber;
    }

    public void setNumber(String PN){
        phoneNumber = PN;
    }

    public String toString(){
        return userName+" , "+phoneNumber;
    }
}
