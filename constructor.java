public class constructor {
    public static void main(String[]args) {
        fruit  fr1=new fruit("Tanya","apple");
        fruit  fr2=new fruit("Patrick","banana");
        fruit  fr3=new fruit("Sponge","orange");
        fruit[] fruits={fr1,fr2,fr3};
        for(fruit fr:fruits)
        {
            fr.eat();
        }
    }
}
//this is a package private class which means its members can be accesed from any class in the same package
// and main is in same package as fruit so public not used
//we dont write public class fruit becoz in java the class name should match file name and a file can only have one top level class
class fruit {
    String name;
    String fruit;
    fruit(String name,String fruit)
    {
        this.name=name;
        this.fruit=fruit;
    }
    void eat()
    {
        System.out.println(this.name+" is eating "+this.fruit);
    }
}
