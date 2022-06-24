package me.ez.runthroughpathblock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class Event {
    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void onRunningEvent(LivingEvent.LivingUpdateEvent e) {
        if (e.getEntity() instanceof Player player) {
            BlockPos pos = e.getEntity().getOnPos();
            if (player.level.getBlockState(pos) == Blocks.DIRT_PATH.defaultBlockState()) {
                if (player.isSprinting()) {
                    player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(Config.SPEED.get());
                }
            }else {
                player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1f);
            }

        }
    }
}
