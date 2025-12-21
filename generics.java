public class generics {
    public static void main(String[]args)
    {
        //generics= concept in which u write classes ,interfaces ,methods with compatible data types
        //<t> type parameter(placeholder replaced by real value)
        //<String> type argument(specifies the type)

        Product<String,Integer,Integer> prod=new Product<>("pen",10,20);
        System.out.println("item- "+prod.getitem());
        System.out.println("price- "+prod.getprice());
        System.out.println("quantity- "+prod.getquantity());

    }
}
class Product<T,U,V>{
    T item;
    U price;
    V quantity;
    Product(T item,U price,V quantity)
    {
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    T getitem(){
        return this.item;}
    U getprice(){
        return this.price;}
    V getquantity(){
        return this.quantity;}
}