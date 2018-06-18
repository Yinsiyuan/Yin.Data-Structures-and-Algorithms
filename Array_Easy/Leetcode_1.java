package Array_Easy;

import java.util.HashMap;

public class Leetcode_1 {
	 //数组两次循环的话则需要o(n*n)的时间复杂度，我们使用HashMap,降低时间复杂度，属于用空间换时间
	 
	 public int[] twoSum(int[] numbers, int target)  {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int n = numbers.length;
		 //初始化数据
		 for(int i=0;i<n;i++){
			 map.put(numbers[i], i);
		 }
		 
		 for(int i=0;i<n;i++){
			 int first = numbers[i];
			 int need  = target-first;
			 if(map.containsKey(need)&&(map.get(need)!=i)){
				 return new int[]{i,map.get(need)};
			 }
		 }
		 throw new IllegalArgumentException("No two sum solution");
		 
	 }

}
