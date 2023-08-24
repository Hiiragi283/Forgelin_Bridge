package net.shadowfacts.forgelin

import io.github.hiiragi283.forgelin_bridge.FBRefenrece
import net.minecraftforge.fml.common.FMLModContainer
import net.minecraftforge.fml.common.ILanguageAdapter
import net.minecraftforge.fml.common.ModContainer
import net.minecraftforge.fml.relauncher.Side
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.lang.reflect.Field
import java.lang.reflect.Method

internal val LOGGER: Logger = LogManager.getLogger(FBRefenrece.MOD_NAME)

class KotlinAdapter : ILanguageAdapter {

    init {
        LOGGER.info("Forgelin Bridge activated!!")
    }

    override fun getNewInstance(
        container: FMLModContainer,
        objectClass: Class<*>,
        classLoader: ClassLoader,
        factoryMarkedAnnotation: Method?
    ): Any = objectClass.kotlin.objectInstance ?: objectClass.getDeclaredConstructor().newInstance()

    override fun supportsStatics(): Boolean = false

    override fun setProxy(target: Field, proxyTarget: Class<*>, proxy: Any) {
        target.set(proxyTarget.kotlin.objectInstance, proxy)
    }

    override fun setInternalProxies(mod: ModContainer?, side: Side?, loader: ClassLoader?) {

    }

}