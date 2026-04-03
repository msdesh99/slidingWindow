package arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.annotations.Test;
public class MaxSumOfDistinctArrayClass {
  @Test
  public void MaxSUmOFDictinctArray_LeetCode2461() {
       // int[] arr = {2,4,2,5,2,1,3,4,5};
        int[] arr = {1,5,4,2,4,6};
       // int[] arr ={4,4,4};
        //int[] arr ={9,9,9,1,2,3};
       // int[] arr ={3,1,2,2,3};

        int k=3;
        int sum=0;
        int result = Integer.MIN_VALUE;
    //set can't be used as need to maintain element for next window    
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<k;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            sum += arr[i];
        }
       // System.out.println(map.toString());
        if(map.size()==k) result = Math.max(result,sum);
        //System.out.println(k+" "+result);
        for(int i=k;i<arr.length;i++){
       map.computeIfPresent(arr[i-k],(key,value)->value>1?value-1:null);
              // System.out.println(map.toString());
            sum = sum+arr[i]-arr[i-k];
        // map.put(map.getOrDefault(map.get(arr[i]),arr[i]),
          //    map.getOrDefault(arr[i],0)+1); 
         map.put(arr[i],map.getOrDefault(arr[i],0)+1); 
        //System.out.println(map.toString());
             if(map.size()==k)
              result = Math.max(result,sum);
          //  System.out.println(k+" "+result);}

        }
        System.out.println(result);
    }
}
