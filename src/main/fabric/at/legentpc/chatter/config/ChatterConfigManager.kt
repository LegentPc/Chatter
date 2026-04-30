package at.legentpc.chatter.config

import at.LegentPc.Chatter.config.ChatterConfig
import io.github.notenoughupdates.moulconfig.managed.ManagedConfig
import net.fabricmc.loader.api.FabricLoader
import java.io.File

class ChatterConfigManager {

    val managedConfig: ManagedConfig<ChatterConfig> = ManagedConfig.create(
        File(FabricLoader.getInstance().configDir.toFile(), "chatter/chatter.json"),
        ChatterConfig::class.java
    )

    val config: ChatterConfig get() = managedConfig.instance

    fun saveConfig() {
        managedConfig.saveToFile()
    }
}
