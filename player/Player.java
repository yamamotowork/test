package player;

import enemy.Enemy;

public abstract class Player {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int crit;
	private String name;
	private String equipmentName;
	private int Max_HP;
	private int Max_MP;
	private String smallAtk;
	private String mediumAtk;
	private String largeAtk;
	//private int speed;
	//弱、中、強ランクの技を用意するかメソッドで乱数で威力設定


	//wizard の作成

	public void attack(Enemy e) {
		System.out.println(this.name + "の攻撃！");
		int dmg = this.atk - e.getDef();
		if (new java.util.Random().nextInt(100) < 2 + this.crit) {
			dmg *= 2;
			System.out.println("クリティカルヒット！");
		}
		e.setHp(e.getHp() - dmg);
		System.out.println(e.getName() + "に" + dmg + "のダメージを与えた");
		System.out.println(e.getName() + "の残りHPは" + e.getHp());

	}

	public void Heal() {
		System.out.println(this.name + "のヒール");
		int hpHeal = this.Max_HP - this.Max_HP / 10;

		if (this.hp >= hpHeal) {
			this.hp = this.Max_HP;
			System.out.println("HPが最大まで回復した");

		} else {
			this.hp += this.Max_HP / 10;
			System.out.println(this.hp + "まで回復した、回復量：" + this.Max_HP / 10);
		}

	}

	public void Small() {

	}

	//ステータスのsetter,getter
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}

	public int getMax_HP() {
		return Max_HP;
	}

	public void setMax_HP(int max_HP) {
		Max_HP = max_HP;
	}

	public int getMax_MP() {
		return Max_MP;
	}

	public void setMax_MP(int max_MP) {
		Max_MP = max_MP;
	}

	public String getSmallAtk() {
		return smallAtk;
	}

	public void setSmallAtk(String smallAtk) {
		this.smallAtk = smallAtk;
	}

	public String getMediumAtk() {
		return mediumAtk;
	}

	public void setMediumAtk(String mediumAtk) {
		this.mediumAtk = mediumAtk;
	}

	public String getLargeAtk() {
		return largeAtk;
	}

	public void setLargeAtk(String largeAtk) {
		this.largeAtk = largeAtk;
	}

}
