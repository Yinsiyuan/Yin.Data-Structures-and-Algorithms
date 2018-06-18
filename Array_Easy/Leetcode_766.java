package Array_Easy;

public class Leetcode_766 {
	/*
	 * ˼·1����(n-1)��m-1,�������������º������ϵ�Ԫ�أ�������Ԫ��ֻҪ��֤���ǵ�matrix[i][j]=matrix
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
