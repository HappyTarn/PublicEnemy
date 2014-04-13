package com.happytarn.PublicEnemy.Soubi;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Easy extends BaseSoubi{

	/**
	 * プレイヤーに装備セットを設定する
	 *
	 * @param player
	 */
	public static void set(Player player) {
		//インベントリをクリア
		player.getInventory().clear();

		//ヘルメット
		player.getInventory().setHelmet(getDiamondHelmet(EASY));
		//鎧
		player.getInventory().setChestplate(getDiamondChestplate(EASY));
		//ズボン
		player.getInventory().setLeggings(getDiamondLeggings(EASY));
		//靴
		player.getInventory().setBoots(getDiamondBoots(EASY));

		//０番目
		player.getInventory().setItem(0, getDiamondSword(EASY));
		//１番目
		player.getInventory().setItem(1, getBow(EASY));
		//２番目
		player.getInventory().setItem(2, new ItemStack(Material.GOLDEN_APPLE, 12, (short)1));
		//３番目
		player.getInventory().setItem(3, new ItemStack(Material.ENDER_PEARL,16));
		//４番目
		player.getInventory().setItem(4, new ItemStack(Material.ENDER_PEARL,16));
		//５番目
		player.getInventory().setItem(5, new ItemStack(Material.ENDER_PEARL,16));

		//９番目
		player.getInventory().setItem(9, getDiamondHelmet(EASY));
		//１０番目
		player.getInventory().setItem(10, getDiamondChestplate(EASY));
		//１１番目
		player.getInventory().setItem(11, getDiamondLeggings(EASY));
		//１２番目
		player.getInventory().setItem(12, getDiamondBoots(EASY));


		//１３番目
		player.getInventory().setItem(13, new ItemStack(Material.ARROW,1));

	}

}
