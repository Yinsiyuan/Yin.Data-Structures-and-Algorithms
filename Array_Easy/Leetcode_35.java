package Array_Easy;

public class Leetcode_35 {
	//当数组很大时，且插入位置很往后时，就比较麻烦了，这个时候我们应该使用二分查找
	public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }

	private int binarySearch(int[] nums, int target, int left, int right) {
		if(left==right){
			if(target<=nums[left]){
				return left;
			}else{
				return left+1;
			}
		}
		int mid = (right+left)/2;
		if(target < nums[mid]){
			return binarySearch(nums, target, left, mid); 
		}else if(target == nums[mid]){
			return mid;
		}else{
			return binarySearch(nums, target, mid+1, right);
		}
	}
}
