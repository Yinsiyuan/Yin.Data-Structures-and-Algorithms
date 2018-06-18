package Array_Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;//行数
        int m = nums[0].length;//列数
        //违反题意
        if(r*c !=  n*m){
        	return nums;
        }
        int[] temp = new int[m*n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		
        	}
        }
        int[][] result = new int[r][c];
        
    }
	
	public int longestSubstring(String A, int n) {
		int[] preArray =new int[A.length()];//记录各个位置的pre
		Map<Character, Integer> map = new HashMap<>();
		char[] array = A.toCharArray();
		
		for(int i=0;i<A.length();i++){
			Integer lastPosition = map.get(array[i]);
			if(lastPosition == null){
				//上一次出现的位置为null,代表这个时候此字符第一次出现
				preArray[i] = (i==0)?1:preArray[i-1]+1;//即,prrArray[0] = 1,后面继续
				map.put(char[i], i);
			} 
		}
		
    }
}
