package enemy;

import player.Player;

public abstract class Enemy {
	private int hp;
	private int mp;
	private int Max_HP;
	private int atk;
	private int def;
	private int crit;
	private String name;
	private String enemyStrength;
	private boolean trueBattle = true;
	private boolean falseRun = false;
	private String smallAtkName;
	private String mediumAtkName;
	private String largeAtkName;
	private int smallAtk;
	private int mediumAtk;
	private int largeAtk;

	//private int speed;
	//弱、中、強ランクの技を用意するかメソッドで乱数で威力設定
	//とりあえず技の威力係数は1倍、２倍、３倍 細かい威力は今後
	//ゴブリンに技の名前と威力の設定


	public void attack(Player p) {
		System.out.println(this.name + "の攻撃！");
		int randomAttack = new java.util.Random().nextInt(10);
		int randomMove = new java.util.Random().nextInt(9);
		switch (enemyStrength) {
		case "rare":
			if (randomAttack < 5) {
				int dmg = this.atk - p.getDef();
				if (new java.util.Random().nextInt(100) < 2 + this.crit) {
					dmg *= 2;
					System.out.println("クリティカルヒット！");
				}
				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else {
				System.out.println("しかし、攻撃が外れた！");

			}
			if (new java.util.Random().nextInt(100) < 100) {
				this.run();
				break;
			}
		case "weak":
			if (randomAttack < 5) {
				int dmg = this.atk - p.getDef();
				if (new java.util.Random().nextInt(100) < 2 + this.crit) {
					dmg *= 2;
					System.out.println("クリティカルヒット！");
				}
				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else {
				System.out.println("しかし、攻撃が外れた！");

			}
			if (new java.util.Random().nextInt(100) < 10) {
				this.run();
				break;
			}

		case "normal":
			//計算式とダメージのタイミングを変えれば解決
			//そうすればatkの倍率変えた後にダメージ計算が行える
			//最後に倍率を戻さないと永遠に上がり続ける
			//最後にダメージと倍率戻しをやる
			//this.MaxAtkとかでAtkに数値を代入して戻す

			//そもそも技に威力を設定してダメージに足せばいい
			if (randomAttack < 8) {

				int dmg = this.atk - p.getDef();
				if(randomMove < 10) {
					System.out.println(this.name + "の" + this.smallAtkName);
					dmg += this.smallAtk;
					if (new java.util.Random().nextInt(100) < 2 + this.crit) {
						dmg *= 2;
						System.out.println("クリティカルヒット！");


					}
				}
				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else {
				System.out.println("しかし、攻撃が外れた！");
				break;
			}

		case "Strong":
			if (this.hp < Max_HP / 3) {
				System.out.println(this.name + "は怒り出した");
				this.atk *= 2;
				this.def = 0;
			}
			int dmg = this.atk - p.getDef();

			if (new java.util.Random().nextInt(100) < 2 + this.crit) {
				dmg *= 2;
				System.out.println("クリティカルヒット！");
			}
			p.setHp(p.getHp() - dmg);
			System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
			break;
		}

		System.out.println(p.getName() + "の残りHPは" + p.getHp());

	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
		//trueBattle = false;
		falseRun();

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

	public boolean trueBattle() {
		return trueBattle;
	}

	public boolean falseRun() {
		return false;
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

	public String getEnemyStrength() {
		return enemyStrength;
	}

	public void setEnemyStrength(String enemyStrength) {
		this.enemyStrength = enemyStrength;
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

	public boolean isFalseRun() {
		return falseRun;
	}

	public void setFalseRun(boolean falseRun) {
		this.falseRun = falseRun;
	}

	public boolean isTrueBattle() {
		return trueBattle;
	}

	public void setTrueBattle(boolean trueBattle) {
		this.trueBattle = trueBattle;
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

	public void setSmallAtk(int smallAtk) {
		this.smallAtk = smallAtk;
	}

	public void setMediumAtk(int mediumAtk) {
		this.mediumAtk = mediumAtk;
	}

	public void setLargeAtk(int largeAtk) {
		this.largeAtk = largeAtk;
	}
}
