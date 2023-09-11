package player;

import equipment.LegendarySword;

public class LegendaryHero extends Player {

	public LegendaryHero() {

		this.setHp(1000);
		this.setMp(100);
		this.setAtk(100);
		this.setDef(50);
		this.setCrit(10);
		this.setName("伝説の勇者");

		LegendarySword legendarySword = new LegendarySword();
		legendarySword.statesBonus(this);

		LegendarySword legendaryArmor = new LegendarySword();
		legendaryArmor.statesBonus(this);




	}

}
