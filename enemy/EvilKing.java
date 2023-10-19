package enemy;

public class EvilKing extends Enemy {

	public EvilKing() {


		this.setMax_HP(1500);
		this.setMax_HP(1500);
		this.setHp(1500);
		this.setAtk(200);
		this.setDef(100);
		this.setCrit(10);
		this.setName("悪魔王");
		this.setEnemyStrength("Strong");
		this.setSmallAtkDmg(10);
		this.setMediumAtkDmg(30);
		this.setLargeAtkDmg(50);
		this.setSmallAtkName("子パン");
		this.setMediumAtkName("中キック");
		this.setLargeAtkName("大パン");
	}
}
