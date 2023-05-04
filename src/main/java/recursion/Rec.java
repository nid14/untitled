package recursion;

public class Rec {
    public static void recPrint(int count){
//        System.out.println(count);

        if(count>5){
            return;
        }
        System.out.println(count);
        recPrint(count+1);
        System.out.println(count);


    }
    public static void main(String[] args){
        recPrint(1);
    }
}
