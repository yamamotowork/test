package enemy;

public class Metal extends Enemy{

	public Metal() {
		this.setHp(100);
		this.setAtk(20);
		this.setDef(30);
		this.setCrit(0);
		this.setName("メタル");
		this.setEnemyStrength("rare");
	}
}
