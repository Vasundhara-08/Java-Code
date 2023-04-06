package Hashing.HasMap;

import java.util.HashMap;

public class Ques3_Subarray_sum_equals_k {
    public static void main(String[] args) {
        int arr[] = {3,-0,-10,9,3,4,2,1};
        int k = 6;

        HashMap<Integer,Integer> map = new HashMap<>();
        // now we need to create a map which include a key and freq of that key
        map.put(0,1); //0 means an empty map with null key and 1 means how many number of times o occured that is 1
        int sum =0;
        int ans =0;
        for(int j=0;j< arr.length;j++)
        {
            //this will be the sum of all the array
            sum+=arr[j];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
