package enemy;

public class Matango extends Enemy {

	public Matango() {

		this.setHp(80);
		this.setMax_HP(80);
		this.setAtk(30);
		this.setDef(30);
		this.setCrit(0);
		this.setName("マタンゴ");
		this.setEnemyStrength("weak");
		this.setSmallAtkDmg(5);
		this.setMediumAtkDmg(10);
		this.setSmallAtkName("子パン");
		this.setMediumAtkName("中キック");



	}


}
