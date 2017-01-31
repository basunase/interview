import java.util.*;
import java.io.*;
public class CandidateCode {
	
	public static void main(String args[] ) throws Exception {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int res =0;
	int [][] a = new int[m][n];
	for (int i = 0; i < m; i++){
		for (int j =0; j < n; j++){
			a[i][j] = sc.nextInt();
		}
	}
	
	int p = sc.nextInt();
	int q = sc.nextInt();
	int [][] b = new int[p][q];
	for (int i = 0; i < p; i++){
		for (int j =0; j < q; j++){
			b[i][j] = sc.nextInt();
		}
	}
	for (int i = 0; i < p; i++){
		for (int j = 0; j < q; j++){
			System.out.print((a[i][j] + b[i][j]));  
			if(j==(q-1))
				System.out.print("\n");
			else
				System.out.print(" ");
		}
	}
	
	}
}