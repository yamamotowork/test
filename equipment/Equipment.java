package equipment;

import player.Player;

public abstract class Equipment {
	private int hpBonus;
	private int mpBonus;
	private int atkBonus;
	private int defBonus;
	private int critBonus;
	private String name;



	public void statesBonus(Player p) {
		p.setHp(hpBonus + p.getHp());
		p.setMp(mpBonus + p.getMp());
		p.setAtk(atkBonus + p.getAtk());
		p.setDef(defBonus + p.getDef());
		p.setCrit(critBonus + p.getCrit());


	}

	public int getHpBonus() {
		return hpBonus;
	}

	public void setHpBonus(int hpBonus) {
		this.hpBonus = hpBonus;
	}

	public int getMpBonus() {
		return mpBonus;
	}


	public void setMpBonus(int mpBonus) {
		this.mpBonus = mpBonus;
	}


	public int getAtkBonus() {
		return atkBonus;
	}


	public void setAtkBonus(int atkBonus) {
		this.atkBonus = atkBonus;
	}


	public int getDefBonus() {
		return defBonus;
	}


	public void setDefBonus(int defBonus) {
		this.defBonus = defBonus;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCritBonus() {
		return critBonus;
	}

	public void setCritBonus(int critBonus) {
		this.critBonus = critBonus;
	}

}
