package Array_Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_581 {
	public int findUnsortedSubarray(int[] nums) {
//      ˼·:��������������ҵ��м��б仯�Ĳ��־�������Ҫ�ҵĲ��� ʱ�临�Ӷ�:nlogn,�ռ临�Ӷȣ�n
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
		
//  	˼·2:����ָ��,��������Ӧ���ǵ����ģ�����ǵ����ģ�����ʲôҲ������������ǵ����ģ���¼λ����Ϣ��������λ����ϢӦ�����������1�������λ��
//		ͬ�������ұ�Ҳ��ʼ1��ָ�룬�������,�ݼ�������ǵݼ��ģ���ʲôҲ����������ǵݼ��ģ���ô��¼λ����Ϣ��������λ����ϢӦ���ǵ�һ�η��������λ��
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
