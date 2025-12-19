public class getset {
    public static void main(String[]args)
    {
        //they help protect object data and add rules for accessing or modyfying them
        //getters=methods that make a field READABLE (to access private member and print)
        //setters=methods that make a field WRITABLE  (if you want to change value of a private member)
     car c= new car("mustang","yellow",100000);
     c.setcolor("blue");
     c.setprice(-200);
     System.out.println(c.getname()+" "+c.getcolor()+" "+c.getprice());
    }
}
class car{
    //if you dont want a attribute to be writable add final keyword
   private  final String name;
   private String color;
   private  int price;

    car(String name,String color,int price)
    {
        this.name=name;
        this.color=color;
        this.price=price;
    }
    String getname()
    {
        return this.name;
    }
    String getcolor()
    {
        return this.color;
    }
    String getprice()
    {
        return "$"+this.price;
    }
    void setcolor(String color)
    {
        this.color=color;
    }
    void setprice(int price)
    {
        if(price<0)
            System.out.println("price cant be  less than 0");
        else
            this.price=price;
    }
}