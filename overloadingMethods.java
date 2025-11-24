public class overloadingMethods {
    public static void main(String[]args){
        //overloadin methods = methods that share same name but different parameter
        //                     signature =name+parameter
        String pizza=bakepizza("flat bread","mozzarella","corn");
        System.out.print(pizza);
    }
    static String bakepizza(String bread){
        return bread +" pizza" ;
    }
    static String bakepizza(String bread,String cheese){
        return cheese+" "+bread + " pizza" ;
    }
    static String bakepizza(String bread,String cheese,String toppings){
        return toppings+" "+ cheese +" "+bread + " pizza";
    }
}
