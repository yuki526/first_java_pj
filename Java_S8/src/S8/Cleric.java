package S8;

public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	static final int MAXHP = 50;
	static final int  MAXMP = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAXMP);
	}

	public Cleric(String name) {
		this(name, Cleric.MAXHP);
	}

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを使った！");
		this.hp = Cleric.MAXHP;
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
		if (this.mp >= Cleric.MAXMP) {
			this.mp = Cleric.MAXMP;
			System.out.println(this.name + "のMPが最大まで回復した。");
			return recoverAmount;
		}
		System.out.println(this.name + "のMPが" + recoverAmount + "回復した。");
		return recoverAmount;
	}

}
