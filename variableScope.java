public class variableScope {
    int x=3;//CLASS
    public static void main(String[]args){
        //variable scope = where a variable can be accesed
        int x=1;//LOCAl
        System.out.println(x);
        dosomething();
        System.out.println(x);
    }
    static void dosomething(){
        int x=2;//LOCAL
        System.out.println(x);
    }
}
