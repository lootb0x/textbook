public class Textbook extends Book{

    private int Edition;
    
    public Textbook(String t, Double p, int e )
    {
        super(t, p);
        this.Edition = e;
    }
        
    public int getEdition()
    {
        return Edition;
    }

    public String getInfo()
    {
        return super.getInfo()+ "-" + Edition;
    }

    public boolean subsitutes(Textbook t)
    {
        if(t.getTitle().equals(this.getTitle()) && this.Edition> t.getEdition()) return true;
        return false;
    }
    }