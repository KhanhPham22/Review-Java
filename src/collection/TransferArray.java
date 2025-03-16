package collection;

import java.util.ArrayList;

public class TransferArray {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("Python");
		languages.add("Java");
		
		System.out.println("\n Cac phan tu trong ArrayList:" + languages);
		String[] arr = new String[languages.size()];
		languages.toArray(arr);
		
		System.out.print("Cac phan tu trong mang array:");
		for(String item:arr) {
			System.out.print(item+",");
		}
	}

}
