public class aggregation {
    public static void main(String[]args)
    {
        //aggregation=has a relationship b/w objs
        book b1=new book("descrete",400);
        book b2=new book("dsa",300);
        book b3= new book("oopm",450);
        book[] books={b1,b2,b3};
        library l=new library("NYC public library",1887,books);   // l is a object with another object books
        l.displibr();
    }
}
class book{
    String name;
    int pages;
    book(String name,int pages)
    {
        this.name=name;
        this.pages=pages;
    }
    void disp()
    {
        System.out.println(this.name+" {"+this.pages+" pages}");
    }
}
class library{
    String name;
    int year;
    book[] books;
    library(String name,int year,book[] books)
    {
        this.name=name;
        this.year=year;
        this.books=books;
    }
    void displibr()
    {
        System.out.println("The "+this.year+" "+this.name);
         System.out.println("Books available: ");
         for(book b:books)
         {
             b.disp();
         }
    }
}
