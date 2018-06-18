package Array_Easy;

public class Leetcode_766 {
	/*
	 * 思路1：到(n-1)和m-1,即不考虑最左下和最右上的元素，其他的元素只要保证他们的matrix[i][j]=matrix
	 */
	 public boolean isToeplitzMatrix(int[][] matrix) {
		 int n = matrix.length;
		 int m = matrix[0].length;
		 
		 for(int i=0;i<n-1;i++){
			 for(int j=0;j<m-1;j++){
				 if(matrix[i][j] != matrix[i+1][j+1]){
					 return false;
				 }
			 }
		 }
		 return true;
	 }
}
