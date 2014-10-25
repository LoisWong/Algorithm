package Leetcode;

public class easy69 {
	public int findMin(int[] num) {
        int min = 65536;
        for (int i = 0; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
