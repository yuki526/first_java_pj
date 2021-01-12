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

		switch(input) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}

		System.out.println("======================");


//		練習3-6
		System.out.println("数あてゲーム");
		int ans = new java.util.Random().nextInt(10);

		for(int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = scanner.nextInt();

			if (ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");
		scanner.close();
	}

}
