public class polymorphism {
    public static void main(String[]args)
    {
        //polymorphism=many shape
        //                             objects can identify as other objs
        //objs can be treated as objs of a common superclass
        // ((like dog identifies as animal also identfies as a organism can also be identifed as an object))
       horse h=new horse();
       donkey d=new donkey();
       bull b= new bull();

        //if u try to make an array of horse donkey bull like this :-
        // horse[] horses={horse,donkey,bull};       shows error like horse cannot be converted to donkey  {{one shape cant be converted to another shape}}
        //similarly for others donkey[] or bull[] array
        //so we create array  of a common type in which horse,donkey and bull can come i.e. animals
        animals[] a={h,d,b};
        for(animals animal: a)
        {
            animal.ride();
        }
    }
}
abstract class animals{
    abstract void ride();
}
class horse extends animals{
    @Override
    void ride()
    {
        System.out.println("You ride the horse");
    }
}
class donkey extends animals{
    @Override
    void ride()
    {
        System.out.println("You ride the donkey");
    }
}
class bull extends animals
{
    @Override
    void ride()
    {
        System.out.println("You ride the bull");
    }
}
