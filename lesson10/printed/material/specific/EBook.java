package printed.material.specific;

import printed.material.*;

public class EBook extends Book
{
    private int pdfSize;


    private boolean isUnitPrefix;

    private String unit;

    public EBook(printed.material.Book in, int a, boolean b, String c)
    {
        super(in.getauthor(), in.gettitle(), in.getpageCount());
        this.pdfSize = a;
        this.isUnitPrefix = b;
        this.unit = c;
    }

    public EBook decode(String a)
    {
        
    }
}