// Jacob Auclair
// CS 152 sec 70
// Histogram project 3/28/17

import java.util.*;
import java.io.*;
import java.nio.*;

public class Histogram
{
    // static main for the project, throws exception for file io
    public static void main ( String[] args ) throws IOException
    {
        // declaration of all variables and arrays of the such
        String filename;
        Scanner scan = new Scanner (System.in);
        boolean ars = true;
        int[] values = new int[] {0,0,0,0,0,0,0,0,0,0,0};
        int tempint = 0;
        int remainder = 0;
        int printcount = 0;
        // input prompt
        System.out.println ("Please print the exact file name you wish to be read");
        // continuious loop until the user puts in a valid file name
        while (ars = true)
        {
            // if statement checks for the input name
            if (scan.hasNext())
            {
                // takes the file name in, makes the object and file reader accessable
                filename = (String)scan.nextLine();
                File InputFile = new File(filename);
                FileReader in = null;
                //checks for existance of the file and propper directory
                if(InputFile.exists() && !InputFile.isDirectory()) { 
                    System.out.println ("");
                    // tries readung the file and makes a scanner to do so
                    try {
                        in = new FileReader("input.txt");
                        Scanner ios = new Scanner (in);
                        // reads every number in the file and incriments the different sections of the 
                        // array according to which it falls under
                        while (ios.hasNextInt()) {
                            tempint = ios.nextInt();
                            if (tempint >= 0 && tempint <= 9) {
                                values[0] = values[0] + 1;}
                            else if(tempint >= 10 && tempint <= 19) {
                                values[1] = values[1] + 1;}
                            else if(tempint >= 20 && tempint <= 29) {
                                values[2] = values[2] + 1;}
                            else if(tempint >= 30 && tempint <= 39) {
                                values[3] = values[3] + 1;}
                            else if(tempint >= 40 && tempint <= 49) {
                                values[4] = values[4] + 1;}
                            else if(tempint >= 50 && tempint <= 59) {
                                values[5] = values[5] + 1;}   
                            else if(tempint >= 60 && tempint <= 69) {
                               values[6] = values[6] + 1; }
                            else if(tempint >= 70 && tempint <= 79) {
                               values[7] = values[7] + 1; }
                            else if(tempint >= 80 && tempint <= 89) {
                                values[8] = values[8] + 1; }
                            else if(tempint >= 90 && tempint <= 99) {
                                values[9] = values[9] + 1; }
                            else {
                                values[10] = values[10] + 1;}
                        }
                        // closes the loop when done
                        ars = false;
                    }finally{
                        // closes the reader for files
                        if (in != null) {
                            in.close();
                        }

                    }}
                else{
                    System.out.println ("this file name was not reachable. please check the path and re-enter");
                }
            }

        }
        // will list every catagory of numbers and how many there are from the array
        System.out.println ("Range          Count");
        System.out.println ("-------        --------");
        System.out.print   ("0-9            "+values[0]+"      |");
        printcount = 0;
        // simple little star maker where if there is more than 10 stars than it will make a space
        for (int i = values[0]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("10-19            "+values[1]+"      |");
        printcount = 0;
        for (int i = values[1]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("20-29            "+values[2]+"      |");
        printcount = 0;
        for (int i = values[2]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("30-39            "+values[3]+"      |");
        printcount = 0;
        for (int i = values[3]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("40-49            "+values[4]+"      |");
        printcount = 0;
        for (int i = values[4]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("50-59            "+values[5]+"      |");
        printcount = 0;
        for (int i = values[5]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("60-69            "+values[6]+"      |");
        printcount = 0;
        for (int i = values[6]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("70-79            "+values[7]+"      |");
        printcount = 0;
        for (int i = values[7]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("80-89            "+values[8]+"      |");
        printcount = 0;
        for (int i = values[8]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("90-99            "+values[9]+"      |");
        printcount = 0;
        for (int i = values[9]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("out of range     "+values[10]+"      |");
        printcount = 0;
        for (int i = values[10]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount%10 == 0){
                System.out.print(" ");}
        }
    }
}
