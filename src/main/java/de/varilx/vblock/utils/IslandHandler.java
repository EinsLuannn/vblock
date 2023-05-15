package de.varilx.vblock.utils;

import com.sk89q.worldedit.bukkit.adapter.BukkitImplLoader;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;

import java.io.File;
import java.util.Random;

public class IslandHandler  {

    public IslandHandler(){

    }

    public boolean hasIsland(Player p){
        return Bukkit.getWorld(p.getUniqueId().toString()) != null;
    }


    public Location getIsland(Player p){
        World world = Bukkit.getWorld(p.getUniqueId().toString());
        return new Location(world, 0, 100,0);
    }


    public void createIsland(Player p){
        WorldCreator creator = new WorldCreator(p.getUniqueId().toString());
        creator.generator(new ChunkGenerator() {
            @Override
            public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
                return createChunkData(world);
            }
        });
        World world = creator.createWorld();

        
    }




}