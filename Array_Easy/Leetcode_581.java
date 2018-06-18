package Array_Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_581 {
	public int findUnsortedSubarray(int[] nums) {
//      思路:讲数组进行排序，找到中间有变化的部分就是我们要找的部分 时间复杂度:nlogn,空间复杂度：n
//		int[] temp = new int[nums.length];
//		System.arraycopy(nums, 0, temp, 0, nums.length);
//		Arrays.sort(temp);
//		int start = 0;
//		int end = nums.length-1;
//		while(start<nums.length&&nums[start]==temp[start]){
//			start++;
//		}
//		
//		while(end>start&&nums[end] == temp[end]){
//			end--;
//		}
//		
//		return end-start+1;
		
//  	思路2:两个指针,从左往右应该是递增的，如果是递增的，我们什么也不做，如果不是递增的，记录位置信息，最后这个位置信息应该在数组最后1次逆序的位置
//		同理，从最右边也开始1个指针，往左边走,递减，如果是递减的，则什么也不错，如果不是递减的，那么记录位置信息，最后这个位置信息应该是第一次发生逆序的位置
		int max = nums[0];
		int min = nums[nums.length-1];
		
		int end = -1;
		int start = -2;
		for(int i=1;i<nums.length;i++){
			if(nums[i]<max){
				 end = i;
			}else{
				max =nums[i];
			}
		}
		
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]>min){
				start = i;
			}else{
				min = nums[i];
			}
		}
		System.out.println("max"+max+" min:"+min+"end"+end+"start"+start);
		return end-start-1;
	}
	
	public static void main(String[] args) {
		Leetcode_581 l = new Leetcode_581();
		int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
		l.findUnsortedSubarray(nums);
	}
}
