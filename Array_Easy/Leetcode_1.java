package Array_Easy;

import java.util.HashMap;

public class Leetcode_1 {
	 //��������ѭ���Ļ�����Ҫo(n*n)��ʱ�临�Ӷȣ�����ʹ��HashMap,����ʱ�临�Ӷȣ������ÿռ任ʱ��
	 
	 public int[] twoSum(int[] numbers, int target)  {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int n = numbers.length;
		 //��ʼ������
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
