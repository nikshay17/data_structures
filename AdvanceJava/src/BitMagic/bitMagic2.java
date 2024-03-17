package BitMagic;

public class bitMagic2 {
    static int countSet(int x){
        int tot=0;
        while(x>0){
            /*if (n%2)!=0{
             * res++}*/
            if((1&x)!=0){
                tot=tot+1;

            }
            x=x>>1;
        }
        return tot;
    }
    public static void main(String[] args) {
        System.out.println(countSet(7));
        System.out.println(countSet(9));

    }
}
