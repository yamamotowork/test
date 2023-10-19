package battle;

import enemy.Enemy;
import player.Player;

public class Battle {

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
				//逃げる等の条件でバトル終了
			}
			if(p.getHp() <= 0) {
				System.out.println(p.getName() + "は倒れてしまった");
				break;
			}
		}
	}

}
