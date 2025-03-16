package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestInArray {
	public static int getSecondSmallest(Integer[] a, int total){
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(1);
		return element;
	}
	
	public static void main(String[] args) {
		Integer a[] ={1, 2, 5, 6, 3, 2};
		Integer b[] ={69, 44, 49, 59, 41};
		System.out.println("So nho thu 2 cua mang a:"+ getSecondSmallest(a,a.length));
		System.out.println("So nho thu 2 cua mang b:"+ getSecondSmallest(b,b.length));
	}

}
