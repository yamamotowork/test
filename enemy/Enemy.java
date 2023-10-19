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
	private int smallAtkDmg;
	private int mediumAtkDmg;
	private int largeAtkDmg;
	int resetAtk;

	//private int speed;


	public void attack(Player p) {
		System.out.println(this.name + "の攻撃！");
		//技の命中率
		int randomAttack = new java.util.Random().nextInt(10);
		//技の威力小、中、大、ヒール等
		int randomMove = new java.util.Random().nextInt(9);
		int dmg = this.atk - p.getDef();
		//強さのランクに応じて行動分岐
		switch (enemyStrength) {
		//メタル系
		case "rare":
			//基本逃げる、攻撃はデフォルトのみ
			if (randomAttack < 5) {
			    //技のクリティカル判定
				if (new java.util.Random().nextInt(100) < 2 + this.crit) {
					dmg *= 2;
					System.out.println("クリティカルヒット！");
				}
				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else if(randomAttack < 8){
				System.out.println("しかし、攻撃が外れた！");
			}
			//一定の確率で逃げる
			if (new java.util.Random().nextInt(100) < 30) {
				this.run();
				break;
			}
		//スライム系等
		case "weak":
			if (randomAttack < 5) {
				//技は中威力まで
				if (randomMove < 3) {
					System.out.println(this.name + "の" + this.smallAtkName);
					dmg += this.smallAtkDmg;
				}else if(randomMove < 5) {
					dmg += this.mediumAtkDmg;
					System.out.println(this.name + "の" + this.mediumAtkName);
				}
				if (new java.util.Random().nextInt(100) < 2 + this.crit) {
					dmg *= 2;
					System.out.println("クリティカルヒット！");
				}
				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else if(randomAttack < 8){
				System.out.println("しかし、攻撃が外れた！");
			}

			if (new java.util.Random().nextInt(100) < 10) {
				this.run();
				break;
			}
		//中盤くらいから出てくるやつら
		case "normal":
			//威力小、中、大、全てある
			if (randomAttack < 8) {

				if (randomMove < 5) {
					System.out.println(this.name + "の" + this.smallAtkName);
					dmg += this.smallAtkDmg;
				}else if(randomMove < 7) {
					dmg += this.mediumAtkDmg;
					System.out.println(this.name + "の" + this.mediumAtkName);
				}else if(randomMove < 8){
					dmg += this.largeAtkDmg;
					System.out.println(this.name + "の" + this.largeAtkName);
				}
				if (new java.util.Random().nextInt(100) < 2 + this.crit) {
					dmg *= 2;
					System.out.println("クリティカルヒット！");
				}

				p.setHp(p.getHp() - dmg);
				System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");
				break;
			} else {
				System.out.println("しかし、攻撃が外れた！");
				break;
			}
		//ボス
		case "Strong":
			//hp3割以下で狂乱状態 攻撃上昇、防御0
			if (this.hp < Max_HP / 3 && this.resetAtk == 0) {
				System.out.println(this.name + "は怒り出した");
				this.atk *= 2;
				this.def = 0;
				//攻撃が永遠に上がるの防止
				this.resetAtk = 1;
			}
			if (randomMove < 3) {
				System.out.println(this.name + "の" + this.smallAtkName);
				dmg += this.smallAtkDmg;
			}else if(randomMove < 6) {
				dmg += this.mediumAtkDmg;
				System.out.println(this.name + "の" + this.mediumAtkName);
			}else if(randomMove < 8){
				dmg += this.largeAtkDmg;
				System.out.println(this.name + "の" + this.largeAtkName);
			}
			if (new java.util.Random().nextInt(100) < 2 + this.crit) {
				dmg *= 2;
				System.out.println("クリティカルヒット！");
			}
			p.setHp(p.getHp() - dmg);
			System.out.println(p.getName() + "に" + dmg + "のダメージを与えた");

			break;
		}
		//1/9で全員ヒールを使う
		if(randomMove == 8) {
			Heal();
			//ボスだけ2回使う
			if(enemyStrength.equals("Strong")){
				Heal();
			}
		}else {
			System.out.println(p.getName() + "の残りHPは" + p.getHp());
		}

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
}
