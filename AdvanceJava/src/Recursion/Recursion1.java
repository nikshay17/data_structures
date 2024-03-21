package Recursion;

public class Recursion1 {
    static void tower (int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move 1 from "+A+" TO "+C);
            return;

        }tower( n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" TO "+C);
        tower(n-1,B,A,C);



    }
    public static void main(String[] args) {
        tower(10,'A','B','C');

    }
}
