package Array_Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;//����
        int m = nums[0].length;//����
        //Υ������
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
		int[] preArray =new int[A.length()];//��¼����λ�õ�pre
		Map<Character, Integer> map = new HashMap<>();
		char[] array = A.toCharArray();
		
		for(int i=0;i<A.length();i++){
			Integer lastPosition = map.get(array[i]);
			if(lastPosition == null){
				//��һ�γ��ֵ�λ��Ϊnull,�������ʱ����ַ���һ�γ���
				preArray[i] = (i==0)?1:preArray[i-1]+1;//��,prrArray[0] = 1,�������
				map.put(char[i], i);
			} 
		}
		
    }
}
