package loop;

import java.util.Scanner;

public class SortElement {

	public static void main(String[] args) {
		int count, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu trong mang:");
		count = sc.nextInt();
		int num[] = new int[count];
		System.out.println("Cac phan tu trong mang la:");
		for (int i =0; i < count; i++){
			num[i] = sc.nextInt();
		}
		sc.close();
		for (int i =0; i < count; i++)
		{
			for (int j = i +1; j < count; j++) {
				if (num[i] > num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Ket qua sau khi duoc sap xep:");
		for (int i = 0; i < count -1; i++){
			System.out.print(num[i]+", ");
		}
		System.out.print(num[count -1]);
	}

}
