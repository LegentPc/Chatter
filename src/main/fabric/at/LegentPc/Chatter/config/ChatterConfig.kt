package at.LegentPc.Chatter.config

import io.github.notenoughupdates.moulconfig.annotations.Category
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption

class ChatterConfig {

    @Category(name = "General", desc = "General Settings")
    var general: GeneralConfig = GeneralConfig()

    class GeneralConfig {

        @ConfigOption(name = "Enable Chatter", desc = "Enable all Chatter mod features")
        @ConfigEditorBoolean
        var enabled: Boolean = true
    }
}
