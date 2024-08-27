package printed.material;
import java.util.*;

public class Book
{
    public static final String defaultAuthor = "John Steinbeck";
    public static final String defaultTitle = "Of Mice and Men";
    public static final int defaultPageCount = 107;
    private String author;

    public String getauthor()
    {
        return author;
    }

    private String title;

    public String gettitle()
    {
        return title;
    }

    protected int pageCount;

    public int getpageCount()
    {
        return pageCount;
    }
    
    public Book()
    {
        this.initBook(defaultAuthor, defaultTitle, defaultPageCount);
    }
    public Book(String author, String title, int pageCount)
    {
        this.initBook(author,title,pageCount);
    }
    private void checkInitData(String a, String b, int c)
    {
        if((a.length() < 2) || (b.length() < 4) || (pageCount < 1))
        {
            throw new IllegalArgumentException();
        }
    }
    protected void initBook(String a, String b, int c)
    {
        try
        {
            checkInitData(a,b,c);
            author = a;
            title = b;
            pageCount = c;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Author length is less than 2, or title length is less than 4, or negative pagecount!");
        }
    }

    public String createReference(String a, int b, int c)
    {
        return "a";
    }

    public static Book decode(String a)
    {
        String modi = a.strip();
        String [] helper = modi.split(",");
        for(int i = 0; i < helper.length; i++)
        {
            helper[i] = helper[i].strip();
        }
        Book returnbook = new Book(helper[0],helper[1],Integer.parseInt(helper[2]));
        return returnbook;
    }

    protected String getAuthorWithInitials()
    {
        StringBuilder sb = new StringBuilder();
        String [] authordivided = author.split(" ");
        for(int i = 0; i < authordivided.length-1; i++)
        {
            sb.append(authordivided[i].charAt(0));
            sb.append(".");
            sb.append(" ");
        }
        sb.append(authordivided[authordivided.length-1]);
        return sb.toString();
    }

    public int getPrice()
    {
        return 0;
    }

    public String getShortInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getAuthorWithInitials());
        sb.append(": ");
        sb.append(title.substring(0, Math.min(title.length(), 4)) + "; " + pageCount);
        return sb.toString();
    }
}