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
	private String smallAtkName;
	private String mediumAtkName;
	private String largeAtkName;
	private int smallAtkDmg;
	private int mediumAtkDmg;
	private int largeAtkDmg;
	private int AtkUpCount;
	//private int speed;







	public void attack(Enemy e) {

		int dmg = this.atk - e.getDef();
		//使う技の乱数
		int randomMove = new java.util.Random().nextInt(9);

		//威力小、中、大、バイキルトの判定
		if(randomMove <5) {
			dmg += this.smallAtkDmg;
			System.out.println(this.name + "の" + this.smallAtkName);
		}else if(randomMove < 7) {
			dmg += this.mediumAtkDmg;
			System.out.println(this.name + "の" + this.mediumAtkName);
		}else if(randomMove < 8){
			dmg += this.largeAtkDmg;
			System.out.println(this.name + "の" + this.largeAtkName);
		}
		//クリティカル判定
		if (new java.util.Random().nextInt(100) < 2 + this.crit) {
			dmg *= 2;
			System.out.println("クリティカルヒット！");
		}
		//バイキルトの時攻撃2倍、それ以外の時攻撃
		if(randomMove < 8) {
			e.setHp(e.getHp() - dmg);
			System.out.println(e.getName() + "に" + dmg + "のダメージを与えた");
			System.out.println(e.getName() + "の残りHPは" + e.getHp());
		}else if(AtkUpCount == 0){
			this.atkPowerUp();
			this.AtkUpCount = 3;
		}else {
			this.AtkUpCount = 3;
		}


		//バイキルトの効果ターンの判定
		if(this.AtkUpCount > 0) {
			this.AtkUpCount--;
			if(this.AtkUpCount > 0) {
				System.out.println("バイキルトの効果は残り" + AtkUpCount);
			}else {
				System.out.println("バイキルトの効果が消えてしまった");
				this.atk /= 2;
			}
		}



	}
	//実装予定
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
	public void atkPowerUp() {
		System.out.println(this.name + "のバイキルト");
		this.atk *= 2;
		System.out.println(this.name + "のATKは" + this.atk);


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

	public String getSmallAtkName() {
		return smallAtkName;
	}

	public void setSmallAtkName(String smallAtkName) {
		this.smallAtkName = smallAtkName;
	}

	public String getMediumAtkName() {
		return mediumAtkName;
	}

	public void setMediumAtkName(String mediumAtkName) {
		this.mediumAtkName = mediumAtkName;
	}

	public String getLargeAtkName() {
		return largeAtkName;
	}

	public void setLargeAtkName(String largeAtkName) {
		this.largeAtkName = largeAtkName;
	}

	public int getSmallAtkDmg() {
		return smallAtkDmg;
	}

	public void setSmallAtkDmg(int smallAtkDmg) {
		this.smallAtkDmg = smallAtkDmg;
	}

	public int getMediumAtkDmg() {
		return mediumAtkDmg;
	}

	public void setMediumAtkDmg(int mediumAtkDmg) {
		this.mediumAtkDmg = mediumAtkDmg;
	}

	public int getLargeAtkDmg() {
		return largeAtkDmg;
	}

	public void setLargeAtkDmg(int largeAtkDmg) {
		this.largeAtkDmg = largeAtkDmg;
	}

	public int getAtkUpCount() {
		return AtkUpCount;
	}

	public void setAtkUpCount(int atkUpCount) {
		AtkUpCount = atkUpCount;
	}



}
