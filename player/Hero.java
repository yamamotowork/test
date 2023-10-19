package player;

import equipment.Sword;

public class Hero extends Player {

	public Hero() {

		this.setHp(200);
		this.setMax_HP(200);
		this.setMp(10);
		this.setAtk(50);
		this.setDef(20);
		this.setCrit(0);
		this.setName("勇者");
		this.setSmallAtkDmg(10);
		this.setMediumAtkDmg(20);
		this.setLargeAtkDmg(30);
		this.setSmallAtkName("小パンチ");
		this.setMediumAtkName("中パンチ");
		this.setLargeAtkName("大パンチ");

		Sword sword = new Sword();
		sword.statesBonus(this);
		//装備品

	}

}
