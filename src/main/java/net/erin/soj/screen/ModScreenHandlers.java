package net.erin.soj.screen;

import net.erin.soj.SpiritsOfJapan;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<ShojiWorkbenchScreenHandler> SHOJI_WORKBENCH_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SpiritsOfJapan.MOD_ID, "shoji_workbench_screen_handler"),
                    new ExtendedScreenHandlerType<>(ShojiWorkbenchScreenHandler::new));
    public static final ScreenHandlerType<GemEmpoweringScreenHandler> GEM_EMPOWERING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SpiritsOfJapan.MOD_ID, "gem_empowering_screen_handler"),
                    new ExtendedScreenHandlerType<>(GemEmpoweringScreenHandler::new));
//    public static final ScreenHandlerType<TestBlockScreenHandler> TEST_BLOCK_SCREEN_HANDLER =
//            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SpiritsOfJapan.MOD_ID, "test_block_screen_handler"),
//                    new ExtendedScreenHandlerType<>(TestBlockScreenHandler::new));

    public static void registerScreenHandler() {
        SpiritsOfJapan.LOGGER.info("Registering Screen Handlers for " + SpiritsOfJapan.MOD_ID);
    }
}
