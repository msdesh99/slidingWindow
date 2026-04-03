package arrays;
import java.util.Deque;
import java.util.LinkedList;
import org.testng.annotations.Test;
import java.util.Arrays;
public class MaxNumberFromSubArrayClass {
    @Test
    public void DequeSlidingWindow_leetCode239(){
        int[] arr = {43,23,456,23,67,3,1,4,78768};
        int k=3,result=Integer.MIN_VALUE,resultIndex=0;
        Deque<Integer> queue = new LinkedList<Integer>();
        int[] resultArr = new int[arr.length-k+1];
        for(int i=0;i<arr.length;i++){
            if(!queue.isEmpty() && queue.size()==k){
                resultArr[resultIndex++]=result;
                if(queue.poll()==result)  //it will remove the ele at the same time
                    result = Integer.MIN_VALUE;
                    for(int val: queue)
                        result = Math.max(result,val);
            }
            result = Math.max(result,arr[i]);     
            queue.add(arr[i]);
        }
            resultArr[resultIndex++]=result;
            System.out.println(Arrays.toString(resultArr));
            System.out.println("=========================COnsole OUTPUT=======================");
    }

}
