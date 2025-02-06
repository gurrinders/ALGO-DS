package algo.dp;

public class MatrixSum2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        
		System.out.println("***INPUT***");
		printMatrix(arr); 
		
		System.out.println("***PREPROCESSOR***");
        int preMatrix [][] = preProcessor(arr);
        printMatrix(preMatrix);
        
        System.out.print("***SubmatrixSum***");
        System.out.println("index: ");
        int li=1, lj=1, ri=2,rj=2;
        int subSum = getsum(preMatrix,li,lj,ri,rj);
        System.out.print(subSum);
	}
	
	private static int getsum(int[][] arr, int li, int lj, int ri, int rj) {
		int sum= arr[ri][rj];
		  
		if(li>0)
			sum = sum - arr[li-1][rj];
		  		
		if(lj>0)
			sum = sum - arr[ri][lj-1];
		  
		if(li>0 && lj>0)
		sum = sum + arr[li-1][lj-1];
		  
		return sum;
	}

	private static void printMatrix(int arr[][]) {
		System.out.println("******");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] preProcessor(int arr[][]) {
		int sum[][]=new int[3][3];
		
		//initialize first row
		for(int i=0,j=0;j<3; j++) {
			sum[i][j]= arr[i][j]+ sum[i][j];
		}
		
		//column sum
		for(int i=1;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]= sum[i-1][j] + arr[i][j];
			}
		}
		
		//row sum
		for(int j=1;j<3;j++) {
			for(int i=0;i<3;i++) {
				sum[i][j]+= sum[i][j-1]; 	
			}		
		}	
		return sum;	
    }
}
	
	
