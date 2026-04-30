package at.LegentPc.Chatter.config

import at.LegentPc.Chatter.Chatter
import io.github.notenoughupdates.moulconfig.gui.MoulConfigEditor
import net.minecraft.client.MinecraftClient

object ConfigGuiManager {

    private var editor: MoulConfigEditor<ChatterConfig>? = null

    private fun getOrCreateEditor(): MoulConfigEditor<ChatterConfig> {
        return editor ?: MoulConfigEditor(Chatter.configManager.processor).also { editor = it }
    }

    fun openGui() {
        MinecraftClient.getInstance().setScreen(getOrCreateEditor())
    }
}
