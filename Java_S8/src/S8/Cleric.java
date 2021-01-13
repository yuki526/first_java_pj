package S8;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int  MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを使った！");
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した。");
		System.out.println("MPを5消費した。");
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.mp);
	}
	
	public int pray(int second) {
		System.out.println(this.name + "はいのるを使った！");
		int s = new java.util.Random().nextInt(3);
		int recoverAmount = second + s;
		this.mp += recoverAmount;
		if (this.mp >= this.MAXMP) {
			this.mp = this.MAXMP;
			System.out.println(this.name + "のMPが最大まで回復した。");
			return recoverAmount;
		}
		System.out.println(this.name + "のMPが" + recoverAmount + "回復した。");
		return recoverAmount;
	}

}
