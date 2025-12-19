public class composition {
    public static void main(String[]args)
    {
        //composition= "part of" relationship b/w obj
        //example:- chain is part of a bag
        //allows complex obj to be constructed from smaller obj
       bag b= new bag("safari","black","waterproof");
        System.out.println(b.brand);
        System.out.println(b.color);
        System.out.println(b.type.bagtype);
        b.open();
    }
}
class bag{
    String brand;
    String color;
    Type type;
    bag(String brand,String color,String bagtype)
    {
        this.brand=brand;
        this.color=color;
        this.type=new Type(bagtype);//here type is a obj  of class Type
    }
    void open()
    {
        this.type.open();
        System.out.println("bag is open!");
    }
}
class Type
{
    String bagtype;
    Type(String bagtype)
    {
        this.bagtype=bagtype;
    }
    void open()
    {
        System.out.println("You opened the chain");
    }
}
