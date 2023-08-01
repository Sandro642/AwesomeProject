package fr.sandro642.github;

import fr.sandro642.github.misc.MapGenerator;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getWorld;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled");
        generateMapChunk("world", 0, 0);
    }

    // Méthode pour générer la map
    public void generateMapChunk(String name, int chunkX, int chunkZ) {
        // Appel des méthodes pour générer le plafond, le sol et les murs
        MapGenerator.generateCeiling(getWorld(name), chunkX, chunkZ);
        MapGenerator.generateFloor(getWorld(name), chunkX, chunkZ);
        MapGenerator.generateWalls(getWorld(name), chunkX, chunkZ);
    }

}
