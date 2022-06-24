package me.ez.runthroughpathblock;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Float> SPEED;

    static {
        BUILDER.push("Config For Runner");
        SPEED = BUILDER.comment("Speed (Default Value 0.13): ").define("speed", 0.13F);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
