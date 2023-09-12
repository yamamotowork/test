package enemy;

public class Goblin extends Enemy {

	public Goblin(){

	this.setHp(100);
	this.setAtk(40);
	this.setDef(30);
	this.setCrit(5);
	this.setName("ゴブリン");
	this.setEnemyStrength("normal");
	this.setSmallAtkDmg(10);
	this.setMediumAtkDmg(20);
	this.setLargeAtkDmg(30);
	this.setSmallAtkName("子パン");
	this.setMediumAtkName("中キック");
	this.setLargeAtkName("大パン");
	}

}
