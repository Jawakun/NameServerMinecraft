
package javakun;

import cpw.mods.fml.common.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = "name", name = "name", version = "1.0")
public class title
{
    public static final String MODID = "name";
    public static final String MODNAME = "name";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void preinit(final FMLPreInitializationEvent event) {
        final String username = Minecraft.getMinecraft().getSession().getUsername();
        Display.setTitle(" (name Servera) " + username);
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void serverLoad(final FMLServerStartingEvent event) {
    }
}
