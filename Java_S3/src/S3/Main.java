package S3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		練習3-3
		int seibutsu = 1;
		int age = 22;
		
		System.out.println("こんにちは。");
		
		if (seibutsu == 0) {
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		} else {
			System.out.println("私は女です。");
		}
		System.out.println("よろしくおねがいします。");
		
		System.out.println("======================");
		
		
//		練習3-5
		System.out.println("[メニュー]　1：検索　2：登録　3：削除　4：変更＞");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

	}
}
