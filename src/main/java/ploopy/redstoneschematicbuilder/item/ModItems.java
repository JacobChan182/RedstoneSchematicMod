package ploopy.redstoneschematicbuilder.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ploopy.redstoneschematicbuilder.RedstoneSchematicBuilder;

public class ModItems {
    public static final Item INPUT_ITEM = registerItem("input_item", 
        new InputItem(new Item.Settings()));
    public static final Item OUTPUT_ITEM = registerItem("output_item", 
        new OutputItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RedstoneSchematicBuilder.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RedstoneSchematicBuilder.LOGGER.info("Registering Mod Items for " + RedstoneSchematicBuilder.MOD_ID);
    }
}
