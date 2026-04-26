package com.chatter

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Chatter : ModInitializer {
    
    private val logger = LoggerFactory.getLogger("chatter")

    override fun onInitialize() {
        logger.info("Chatter Mod Initialized")
    }
}
