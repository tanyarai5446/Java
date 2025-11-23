public class PrintfUsesInt {
    public static void main(String[]args){

        //%[flag][width][.precision][specifier-character]

        //0 padding for same width
        //number right justified padding(rempves zeroes gives spaces)
        //-ve no. = left justified padding

        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7898;

//        System.out.printf("%04d\n",id1);//0001
//        System.out.printf("%04d\n",id2);//0023
//        System.out.printf("%04d\n",id3);//0456
//        System.out.printf("%04d\n",id4);//7898

//        System.out.printf("%4d\n",id1);//   1
//        System.out.printf("%4d\n",id2);//  23
//        System.out.printf("%4d\n",id3);// 456
//        System.out.printf("%4d\n",id4);//7898

        System.out.printf("%-4d\n",id1);//1
        System.out.printf("%-4d\n",id2);//23
        System.out.printf("%-4d\n",id3);//456
        System.out.printf("%-4d\n",id4);//7898





    }
}
