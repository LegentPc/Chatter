package at.legentpc.chatter.config

import at.legentpc.chatter.Chatter

object ConfigGuiManager {

    fun openGui() {
        Chatter.configManager.managedConfig.openConfigGui()
    }
}
