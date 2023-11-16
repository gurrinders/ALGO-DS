package algo.dp;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(arr); 
        int sum [][] = sumMatrix(arr);
        printMatrix(sum);
	}
	
	private static void printMatrix(int arr[][]) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				System.out.print(arr [i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] sumMatrix(int arr[][]) {
		int sum[][] = new int[3][3];
		printMatrix(sum);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				for(int ii=0; ii<=i;ii++) {
					for(int jj=0; jj<=j;jj++) {
						sum[i][j]=sum[i][j]+arr[ii][jj];
					}
				}		
			}		
		}
		return sum;
	}
}
