package battle;

import enemy.Enemy;
import player.Player;

public class Battle {

	//github確認テスト

	public static void battle(Player p,Enemy e) {
		while(p.getHp() > 0 && e.getHp() > 0) {
			p.attack(e);

			if(e.getHp() <= 1) {
				System.out.println(p.getName() + "は" + e.getName() + "を倒した");
				break;
			}
			e.attack(p);
			if(!e.trueBattle() ) {
				break;
			}
			if(p.getHp() <= 0) {
				System.out.println(p.getName() + "は倒れてしまった");
				break;
			}
		}
	}


errorも吐かせる

}

//追加のテスト

