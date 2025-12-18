public class absClass {
    public static void main(String[]args)
    {
        //abstract= abstraction(hiding implementation)
        //                 cant be instantiated directly i.e. cant create object for this class
        //                 abstract method can be created inside a abstract clas but it should be implemented
        //                 concrete methods inside a abstract class is by default inherited by classes extended from abs class
        //color c= new color() will show error becoz obj cant be created of abs class
        blue b=new blue();
        green g= new green();
        red r= new red();
        b.disp();
        g.disp();
        r.disp();
        System.out.println(b.use());
        System.out.println(g.use());
        System.out.println(r.use());

    }

}
// created a abs class color
abstract class  color{
      //an abs method
     abstract String use();

    // concrete method inehrited by default by chile classes
    void disp()
    {
        System.out.println(this.getClass().getSimpleName()+"-This is a color");
        //getClass()-- returns  runtime class for current obj
        //getSimpleName()--returns name of class without  package
    }
}
class blue extends color
{
    // abs method implemented
    @Override
    String use()
    {
        return "blue is sky";
    }
}
class green extends color
{
    // abs method implemented
    @Override
    String use()
    {
        return "green is grass";
    }
}
class red extends color
{
    // abs method implemented
    @Override
    String use()
    {
        return "red is blood";
    }
}
