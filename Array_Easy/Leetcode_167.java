package Array_Easy;

public class Leetcode_167 {
	/*
	 * 思路:双指针问题
	 * (1)取第一个指针为0下标 (2)取第二个指针为length-1
	 * 如果first+second>target 右指针左移动
	 * 如果first+second<target 左指针右移
	 * 如果first+second=target 返回结果即可
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		//边界条件判定
		if(numbers == null || numbers.length<2){
			return result;
		}
		int left = 0;
		int right = numbers.length-1;
		while(left<right ){
			if((numbers[left]+numbers[right])>target ){
				right--;
			}else if((numbers[left]+numbers[right])<target ){
				left++;
			}else if((numbers[left]+numbers[right])==target){
				result[0] = left+1;
				result[1] = right+1;
				break;
			}
		}
		
		return result;
		
    }

}
