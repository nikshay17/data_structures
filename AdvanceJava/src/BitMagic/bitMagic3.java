package BitMagic;

public class bitMagic3 {
    //        if((n&(1<<k-1))!=0){
//            System.out.println("yes");
//
//        }else{
//            System.out.println("no");
//        }
    static void kthBit(int n,int k){



        if((n>>(k-1)&1)!=0){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
        kthBit(5,3);
        kthBit(6,4);

    }
}
