package de.varilx.vblock;

import de.varilx.vblock.listeners.ConnectionListener;
import de.varilx.vblock.utils.IslandHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    private IslandHandler islandHandler;

    @Override
    public void onEnable() {


        init();
        registerCommands();
        registerEvents();
    }

    private void registerCommands(){

    }

    private void registerEvents(){
        PluginManager pl = Bukkit.getPluginManager();
        pl.registerEvents(new ConnectionListener(), this);
    }

    private void init(){
        instance = this;
        islandHandler = new IslandHandler();
    }

    @Override
    public void onDisable() {

    }

    public IslandHandler getIslandHandler(){
        return islandHandler;
    }

    public static Main getInstance() {
        return instance;
    }
}
