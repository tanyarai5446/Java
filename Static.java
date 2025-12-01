public class Static {
    public static void main(String[]args){
        friend friend1=new friend("spongebob");
        friend friend2=new friend("patrick");
        friend friend3=new friend("tanya");
        friend.showfriends();
    }
}
class friend{
    // static = a keyword which belongs to class itself not to any specific object
    //can be called without creating an object we do not need "this"
    //provides utility methods like math.abs and etc math class methods
    // shared resources saves memory
    static int numofFriends;
    String name;

    friend(String name){
        this.name=name;
        numofFriends++;
    }
    static void showfriends()
    {
        System.out.println("you have total "+ numofFriends+" friends");
    }
}
