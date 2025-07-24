package week3.practice7;

import java.util.Scanner;

/* 입력 예시
	1. The Great Gatsby, F. Scott Fitzgerald, 1925, 10000
	2. 1984, George Orwell, 1949, 15000
	3. To Kill a Mockingbird, Harper Lee, 1960, 12000
	4. Animal Farm, George Orwell, 1945, 8000
*/
public class Test {

	public static void main(String[] args) {
		
		String title, writer;
		int year, price;
		Book[] books = new Book[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("책 추가: ");
			String str = sc.nextLine();
			String[] arr = str.split(",");
			
			title = arr[0].trim();
			writer = arr[1].trim();
			year = Integer.parseInt(arr[2].trim());
			price = Integer.parseInt(arr[3].trim());
			
			books[i] = new Book(title, writer, year, price);
		}
		BookControl.searchPrice(books, 12000);
		BookControl.searchTitle(books, "George Orwell");
		
		sc.close();
	}

}
