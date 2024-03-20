package BitMagic;

public class bitMagic8 {
    static int missingNumber(int array[], int n) {
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];

        }return n*(n+1)/2-sum;



        // Your Code Here
    }

    public static void main(String[] args) {
        int [] array={1,2,3,5,6,7};
        System.out.println(missingNumber(array,6));

    }
}
