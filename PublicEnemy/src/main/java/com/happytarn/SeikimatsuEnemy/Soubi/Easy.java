package com.happytarn.SeikimatsuEnemy.Soubi;

import org.bukkit.entity.Player;

public class Easy extends BaseSoubi{

	/**
	 * プレイヤーに装備セットを設定する
	 *
	 * @param player
	 */
	public static void set(Player player) {
		player.getInventory().addItem(getDiamondHelmet(EASY));

	}

}
