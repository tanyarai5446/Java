public class interfaces {
    public static void main(String[]args)
    {
         //interface = like abs and multiple inheritence(can have multiple parents)
        //uses implements keyword
        // can have multiple interfaces
        rabbit r= new rabbit();
        hawk h= new hawk();
        fish f= new fish();
        r.flee();
        h.hunt();
        f.flee();
        f.hunt();

    }
}
interface prey
{
    // makes flee implicitily public
        void flee();
}
interface predator
{
    void hunt();
}
class rabbit implements prey {
    //makes flee package private so public keyword used
    @Override
    public void flee() {
        System.out.println("The Rabbit is running away");
    }
}
//can implement multiple interfaces unlike extend
class fish implements prey,predator
{
    //fish can both be a prey and a predator
    @Override
    public void flee() {
        System.out.println("The fish is swimming away");
    }
    @Override
    public void hunt()
    {
        System.out.println("The fish is hunting");
    }
}
class hawk implements predator
{
    @Override
    public void hunt()
    {
        System.out.println("The hawk is hunting");
    }
}
