import java.util.*;
import java.io.*;
import java.nio.*;

public class Median
{

    public static void main ( String[] args ) throws IOException
    {
        String filename;
        Scanner scan = new Scanner (System.in);
        boolean ars = true;
        double[] values = new double[100];
        int Lcount = 0;
        int count = 0;
        double mediann = 0;
        double average = 0;
        double SLaverage = 0;

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
                        double c;
                        while (ios.hasNext()) {
                            for (int t = 0; t < 100; t++){
                                values[t] = ios.nextDouble();
                                Lcount++;
                                count++;
                            }
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
            for (int j = 1; j <= count; j++)
            {
                int k = j;
                while (k > 0 && values[k-1] > values[k] )
                {
                    double temp  = values[k-1];
                    values[k-1] = values[k];
                    values[k]   = temp;
                    k--;
                }
            }

            if (count%2==0){
                int sat = count/2;
                int gat = count/2;
                gat++;
                double hat = values[gat]+values[sat];
                mediann = hat/2;
            }else{
                double fat = (count+1)/2;
                mediann = values[(int)fat];
            }
            double jazz = 0;
            for (int asd = 0; asd <= count; asd++){
                jazz = jazz + values[asd];
            }
            average = jazz/count;

            double pop = values[0] + values[count-1];
            SLaverage = pop / 2;

        }
        System.out.println("median = " + mediann);
        System.out.println("average  = " + average);
        System.out.println("small large average = " + SLaverage);
    }
}
