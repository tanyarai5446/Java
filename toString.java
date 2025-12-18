public class toString {
    public static void main(String[]args)
    {
        //.toString()=string representation of obeject, by default returns hash code for obejct as unique identifier
        // have to override this tostring method of obj class , if not overridden then shows default o/p classname@hexadeciHashcode
        Kpop bts=new Kpop("Bangtan Sonyeondan",7);
        System.out.println(bts);
    }
}
class Kpop{
    String name;
    int members;
    Kpop(String name,int members)
    {
        this.name=name;
        this.members=members;
    }
    @Override
    public String toString()
    {
       return "BTS = "+name+" ,forever "+members;
   }
}
