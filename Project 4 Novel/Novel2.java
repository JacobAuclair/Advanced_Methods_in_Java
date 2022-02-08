//********************************************************************
// Novel2.java Author: Suggested Solution
//
// Represents a novel, which is a book.
//********************************************************************
public class Novel2 extends Book2
{
    private String author ;
    private String title ;
    protected int chapters ;
    //-----------------------------------------------------------------
    // Constructor: Sets up the dictionary with the specified number
    // of pages and definitions.
    //-----------------------------------------------------------------
    public Novel2(String title, String name, int numPages, int numChapters )
    {
        super(numPages);
        author = name;
        this.title = title;
        chapters = numChapters;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getChapters()
    {
        return chapters;
    }

    public void setChapters( int chapters )
    {
        this.chapters = chapters;
    }

    public String toString()
    {
        return title + ", by " + author + "; " + pages + "pp. " + chapters +
        " chapters" ;
    }
}