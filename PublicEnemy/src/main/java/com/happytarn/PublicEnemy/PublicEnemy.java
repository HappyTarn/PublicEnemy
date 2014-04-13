package com.happytarn.PublicEnemy;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import com.happytarn.PublicEnemy.command.SeCommand;

public class PublicEnemy extends JavaPlugin{


	//世紀末エネミープラグイン
	public static PublicEnemy plugin = null;


	public HashMap<String, String> enemyMap = new HashMap<String, String>();

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
