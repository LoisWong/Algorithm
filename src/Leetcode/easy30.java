package Leetcode;

public class easy30 {
	public int findMin(int[] num) {
        if (num.length == 1){
            return num[0];
        }
        else{
            for (int i = 1; i < num.length; i++){
                if ( num[i] < num[i-1]){
                    return num[i];
                }
            }
        return num[0];
        }
    }
}
