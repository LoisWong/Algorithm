/*Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321*/

package Leetcode;

public class easy4 {
	public int reverse(int x) {
        int r = x;
        if (r < 0){
            r = -r; 
        }
        if (r == 0){
            return x;
        }
        else{
            int a = 0;
            while (r > 0){
              a = a * 10 + (r % 10);
              r = r / 10;
            }
            if (x < 0){
                return 0-a;
            }
            else
                return a;
        }
    }
}