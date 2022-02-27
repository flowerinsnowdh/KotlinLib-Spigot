package online.flowerinsnow.minecraft.spigot.kotlinlib

import org.bukkit.plugin.java.JavaPlugin

class KotlinLib : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled.")
    }

    override fun onDisable() {
        logger.info("Disabled.")
    }
}