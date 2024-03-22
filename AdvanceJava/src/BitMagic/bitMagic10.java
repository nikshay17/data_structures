package BitMagic;

public class bitMagic10 {
    public static int maxOnes(int a[], int n) {
        int one = 0;
        int sum = 0;
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                sum--;
                one++;
            } else {
                sum++;
            }

            if (sum < 0) {
                sum = 0;

            }
            max1 = Math.max(max1, sum);
        }
        return one + max1;
        // Your code goes here
    }

    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 0, 0, 1};
        int n = array.length;
        System.out.println(maxOnes(array,n));

    }
}