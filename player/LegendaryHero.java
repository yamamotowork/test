package player;

import equipment.LegendarySword;

public class LegendaryHero extends Player {

	public LegendaryHero() {

		this.setHp(1000);
		this.setMax_HP(1000);
		this.setMp(100);
		this.setAtk(100);
		this.setDef(50);
		this.setCrit(10);
		this.setName("伝説の勇者");
		this.setSmallAtkDmg(10);
		this.setMediumAtkDmg(20);
		this.setLargeAtkDmg(30);
		this.setSmallAtkName("小パンチ");
		this.setMediumAtkName("中パンチ");
		this.setLargeAtkName("大パンチ");

		LegendarySword legendarySword = new LegendarySword();
		legendarySword.statesBonus(this);

		LegendarySword legendaryArmor = new LegendarySword();
		legendaryArmor.statesBonus(this);




	}

}
