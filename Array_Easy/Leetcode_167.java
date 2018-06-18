package Array_Easy;

public class Leetcode_167 {
	/*
	 * ˼·:˫ָ������
	 * (1)ȡ��һ��ָ��Ϊ0�±� (2)ȡ�ڶ���ָ��Ϊlength-1
	 * ���first+second>target ��ָ�����ƶ�
	 * ���first+second<target ��ָ������
	 * ���first+second=target ���ؽ������
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		//�߽������ж�
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
