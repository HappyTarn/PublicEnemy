package com.happytarn.PublicEnemy.Soubi;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class BaseSoubi {

	protected static final int EASY = 1;


	public static ItemStack getDiamondHelmet(int i){

		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);

		switch (i) {
		case EASY:
			//耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			//ダメージ軽減５
			item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			break;
		default:
			break;
		}

		return item;
	}
}
