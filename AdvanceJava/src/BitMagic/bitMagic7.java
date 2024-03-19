package BitMagic;

public class bitMagic7 {
    public static int countSet(int n){
        int count =0;
        while (n>0){
            n=(n&(n-1));
            count++;
        }

        return count;
    }
    public static int is_bleak(int n)
    {
        for(int i=n-(int)Math.ceil(Math.log(n)/Math.log(2));i<n;i++){
            if(i+countSet(i)==n){
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println(is_bleak(4));
    }
}

