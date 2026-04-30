package at.LegentPc.Chatter.config

import com.google.gson.GsonBuilder
import io.github.notenoughupdates.moulconfig.processor.MoulConfigProcessor
import net.fabricmc.loader.api.FabricLoader
import java.io.File

class ChatterConfigManager {

    private val gson = GsonBuilder().setPrettyPrinting().create()

    private val configFile: File = FabricLoader.getInstance()
        .configDir
        .resolve("chatter.json")
        .toFile()

    val config: ChatterConfig = loadConfig()
    val processor: MoulConfigProcessor<ChatterConfig> = MoulConfigProcessor(config)

    private fun loadConfig(): ChatterConfig {
        if (!configFile.exists()) return ChatterConfig()
        return try {
            gson.fromJson(configFile.readText(), ChatterConfig::class.java) ?: ChatterConfig()
        } catch (e: Exception) {
            ChatterConfig()
        }
    }

    fun saveConfig() {
        configFile.parentFile?.mkdirs()
        configFile.writeText(gson.toJson(config))
    }
}
