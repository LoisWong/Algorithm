/*You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Fibonacci： F(n) = F(n-1) + F(n-2); */
package Leetcode;

public class easy13 {
	public int climbStairs(int n) {
        if (n ==0 || n == 1 || n == 2){
            return n;
        }
        else{
            int result = 0;
            int First = 1, Second = 2;
            for (int i = 2; i < n; i++){
                result = First + Second;
                First = Second;
                Second = result;
            }
        return result;    
        }
    }
}
