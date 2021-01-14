package S11;

public class PoisonMatango extends Matango {

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	int poisonAttack = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonAttack < 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			System.out.println(h.getHp() - (h.getHp() / 5) + "ポイントのダメージ");
			this.poisonAttack--;
		}
	}

}
