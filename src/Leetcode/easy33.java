//Given numRows, generate the first numRows of Pascal's triangle.

package Leetcode;

import java.util.ArrayList;

public class easy33 {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> Flist = new ArrayList<ArrayList<Integer>>();
        int[][] ints = new int[numRows][numRows];
        if (numRows == 0){
            return Flist;
        }
        if (numRows == 1){
             ArrayList<Integer> intList = new ArrayList<Integer>();
             intList.add(1);
             Flist.add(intList);
             return Flist;
        }
        else {
        for (int i = 0; i< numRows; i++){
            ArrayList<Integer> intList = new ArrayList<Integer>();
            ints[i][0] = 1;
            for (int j = 1; j <= i; j++){
                if (j == i){
                    ints[i][j] = 1;
                }
                else{
                    ints[i][j] = ints[i-1][j-1] + ints[i-1][j];
                }
            }
            for (int j = 0; j <= i; j++){
                intList.add(ints[i][j]);
            }
            Flist.add(intList);
        }
        return Flist;
        }
    }
}