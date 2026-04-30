package at.LegentPc.Chatter

import at.LegentPc.Chatter.config.ChatterConfigManager
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Chatter : ModInitializer {

    const val MOD_ID = "chatter"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    lateinit var configManager: ChatterConfigManager

    override fun onInitialize() {
        configManager = ChatterConfigManager()
        logger.info("Chatter initialized")
    }
}
