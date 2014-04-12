package com.happytarn.SeikimatsuEnemy.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

import com.happytarn.SeikimatsuEnemy.SeikimatsuEnemy;
import com.happytarn.SeikimatsuEnemy.Soubi.Easy;
import com.happytarn.SeikimatsuEnemy.Soubi.God;
import com.happytarn.SeikimatsuEnemy.Soubi.Hard;
import com.happytarn.SeikimatsuEnemy.Soubi.Normal;

public class SeCommand implements CommandExecutor {

	//エネミーコマンド権限
	private static final Permission ENEMY_EASY = new Permission("hapitanCmd.enemy.easy");
	private static final Permission ENEMY_NORMAL = new Permission("hapitanCmd.enemy.normal");
	private static final Permission ENEMY_HARD = new Permission("hapitanCmd.enemy.hard");
	private static final Permission ENEMY_GOD = new Permission("hapitanCmd.enemy.god");

	//世紀末エネミープラグイン
	private SeikimatsuEnemy plugin;

	/**
	 * コンストラクタ
	 * @param plugin
	 */
	public SeCommand (SeikimatsuEnemy plugin){
		this.plugin = plugin;
	}

	/**
	 * プレイヤーがコマンドを発行したときの処理
	 */
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {

		Player player = (Player) sender;
		int X = player.getLocation().getBlockX();
		int Y = player.getLocation().getBlockY();;
		int Z = player.getLocation().getBlockZ();;



		if(args.length > 1){

			//EASYレベル
			if(args[0].equalsIgnoreCase("easy") && player.hasPermission(ENEMY_EASY)){
				//Easy用の装備セットをセットする。
				Easy.set(player);
				//エネミー出現メッセージ
				sendMessage(new StringBuffer().append(ChatColor.GOLD).append("EASYレベル").append(ChatColor.GREEN).append("のエネミーが出現しました。")
						.append(ChatColor.AQUA).append("座標⇒X："+ X + "Y：" + Y + "Z：" + Z).toString());

				return true;
			}

			//NORMALレベル
			if(args[0].equalsIgnoreCase("easy") && player.hasPermission(ENEMY_NORMAL)){
				//NORMAL用の装備セットをセットする。
				Normal.set(player);
				//エネミー出現メッセージ
				sendMessage(new StringBuffer().append(ChatColor.GOLD).append("EASYレベル").append(ChatColor.GREEN).append("のエネミーが出現しました。")
						.append(ChatColor.AQUA).append("座標⇒X："+ X + "Y：" + Y + "Z：" + Z).toString());

				return true;
			}

			//HARDレベル
			if(args[0].equalsIgnoreCase("easy") && player.hasPermission(ENEMY_HARD)){
				//HARD用の装備をセットする。
				Hard.set(player);
				//エネミー出現メッセージ
				sendMessage(new StringBuffer().append(ChatColor.GOLD).append("EASYレベル").append(ChatColor.GREEN).append("のエネミーが出現しました。")
						.append(ChatColor.AQUA).append("座標⇒X："+ X + "Y：" + Y + "Z：" + Z).toString());

				return true;
			}

			//GODレベル
			if(args[0].equalsIgnoreCase("easy") && player.hasPermission(ENEMY_GOD)){
				//GOD用の装備をセットする。
				God.set(player);
				//エネミー出現メッセージ
				sendMessage(new StringBuffer().append(ChatColor.GOLD).append("EASYレベル").append(ChatColor.GREEN).append("のエネミーが出現しました。")
						.append(ChatColor.AQUA).append("座標⇒X："+ X + "Y：" + Y + "Z：" + Z).toString());

				return true;
			}
		}

		return true;
	}


	public void sendMessage(String message){
		plugin.getServer().broadcastMessage(message);
	}



}
