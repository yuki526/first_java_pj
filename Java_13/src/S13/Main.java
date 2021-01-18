package S13;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		X obj = new A();
		obj.a();

		Y y1 = new A();
		Y y2 = new B();

		y1.a();
		y2.a();

		Y[] array = {y1, y2};

		for (Y element:array) {
			element.b();
		}

	}

}
