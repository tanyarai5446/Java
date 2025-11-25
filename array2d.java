public class array2d {
    public static void main(String[]args){
        //2darray = an array where each element is an array
        //          useful for sorting a matrix of data

        String[] fruits={"apple","banana","orange"};
        String[] vege={"potato","onion","carrot"};
        String[] meat={"chicken","beef","pork","fish"};
        String[][] groceries={fruits,vege,meat};
//        String[][] groceries={{"apple","banana","orange"},      can use this way also
//                              {"potato","onion","carrot"},
//                              {"chicken","beef","pork","fish"}};
//
        for(String[] grow:groceries)
        {
            for(String food:grow)
            {
            System.out.print(food+" ");
            }
            System.out.println();
        }
    }
}
