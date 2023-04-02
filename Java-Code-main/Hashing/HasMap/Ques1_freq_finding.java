package Hashing.HasMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ques1_freq_finding
{
    // given an array of size n ,find all the elements that appear more than [n/3] times
    // eg nums[] ={1,3,2,5,1,3,1,5,1}  =  ans-[1]
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt() ;          //enter the size of array
        int nums[] = new int [ n ];     // create an empty array with name nums

        System.out.println("Enter the number stored in nums");
        for(int i =0 ; i<n;i++)
        {
          nums[i]=sc.nextInt();             // reading  the value
          System.out.print(nums[i] + " ");  // accessing the array elements
        }

        int freq;
        HashMap <Integer,Integer> map = new HashMap<>();
        // here we will  check weather hasmap contains key
        // if it contains the freq value will increase by one
        // if it does not contain it will remains constant
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]) )
            {
              map.put(nums[i], map.get(nums[i]) + 1); // key = i ,value = 0+1 and so on
            }
            else
            {
              map.put(nums[i] , 1); // key = i,value =1(existing already)
            }
        }

        System.out.println();
        System.out.println("the number with majority occurence is :-");
        for(int key : map.keySet() )   // all the value of key set points to key
        {
          if(  map.get(key) >n/3)     // from set(key) we will get value of frequency stored in val
          {
              System.out.println(key);
          }

        }

    }
}
