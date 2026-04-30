package at.LegentPc.Chatter

import at.LegentPc.Chatter.config.ConfigGuiManager
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents

object ChatterModLoader : ClientModInitializer {

    override fun onInitializeClient() {
        registerCommands()
        registerShutdownHook()
    }

    private fun registerCommands() {
        ClientCommandRegistrationCallback.EVENT.register { dispatcher, _ ->
            dispatcher.register(
                LiteralArgumentBuilder.literal<FabricClientCommandSource>("Chatter")
                    .executes {
                        ConfigGuiManager.openGui()
                        1
                    }
            )
        }
    }

    private fun registerShutdownHook() {
        ClientLifecycleEvents.CLIENT_STOPPING.register {
            Chatter.configManager.saveConfig()
        }
    }
}
