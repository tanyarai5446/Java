public class overriding {
    public static void main(String[]args)
    {
        //method overriding=when a subclass provides its own implementation
        //                                      of a method that is already defined.
        //allows for code reusability and give specific implementation
        person pr = new person();
        man m=new man();
        girl g=new girl();
        pr.show();
        m.show();
        g.show();

    }
}
class person{
    void show()
    {
        System.out.println("The person is he.");
    }
}
class man extends person{
    void show()
    {
        System.out.println("The person is he.");
    }
}
class girl extends person{
    @Override
    void show()
    {
        System.out.println("The person is she.");
    }
}
