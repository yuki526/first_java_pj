package S4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		練習4-2
		int moneyList[] = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for(int value : moneyList) {
			 System.out.println(value);
		}
		
		System.out.println("===========================");
		
//		練習4-4
		int numbers[] = {3, 4, 9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("１桁の数字を入力してください");
		int input = scanner.nextInt();
		
		for(int value: numbers) {
			if(value == input) {
				System.out.println("アタリ！");
			}
		}
		scanner.close();
	}

}