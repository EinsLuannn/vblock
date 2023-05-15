package de.varilx.vblock.listeners;

import de.varilx.vblock.Main;
import de.varilx.vblock.utils.IslandHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ConnectionListener implements Listener {
    IslandHandler handler = Main.getInstance().getIslandHandler();
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (!handler.hasIsland(p))handler.createIsland(p);
        p.teleport(handler.getIsland(p));

    }

}
