package BitMagic;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

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
    static int countSet1(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1));//removing the last bit
            res++;
        }

        return res;
    }

    static int[] initialize(){
        int[] table1 =new int[256];
        table1[0]=0;
        for(int i=1;i<256;i++){
            table1[i]=(i&1)+table1[i/2];
        }
        return table1;
    }
    static int countSet2(int n){
        int [] table1= initialize();
        int res=table1[n&0xff];/*0xff is basically 11111111*/
        n=n>>8;
        res=res+table1[n&0xff];
        n=n>>8;
        res=res+table1[n&0xff];
        n=n>>8;
        res=res+table1[n&0xff];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(countSet(7));
        System.out.println(countSet1(9));
        System.out.println(countSet2(11));

    }
}
