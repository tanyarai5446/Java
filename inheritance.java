public class inheritance {
    public static void main(String[]args){
        animal a1=new animal();
        dog d=new dog();
        cat c= new cat();
       a1.fav();
       d.fav();
       c.alive();
    }
}
class animal{
     boolean isalive;
     void alive()
    {
        isalive=true;
        System.out.println(isalive);
    }
    void fav()
   {
       System.out.println("which is your fav animal?");
   }
}
class dog extends animal{
     void fav()
    {
        System.out.println("dog is my fav animal");
    }
}
class cat extends animal{
     void fav()
    {
        System.out.println("cat is my least fav animal");
    }
}