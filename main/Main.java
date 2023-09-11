package main;

import battle.Battle;
import enemy.Enemy;
import enemy.EvilKing;
import enemy.Goblin;
import enemy.Matango;
import enemy.Metal;
import player.Hero;
import player.LegendaryHero;
import player.Player;


public class Main {

	public static void main(String[] args) {
		Player hero = new Hero();
		Enemy matango = new Matango();
		Enemy goblin = new Goblin();
		Player legendHero = new LegendaryHero();
		Enemy evilKing = new EvilKing();
		Enemy metal = new Metal();



		Battle.battle(hero,goblin);
//		System.out.println("現在の味方のステータスはhp" + legendHero.getHp() + "/mp" +
//				legendHero.getMp() + "/atk" + legendHero.getAtk() + "/def" + legendHero.getDef() + "です"	);

//		System.out.println("現在の敵のステータスはhp" + evilKing.getHp() + "/mp" +
//				evilKing.getMp() + "/atk" + evilKing.getAtk() + "/def" + evilKing.getDef() + "です"	);

		//hero.attack(matango);
		//matango.Heal();
		//System.out.println(matango.getHp());


	}

}
