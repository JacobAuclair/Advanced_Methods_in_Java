/**
 * Write a description of class YAnovel2 here.
 *
 * @author (Suggested Solution)
 * @version (2/28/2017)
 */
public class YAnovel2 extends Novel2
{
    // instance variables - replace the example below with your own
    private int minAge;
    /**
     * Constructor for objects of class YAnovel2
     */
    public YAnovel2(String title, String name, int numPages, int numChapters
    , int minAge )
    {
        super( title, name, numPages, numChapters );
        this.minAge = minAge;
    }

    public String toString()
    {
        return super.toString() + ", min age: " + minAge ;
    }

    public void setMinAge( int age )
    {
        minAge = age;
    }

    public int getMinAge( )
    {
        return minAge;
    }
}