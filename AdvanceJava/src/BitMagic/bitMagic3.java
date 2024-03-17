package BitMagic;

public class bitMagic3 {
    static int countSet(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1));//removing the last bit
            res++;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(countSet(7));
        System.out.println(countSet(9 ));

    }

}
