package com.happytarn.PublicEnemy;

import org.bukkit.plugin.java.JavaPlugin;

import com.happytarn.PublicEnemy.command.SeCommand;

public class SeikimatsuEnemy extends JavaPlugin{


	//世紀末エネミープラグイン
	public static SeikimatsuEnemy plugin = null;

	/**
	 * プラグインが有効になったときの処理
	 */
	public void onEnable() {

		//プラグインのインスタンスを初期化
		this.plugin = this;

		//コマンドリスナーを登録
		getServer().getPluginCommand("publicenemy").setExecutor(new SeCommand(plugin));

	}



	/**
	 * プラグインが無効になったときの処理
	 */
	public void onDisable() {
	}




}
