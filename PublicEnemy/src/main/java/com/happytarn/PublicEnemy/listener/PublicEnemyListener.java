package com.happytarn.PublicEnemy.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.happytarn.PublicEnemy.PublicEnemy;

public class PublicEnemyListener implements Listener {

	// プラグイン
	private PublicEnemy plugin;

	/**
	 * コンストラクタ
	 *
	 * @param plguin
	 */
	public PublicEnemyListener(PublicEnemy plugin) {
		this.plugin = plugin;
	}

	/**
	 * プレイヤーが死亡したときのイベント
	 *
	 * @param event
	 */
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {

		Player player = event.getEntity().getPlayer();
		Player killer = event.getEntity().getKiller();

		// プレイヤー以外に殺された場合はなにもなし
		if (!(killer instanceof Player))
			return;

		// 死んだ人がエネミーだった場合
		if (plugin.enemyMap.containsKey(player.getName())) {
			event.getDrops().clear();
			String difficult = plugin.enemyMap.get(player.getName());
			plugin.enemyMap.remove(player.getName());
			// 難易度が取得できない場合はなにもなし
			if (difficult == null)
				return;

			// エネミー討伐メッセージ
			sendMessage(new StringBuffer().append(ChatColor.GOLD)
					.append(difficult + "レベル").append(ChatColor.GREEN)
					.append("のエネミーが討伐されました。").toString());

			if (difficult.equals("EASY")) {
				// EASYレベルの討伐
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "money give " + killer.getName() + " 50000");
			} else if (difficult.equals("NORMAL")) {
				//NORMALレベルの討伐

			} else if (difficult.equals("HARD")) {
				//HARDレベルの討伐

			} else if (difficult.equals("GOD")) {
				//GODレベルの討伐

			}

		}

	}

	public void sendMessage(String message) {
		plugin.getServer().broadcastMessage(message);
	}

}
