//********************************************************************
// Words2.java Author: suggested Solution
//
// Tests Novel2 and YAnovel2
//********************************************************************
public class Words2
{
    //-----------------------------------------------------------------
    // Instantiates a derived class and invokes its inherited and
    // local methods.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        // uses constructor defined in the class
        Dictionary2 webster = new Dictionary2(1500, 52500);
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: " + webster.getDefinitions(
            ));
        System.out.println("Definitions per page: " + webster.computeRatio() +
            "\n" );
        System.out.println("First version of novel:" );
        Novel2 hound = new Novel2( "Hound of the Baskervilles", "Conan Doyle",
                300, 24 );
        System.out.println("Novel: " + hound.toString() );
        hound.setPages(400);
        hound.setChapters(20);
        System.out.println("Second version of novel:" );
        System.out.println("Novel: " + hound.toString() + "\n" );
        YAnovel2 potter = new YAnovel2( "Harry Potter", "Rollings", 250, 12, 8
            );
        System.out.println("First version of YA novel:" );
        System.out.println("YA Novel: " + potter.toString() );
        potter.setPages(200);
        potter.setChapters(40);
        potter.setMinAge( 12 );
        System.out.println("Second version of YA novel:" );
        System.out.println("YA Novel: " + potter.toString() );
    }
}