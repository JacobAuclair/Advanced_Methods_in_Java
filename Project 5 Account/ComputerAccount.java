public class ComputerAccount extends Account
{
    private String login;
    private String password;
    private boolean goodpassword;
    public ComputerAccount(String username, String phonenumber){
        super(userName);
        super(phoneNumber);
    }
    
    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setLogin(String LN){
        login = LN;
    }

    public void setPassword(String PW){
        password = PW;
    }

    public String toString(){
        return login+" , "+password;
    }
    
    public void goodPassword(boolean GP){
        goodpassword = GP;
    }
}
