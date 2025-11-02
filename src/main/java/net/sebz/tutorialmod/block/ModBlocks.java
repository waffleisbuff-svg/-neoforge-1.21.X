package net.sebz.tutorialmod.block;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sebz.tutorialmod.TutorialMod;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MOD_ID);


    public static  void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
