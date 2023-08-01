package fr.sandro642.github.misc;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class MapGenerator {

    // Méthode pour générer le plafond
    public static void generateCeiling(World world, int chunkX, int chunkZ) {
        int startX = chunkX * 16;
        int startZ = chunkZ * 16;

        for (int x = startX; x < startX + 16; x++) {
            for (int z = startZ; z < startZ + 16; z++) {
                Block block = world.getBlockAt(x, 100, z); // Y = 100 pour le plafond uniforme

                if (x % 7 == 0 && z % 7 == 0) {
                    block.setType(Material.GLOWSTONE); // Lumières tous les 7 blocs
                } else {
                    block.setType(Material.YELLOW_WOOL); // Bloc de plafond en laine jaune
                }
            }
        }
    }

    // Méthode pour générer le sol
    public static void generateFloor(World world, int chunkX, int chunkZ) {
        int startX = chunkX * 16;
        int startZ = chunkZ * 16;

        for (int x = startX; x < startX + 16; x++) {
            for (int z = startZ; z < startZ + 16; z++) {
                Block block = world.getBlockAt(x, 0, z); // Y = 0 pour le sol uniforme

                if (x % 7 == 0 && z % 7 == 0) {
                    // Ne rien faire pour les lumières sur le sol
                } else {
                    // Bloc de sol en laine jaune
                    block.setType(Material.YELLOW_WOOL);
                }
            }
        }
    }

    // Méthode pour générer les murs
    public static void generateWalls(World world, int chunkX, int chunkZ) {
        int startX = chunkX * 16;
        int startZ = chunkZ * 16;

        for (int x = startX; x < startX + 16; x++) {
            for (int z = startZ; z < startZ + 16; z++) {
                Block block = world.getBlockAt(x, 1, z); // Y = 1 pour les murs

                if (x % 7 == 0 && z % 7 == 0) {
                    // Ne rien faire pour les lumières sur les murs
                } else {
                    // Placer aléatoirement des blocs pour les murs (par exemple, ici en utilisant de la leine jaune)
                    block.setType(Material.YELLOW_WOOL);
                }
            }
        }
    }
}

