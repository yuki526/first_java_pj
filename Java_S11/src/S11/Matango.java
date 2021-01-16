package S11;

public class Matango {
	int hp = 50;
	private char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack (Hero h) {
		System.out.println("きのこ"+ this.suffix + "！10のダメージ");
		h.setHp(h.getHp() - 10);
	}

}
