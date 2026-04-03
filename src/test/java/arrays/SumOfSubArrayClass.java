package arrays;
import org.testng.annotations.Test;
public class SumOfSubArrayClass {
    @Test
    public void slidingWindow(){
        int[] arr = {3,2,1,3,5,2,5,67,6};
        int k=3, tot=0;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            tot +=arr[i];
            result = tot;
        }
        for(int i=k;i<arr.length;i++){
            tot = tot + arr[i] - arr[i-k];
            result = Math.max(result,tot);
        }
        System.out.println(result);
    }
}
