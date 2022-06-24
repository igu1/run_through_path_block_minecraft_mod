package me.ez.runthroughpathblock;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "runthroughpathblock";


    public Main()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC, "runner-common.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
    }
}
