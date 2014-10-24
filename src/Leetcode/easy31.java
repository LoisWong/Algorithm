/*Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.*/
package Leetcode;

public class easy31 {
	public int[] plusOne(int[] digits) {
        int flag = 1;
        for (int i = digits.length-1; i >= 0; i--){
            if (flag == 1){
                if (digits[i] == 9){
                    digits[i] = 0;
                    flag = 1;
                }
                else{
                    digits[i] = digits[i] + 1;
                    flag = 0;
                }
            }
        }
        if (flag == 1){
            int[] update = new int[digits.length + 1];
            update[0] = 1;
            for (int j = 1; j <= digits.length; j++){
                update[j] = digits[j-1];
            }
            return update;
        }
        else return digits;
    }
}
