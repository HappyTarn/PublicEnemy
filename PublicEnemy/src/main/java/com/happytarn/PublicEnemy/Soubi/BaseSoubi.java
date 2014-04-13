package com.happytarn.PublicEnemy.Soubi;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class BaseSoubi {

	protected static final int EASY = 1;

	/**
	 * ダイアモンドヘルメット
	 *
	 * @param i
	 * @return
	 */
	public static ItemStack getDiamondHelmet(int i) {

		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);

		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ軽減５
			item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			break;
		default:
			break;
		}

		return item;
	}

	/**
	 * ダイアモンドチェスト
	 *
	 * @param i
	 * @return
	 */
	public static ItemStack getDiamondChestplate(int i) {

		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ軽減５
			item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			break;
		default:
			break;
		}

		return item;
	}

	/**
	 * ダイアモンドレギンス
	 *
	 * @param i
	 * @return
	 */
	public static ItemStack getDiamondLeggings(int i) {

		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ軽減５
			item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			break;
		default:
			break;
		}

		return item;
	}

	/**
	 * ダイアモンドブーツ
	 *
	 * @param i
	 * @return
	 */
	public static ItemStack getDiamondBoots(int i) {

		ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ軽減５
			item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			break;
		default:
			break;
		}

		return item;
	}

	/**
	 * ダイアモンドソード
	 *
	 * @param i
	 * @return
	 */
	public static ItemStack getDiamondSword(int i) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ増加５
			item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
			// 火属性
			item.addEnchantment(Enchantment.FIRE_ASPECT, 2);

			break;
		default:
			break;
		}

		return item;
	}

	/**
	 * 弓
	 * @param i
	 * @return
	 */
	public static ItemStack getBow(int i) {
		ItemStack item = new ItemStack(Material.BOW);
		switch (i) {
		case EASY:
			// 耐久３
			item.addEnchantment(Enchantment.DURABILITY, 3);
			// ダメージ増加５
			item.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
			// 火属性
			item.addEnchantment(Enchantment.ARROW_FIRE, 1);
			// パンチ
			item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
			// 無限
			item.addEnchantment(Enchantment.ARROW_INFINITE, 1);

			break;
		default:
			break;
		}

		return item;
	}
}
