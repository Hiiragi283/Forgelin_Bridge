package io.github.hiiragi283.forgelin_bridge

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin

@IFMLLoadingPlugin.Name("Forgelin Bridge")
class ForgelinBridgePlugin : IFMLLoadingPlugin {

    override fun getASMTransformerClass(): Array<String> = arrayOf()

    override fun getModContainerClass(): String = ForgelinBridge::class.java.name

    override fun getSetupClass(): String = ForgelinSetup::class.java.name

    override fun injectData(data: MutableMap<String, Any>) {

    }

    override fun getAccessTransformerClass(): String? = null

}