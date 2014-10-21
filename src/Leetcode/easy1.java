package Leetcode;
/*Given an array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class easy1 {
    public int singleNumber(int[] A) {
        int x=0;
 
        for(int a: A){
            x = x ^ a;
        }
 
        return x;
    }
}