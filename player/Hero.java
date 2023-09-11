package player;

import equipment.Sword;

public class Hero extends Player {

	public Hero() {

		this.setHp(100);
		this.setMp(10);
		this.setAtk(50);
		this.setDef(20);
		this.setCrit(0);
		this.setName("勇者");

		Sword sword = new Sword();
		sword.statesBonus(this);

	}

}
