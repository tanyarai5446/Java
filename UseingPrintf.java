public class UseingPrintf {
    public static void main(String[]args)
    {
        //+ = output a plus
        //, = comma grouping separator
        //( = -ve no. are grouped inside()
        //space = display a minus if -ve,space if +ve

        double price1=8800.02;
        double price2=10000.15;
        double price3=-5400.10;

//        System.out.printf("%+f\n",price1);
//        System.out.printf("%+f\n",price2);
//        System.out.printf("%+f",price3);

//        System.out.printf("%,.2f\n",price1);//increase zeroes if 2 digit i.e. if 8800.02=>8,800.02
//        System.out.printf("%,.2f\n",price2);
//        System.out.printf("%,.2f",price3);

//        System.out.printf("%(f\n",price1);
//        System.out.printf("%(f\n",price2);
//        System.out.printf("%(f",price3);

        System.out.printf("% f\n",price1);
        System.out.printf("% f\n",price2);
        System.out.printf("% f",price3);
    }

}
