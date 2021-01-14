package S11;

public class Hero {
	private int hp = 50;
	private String name = "ゆうしゃ";

	public String getName() {
		return this.name;
	}

	public void setHp(int recoverAmount) {
		this.hp += recoverAmount;
	}

	public int getHp() {
		return this.hp;
	}

}
