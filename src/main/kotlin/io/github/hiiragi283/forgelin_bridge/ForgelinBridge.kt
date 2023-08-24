package io.github.hiiragi283.forgelin_bridge

import com.google.common.eventbus.EventBus
import net.minecraftforge.fml.common.DummyModContainer
import net.minecraftforge.fml.common.LoadController
import net.minecraftforge.fml.common.ModMetadata
import net.shadowfacts.forgelin.LOGGER

class ForgelinBridge : DummyModContainer(ModMetadata()) {

    private val metadata = this.getMetadata()

    init {
        metadata.modId = "forgelin"
        metadata.name = "Forgelin Bridge"
        metadata.version = "1.8.4"
        metadata.description = "A Minecraft mod to disguise Forgelin Continuous as Shadowfact's Forgelin."
        metadata.authorList = mutableListOf("Hiiragi283")
    }

    override fun registerBus(bus: EventBus, controller: LoadController): Boolean {
        bus.register(this)
        LOGGER.info("ForgelinBridge registered!")
        return true
    }

}