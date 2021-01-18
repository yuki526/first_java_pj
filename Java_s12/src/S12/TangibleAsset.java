package S12;

public abstract class TangibleAsset extends Asset implements Thing {
	double weight;
	private String color;

//	コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

//	getterメソッド
	public String getColor() { return this.color; }
	public double getWeight() { return this.weight; }

//	setterメソッド
	public void setWeight(double weight) { this.weight = weight; }


}
