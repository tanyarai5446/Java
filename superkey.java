public class superkey {
    public static void main(String[]args)
    {
          //super = used to calll parent constructor and initialize attributes
          women w1=new women("Tanya",19);
          accessory a1=new accessory("Tanya",19,"gold");
          w1.show();
          a1.show();
    }
}
class women{
    String name;
    int age;

    women(String name,int age){
        this.name=name;
        this.age=age;
    }
     void show()
    {
        System.out.println(this.name+" is "+this.age);
    }
}
class accessory extends women{
    String necklace;
    accessory(String name,int age,String necklace){
        super(name,age);
        this.necklace=necklace;
    }
    void show()
    {
        System.out.println(this.name+" is "+this.age+" and wears "+this.necklace);
    }
}
