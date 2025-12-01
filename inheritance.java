public class inheritance {
    public static void main(String[]args){
       animal.fav();
       dog.alive();
       cat.alive();
    }
}
class animal{
    static boolean isalive;
    static void alive()
    {
        isalive=true;
        System.out.println(isalive);
    }
   static void fav()
   {
       System.out.println("which is your fav animal?");
   }
}
class dog extends animal{
    static void fav()
    {
        System.out.println("dog is my fav animal");
    }
}
class cat extends animal{
    static void fav()
    {
        System.out.println("cat is my least fav animal");
    }
}