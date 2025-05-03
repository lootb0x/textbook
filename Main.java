public class Main{
    public static void main(String[] args)
     {
        Textbook bio2015 = new Textbook( "Biology", 49.75, 2);
        Textbook bio2019 = new Textbook( "Biology", 39.75, 3);
        Textbook math = new Textbook("calculus", 45.25, 1);

        System.out.println(bio2019.getEdition());
        System.out.println(bio2019.getInfo());
        System.out.println(bio2019.subsitutes(bio2015));
        System.out.println(bio2015.subsitutes(bio2019));
        System.out.println(bio2015.subsitutes(math));



     }
}