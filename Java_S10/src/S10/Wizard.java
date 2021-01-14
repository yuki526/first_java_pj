package S10;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.getPower());

		h.setHp(h.getHp() +recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public Wand getWand() {
		return this.wand;
	}


	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が3文字以上のため処理を中断");
		}
		this.name = name;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}else {
			this.hp = hp;
		}
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPの値が不正のため処理を中断");
		}
		this.mp = mp;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖の値が不正のため処理を中断");
		}
		this.wand = wand;
	}

}
