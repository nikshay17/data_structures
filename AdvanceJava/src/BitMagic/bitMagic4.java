package BitMagic;

public class bitMagic4 {
    static int findSet(int []array,int n){
        int res=0;
        for(int i=0;i<n;i++){
            res=res^array[i];
        }
        return res;


    }
    public static void main(String[] args) {
        int []arr={3,4,3,5,5};
        System.out.println(findSet(arr,arr.length));
    }
}
