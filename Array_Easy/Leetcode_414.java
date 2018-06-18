package Array_Easy;

public class Leetcode_414 {
	public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        int count = 0;//Í³¼ÆÖ¸Õë
        for(int x : nums){
        	if(x==max&&count>=1||x==second&&count>=2||x==third&&count>=3){
        		continue;
        	}
        	if(x > max){
        		third = second;
        		second = max;
        		max = x;
        		count++;
        	}else if(x > second){
        		third = second;
        		second = x;
        		count++;
        	}else if(x >=third){
        		third = x;
        		count++;
        	}
        }
        
        if(count>=3){
        	return third;
        }else{
        	return max;
        }
        
    }
}
