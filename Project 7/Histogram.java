

import java.util.*;
import java.io.*;
import java.nio.*;

public class Histogram
{

    public static void main ( String[] args ) throws IOException
    {
        String filename;
        Scanner scan = new Scanner (System.in);
        boolean ars = true;
        int[] values = new int[] {0,0,0,0,0,0,0,0,0,0,0};
        int tempint = 0;
        int remainder = 0;
        int printcount = 0;

        System.out.println ("Please print the exact file name you wish to be read");

        while (ars = true)
        {
            // nested conditional
            if (scan.hasNext())
            {
                // what does the grunt of the program by copying whatever the person types and repeating it back
                filename = (String)scan.nextLine();
                File InputFile = new File(filename);
                FileReader in = null;
                if(InputFile.exists() && !InputFile.isDirectory()) { 
                    System.out.println ("");

                    try {
                        in = new FileReader("input.txt");
                        Scanner ios = new Scanner (in);

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
                        ars = false;
                    }finally{
                        if (in != null) {
                            in.close();
                        }

                    }}
                else{
                    System.out.println ("this file name was not reachable. please check the path and re-enter");
                }
            }

        }
        
        System.out.println ("Range          Count");
        System.out.println ("-------        --------");
        System.out.print   ("0-9            "+values[0]+"      |");
        printcount = 0;
        for (int i = values[0]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("10-19            "+values[1]+"      |");
        printcount = 0;
        for (int i = values[1]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("20-29            "+values[2]+"      |");
        printcount = 0;
        for (int i = values[2]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("30-39            "+values[3]+"      |");
        printcount = 0;
        for (int i = values[3]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("40-49            "+values[4]+"      |");
        printcount = 0;
        for (int i = values[4]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("50-59            "+values[5]+"      |");
        printcount = 0;
        for (int i = values[5]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("60-69            "+values[6]+"      |");
        printcount = 0;
        for (int i = values[6]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("70-79            "+values[7]+"      |");
        printcount = 0;
        for (int i = values[7]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("80-89            "+values[8]+"      |");
        printcount = 0;
        for (int i = values[8]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("90-99            "+values[9]+"      |");
        printcount = 0;
        for (int i = values[9]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
        System.out.println("");
        System.out.print   ("out of range     "+values[10]+"      |");
        printcount = 0;
        for (int i = values[10]; i>0; i--){
            System.out.print ("*");
            printcount++;
            if (printcount == 10){
                System.out.print(" ");}
        }
    }
}
