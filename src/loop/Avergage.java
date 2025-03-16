package loop;

import java.util.Scanner;

public class Avergage {

	public static void main(String[] args) {
		System.out.println("Nhap vao so phan tu trong mang: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		double total =0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("Nhap vao gia tri cho phan tu thu" +(i+1)+":");
			arr[i] = sc.nextDouble();
		}
		sc.close();
		for(int i=0; i<arr.length; i++) {
			total = total +arr[i];
		}
		double average = total / arr.length;
		System.out.format("Ket qua la: %.3f", average);
	}

}
