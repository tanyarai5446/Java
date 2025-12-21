import java.util.HashMap;
public class hashmaps {
    public static void main(String[]args)
    {
        //hashmap=a data structure that stores key-value pair
        //keys are unique but value can be repeated
        //HashMap<key, value>

        HashMap<String,  Double> map=new HashMap<>();

        System.out.println("Displaying hashmap");
        map.put("Apple",2.5);
        map.put("Banana",6.4);
        map.put("Orange",7.5);
        map.put("Mango",8.0);
        System.out.println(map);
        System.out.println("Removing a elemnt of hashmap");
        map.remove("Apple");
        System.out.println("Displaying hashmap after removing one ele");
        System.out.println(map);
        if(map.containsKey("Apple"))
            System.out.println("key found");
        else
            System.out.println("key not found");
        //similarly map.containsValue(2.5)
     //customizing o/p
        System.out.println("customizing o/p");
        for(String key: map.keySet())
        {
            System.out.println(key+"  : $ "+map.get(key));
        }
    }
}
