// Jacob Auclair
// CS 152
// 4/17/2017

import java.util.*;
public class Palindrome
{
    public static boolean isPal(String str)
    {
        if(str.length() == 0 || str.length() == 1){
            return true; 
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPal(str.substring(1, str.length()-1));
        }
        return false;
    }

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a case sensitive palindrome");
        String x = scan.nextLine();
        if(isPal(x) == true){
            System.out.println(x + " is a palindrome");
        }
        else{
            System.out.println(x + " is NOT a palindrome");
        }
    }
}
