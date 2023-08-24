package io.github.hiiragi283.forgelin_bridge

import net.minecraftforge.fml.relauncher.IFMLCallHook
import net.shadowfacts.forgelin.LOGGER

class ForgelinSetup : IFMLCallHook {

    init {
        LOGGER.info("ForgelinSetup accessed!")
    }

    override fun injectData(data: Map<String, Any>) {
        val loader: ClassLoader = data["classLoader"] as ClassLoader
        try {
            loader.loadClass("net.shadowfacts.forgelin.KotlinAdapter")
        } catch (e: ClassNotFoundException) {
            throw RuntimeException("Couldn't find Forgelin langague adapter, this shouldn't be happening", e)
        }
    }

    @Throws(Exception::class)
    override fun call(): Void? = null

}