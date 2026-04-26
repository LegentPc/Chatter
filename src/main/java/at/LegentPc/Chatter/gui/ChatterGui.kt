package com.chatter.gui

import dev.isxander.yacl3.api.ConfigCategory
import dev.isxander.yacl3.api.Option
import dev.isxander.yacl3.api.OptionDescription
import dev.isxander.yacl3.api.YetAnotherConfigLib
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder
import net.minecraft.client.gui.screen.Screen
import net.minecraft.text.Text

object ChatterGui {

    fun createScreen(parent: Screen?): Screen {
        return YetAnotherConfigLib.createBuilder()
            .title(Text.literal("Chatter"))
            .category(createGeneralCategory())
            .category(createHypixelCategory())
            .build()
            .generateScreen(parent)
    }

    private fun createGeneralCategory(): ConfigCategory {
        return ConfigCategory.createBuilder()
            .name(Text.literal("General"))
            .tooltip(Text.literal("Basic settings for the Chatter mod"))
            .option(createEnableOption())
            .build()
    }

    private fun createHypixelCategory(): ConfigCategory {
        return ConfigCategory.createBuilder()
            .name(Text.literal("Hypixel Skyblock"))
            .tooltip(Text.literal("Settings specific to Hypixel Skyblock features"))
            .build()
    }

    private fun createEnableOption(): Option<Boolean> {
        return Option.createBuilder<Boolean>()
            .name(Text.literal("Enable Chatter"))
            .description(OptionDescription.of(Text.literal("Turn all mod features on or off.")))
            .binding(
                ChatterConfig.enableDefault,
                { ChatterConfig.enable },
                { value -> ChatterConfig.enable = value }
            )
            .controller { opt -> TickBoxControllerBuilder.create(opt) }
            .build()
    }
}
