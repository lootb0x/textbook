public class Book{
    private String Title;
    private Double Price;

    public Book(String T, double p)
    {
        Title = T;
        Price = p;
    }

    public String getTitle()
    {
        return Title;
    }

    public String getInfo(){
        return Title + "-" + Price;
    }



}
