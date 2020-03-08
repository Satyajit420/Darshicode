package com.nt.proj;

public class TwoDimensional {

	public static void main(String[] args) {
		int[][] a= {{12,23,34},{11,22,33},{44,55,66}};

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
