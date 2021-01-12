package S5;

public class Main {

	public static void main(String[] args) {
//		5-1
		introduceOneself();
//		5-2
		email("タイトルです。", "aaa@abc.com", "こんにちはいい天気ですね。");
//		5-3
		email("aaa@abc.com", "雨です。");
//		5-4
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
		
		

	}

	public static void introduceOneself() {
		String name = "aaa";
		int age = 22;
		double height = 1.56;
		char gender = '女';
		System.out.println(name + "です。" + age + height + gender);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address +"に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address +"に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
