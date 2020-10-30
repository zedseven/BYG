package corgiaoc.byg.common.properties.vanilla;

import corgiaoc.byg.BYG;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;

public class BYGFlammables {
    public static void flammableBlock(Block block, int encouragement, int flammability) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.registerFlammableBlock(block, encouragement, flammability);
    }

    public static void flammablesBYG() {
        BYG.LOGGER.debug("BYG: Adding Flammables...");
        //Logs
        flammableBlock(BYGBlocks.ASPEN_LOG, 5, 5);
        flammableBlock(BYGBlocks.BAOBAB_LOG, 5, 5);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_LOG, 5, 5);
        flammableBlock(BYGBlocks.CHERRY_LOG, 5, 5);
        flammableBlock(BYGBlocks.CIKA_LOG, 5, 5);
        flammableBlock(BYGBlocks.EBONY_LOG, 5, 5);
        flammableBlock(BYGBlocks.FIR_LOG, 5, 5);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_LOG, 5, 5);
        flammableBlock(BYGBlocks.HOLLY_LOG, 5, 5);
        flammableBlock(BYGBlocks.JACARANDA_LOG, 5, 5);
        flammableBlock(BYGBlocks.MAHOGANY_LOG, 5, 5);
        flammableBlock(BYGBlocks.MANGROVE_LOG, 5, 5);
        flammableBlock(BYGBlocks.MAPLE_LOG, 5, 5);
        flammableBlock(BYGBlocks.PALO_VERDE_LOG, 5, 5);
        flammableBlock(BYGBlocks.PINE_LOG, 5, 5);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LOG, 5, 5);
        flammableBlock(BYGBlocks.REDWOOD_LOG, 5, 5);
        flammableBlock(BYGBlocks.WILLOW_LOG, 5, 5);
        flammableBlock(BYGBlocks.WITCH_HAZEL_LOG, 5, 5);
        flammableBlock(BYGBlocks.ZELKOVA_LOG, 5, 5);
        flammableBlock(BYGBlocks.PALM_LOG, 5, 5);

        //Stripped Logs
        flammableBlock(BYGBlocks.STRIPPED_ASPEN_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_BAOBAB_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_CHERRY_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_CIKA_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_CYPRESS_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_EBONY_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_FIR_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_HOLLY_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_JACARANDA_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_MAHOGANY_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_MANGROVE_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_PALO_VERDE_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_SKYRIS_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_WILLOW_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_WITCH_HAZEL_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_ZELKOVA_LOG, 5, 5);
        flammableBlock(BYGBlocks.STRIPPED_PALM_LOG, 5, 5);

        //BookShelves
        flammableBlock(BYGBlocks.ASPEN_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.BAOBAB_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.CHERRY_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.CIKA_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.CYPRESS_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.EBONY_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.FIR_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.HOLLY_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.JACARANDA_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.MAHOGANY_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.MANGROVE_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.MAPLE_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.PINE_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.REDWOOD_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.SKYRIS_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.WILLOW_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.WITCH_HAZEL_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_BOOKSHELF, 5, 20);
        flammableBlock(BYGBlocks.PALM_BOOKSHELF, 5, 20);

        //Slabs
        flammableBlock(BYGBlocks.ASPEN_SLAB, 5, 20);
        flammableBlock(BYGBlocks.BAOBAB_SLAB, 5, 20);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_SLAB, 5, 20);
        flammableBlock(BYGBlocks.CHERRY_SLAB, 5, 20);
        flammableBlock(BYGBlocks.CIKA_SLAB, 5, 20);
        flammableBlock(BYGBlocks.CYPRESS_SLAB, 5, 20);
        flammableBlock(BYGBlocks.EBONY_SLAB, 5, 20);
        flammableBlock(BYGBlocks.FIR_SLAB, 5, 20);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_SLAB, 5, 20);
        flammableBlock(BYGBlocks.HOLLY_SLAB, 5, 20);
        flammableBlock(BYGBlocks.JACARANDA_SLAB, 5, 20);
        flammableBlock(BYGBlocks.MAHOGANY_SLAB, 5, 20);
        flammableBlock(BYGBlocks.MANGROVE_SLAB, 5, 20);
        flammableBlock(BYGBlocks.MAPLE_SLAB, 5, 20);
        flammableBlock(BYGBlocks.PINE_SLAB, 5, 20);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_SLAB, 5, 20);
        flammableBlock(BYGBlocks.REDWOOD_SLAB, 5, 20);
        flammableBlock(BYGBlocks.SKYRIS_SLAB, 5, 20);
        flammableBlock(BYGBlocks.WILLOW_SLAB, 5, 20);
        flammableBlock(BYGBlocks.WITCH_HAZEL_SLAB, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_SLAB, 5, 20);
        flammableBlock(BYGBlocks.PALM_SLAB, 5, 20);

        //Stairs
        flammableBlock(BYGBlocks.ASPEN_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.BAOBAB_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.CHERRY_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.CIKA_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.CYPRESS_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.EBONY_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.FIR_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.HOLLY_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.JACARANDA_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.MAHOGANY_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.MANGROVE_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.MAPLE_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.PINE_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.REDWOOD_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.SKYRIS_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.WILLOW_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.WITCH_HAZEL_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_STAIRS, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_STAIRS, 5, 20);

        //Planks
        flammableBlock(BYGBlocks.ASPEN_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.BAOBAB_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.CHERRY_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.CIKA_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.CYPRESS_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.EBONY_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.FIR_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.HOLLY_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.JACARANDA_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.MAHOGANY_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.MANGROVE_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.MAPLE_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.PINE_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.REDWOOD_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.SKYRIS_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.WILLOW_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.WITCH_HAZEL_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_PLANKS, 5, 20);
        flammableBlock(BYGBlocks.PALM_PLANKS, 5, 20);

        //Fences
        flammableBlock(BYGBlocks.ASPEN_FENCE, 5, 20);
        flammableBlock(BYGBlocks.BAOBAB_FENCE, 5, 20);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_FENCE, 5, 20);
        flammableBlock(BYGBlocks.CHERRY_FENCE, 5, 20);
        flammableBlock(BYGBlocks.CIKA_FENCE, 5, 20);
        flammableBlock(BYGBlocks.CYPRESS_FENCE, 5, 20);
        flammableBlock(BYGBlocks.EBONY_FENCE, 5, 20);
        flammableBlock(BYGBlocks.FIR_FENCE, 5, 20);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_FENCE, 5, 20);
        flammableBlock(BYGBlocks.HOLLY_FENCE, 5, 20);
        flammableBlock(BYGBlocks.JACARANDA_FENCE, 5, 20);
        flammableBlock(BYGBlocks.MAHOGANY_FENCE, 5, 20);
        flammableBlock(BYGBlocks.MANGROVE_FENCE, 5, 20);
        flammableBlock(BYGBlocks.MAPLE_FENCE, 5, 20);
        flammableBlock(BYGBlocks.PINE_FENCE, 5, 20);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_FENCE, 5, 20);
        flammableBlock(BYGBlocks.REDWOOD_FENCE, 5, 20);
        flammableBlock(BYGBlocks.SKYRIS_FENCE, 5, 20);
        flammableBlock(BYGBlocks.WILLOW_FENCE, 5, 20);
        flammableBlock(BYGBlocks.WITCH_HAZEL_FENCE, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_FENCE, 5, 20);
        flammableBlock(BYGBlocks.ZELKOVA_FENCE, 5, 20);

        //Leaves
        flammableBlock(BYGBlocks.ASPEN_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BAOBAB_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BLUE_SPRUCE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BROWN_BIRCH_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.BROWN_OAK_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.CIKA_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.CYPRESS_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.EBONY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.FIR_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.FLOWERING_ORCHARD_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.HOLLY_BERRY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.HOLLY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.JACARANDA_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.MAHOGANY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.MANGROVE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.ORANGE_BIRCH_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.ORANGE_OAK_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.ORCHARD_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.PALO_VERDE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.PINE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.PINK_CHERRY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.REDWOOD_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.RIPE_ORCHARD_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.SILVER_MAPLE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE, 30, 60);
        flammableBlock(BYGBlocks.SKYRIS_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.WHITE_CHERRY_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.WILLOW_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.WITCH_HAZEL_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.YELLOW_BIRCH_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES, 30, 60);
        flammableBlock(BYGBlocks.PALM_LEAVES, 30, 60);

        //Flowers
        flammableBlock(BYGBlocks.ALLIUM_FLOWER_BUSH, 60, 100);
        flammableBlock(BYGBlocks.ALPINE_BELLFLOWER, 60, 100);
        flammableBlock(BYGBlocks.AMARANTH, 60, 100);
        flammableBlock(BYGBlocks.ANGELICA, 60, 100);
        flammableBlock(BYGBlocks.AZALEA, 60, 100);
        flammableBlock(BYGBlocks.BEGONIA, 60, 100);
        flammableBlock(BYGBlocks.BISTORT, 60, 100);
        flammableBlock(BYGBlocks.BLACK_ROSE, 60, 100);
        flammableBlock(BYGBlocks.BLUE_SAGE, 60, 100);
        flammableBlock(BYGBlocks.CALIFORNIA_POPPY, 60, 100);
        flammableBlock(BYGBlocks.CROCUS, 60, 100);
        flammableBlock(BYGBlocks.CYAN_AMARANTH, 60, 100);
        flammableBlock(BYGBlocks.CYAN_ROSE, 60, 100);
        flammableBlock(BYGBlocks.CYAN_TULIP, 60, 100);
        flammableBlock(BYGBlocks.DAFFODIL, 60, 100);
        flammableBlock(BYGBlocks.DELPHINIUM, 60, 100);
        flammableBlock(BYGBlocks.FAIRY_SLIPPER, 60, 100);
        flammableBlock(BYGBlocks.FIRECRACKER_FLOWER_BUSH, 60, 100);
        flammableBlock(BYGBlocks.FOXGLOVE, 60, 100);
        flammableBlock(BYGBlocks.GOLDEN_SPINED_CACTUS, 60, 100);
        flammableBlock(BYGBlocks.GREEN_TULIP, 60, 100);
        flammableBlock(BYGBlocks.GUZMANIA, 60, 100);
        flammableBlock(BYGBlocks.INCAN_LILY, 60, 100);
        flammableBlock(BYGBlocks.IRIS, 60, 100);
        flammableBlock(BYGBlocks.JAPANESE_ORCHID, 60, 100);
        flammableBlock(BYGBlocks.KOVAN_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.LAZARUS_BELLFLOWER, 60, 100);
        flammableBlock(BYGBlocks.LOLIPOP_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.MAGENTA_AMARANTH, 60, 100);
        flammableBlock(BYGBlocks.MAGENTA_TULIP, 60, 100);
        flammableBlock(BYGBlocks.ORANGE_DAISY, 60, 100);
        flammableBlock(BYGBlocks.ORSIRIA_ROSE, 60, 100);
        flammableBlock(BYGBlocks.PEACH_LEATHER_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.PINK_ALLIUM, 60, 100);
        flammableBlock(BYGBlocks.PINK_ALLIUM_FLOWER_BUSH, 60, 100);
        flammableBlock(BYGBlocks.PINK_ANEMONE, 60, 100);
        flammableBlock(BYGBlocks.PINK_DAFFODIL, 60, 100);
        flammableBlock(BYGBlocks.PINK_ORCHID, 60, 100);
        flammableBlock(BYGBlocks.PRAIRIE_GRASS, 60, 100);
        flammableBlock(BYGBlocks.PROTEA_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.PURPLE_AMARANTH, 60, 100);
        flammableBlock(BYGBlocks.PURPLE_ORCHID, 60, 100);
        flammableBlock(BYGBlocks.PURPLE_SAGE, 60, 100);
        flammableBlock(BYGBlocks.PURPLE_TULIP, 60, 100);
        flammableBlock(BYGBlocks.RED_CORNFLOWER, 60, 100);
        flammableBlock(BYGBlocks.RED_ORCHID, 60, 100);
        flammableBlock(BYGBlocks.RICHEA, 60, 100);
        flammableBlock(BYGBlocks.ROSE, 60, 100);
        flammableBlock(BYGBlocks.SILVER_VASE_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.SNOWDROPS, 60, 100);
        flammableBlock(BYGBlocks.TORCH_GINGER, 60, 100);
        flammableBlock(BYGBlocks.VIOLET_LEATHER_FLOWER, 60, 100);
        flammableBlock(BYGBlocks.WHITE_ANEMONE, 60, 100);
        flammableBlock(BYGBlocks.WHITE_SAGE, 60, 100);
        flammableBlock(BYGBlocks.WINTER_CYCLAMEN, 60, 100);
        flammableBlock(BYGBlocks.WINTER_ROSE, 60, 100);
        flammableBlock(BYGBlocks.WINTER_SCILLA, 60, 100);
        flammableBlock(BYGBlocks.YELLOW_DAFFODIL, 60, 100);
        flammableBlock(BYGBlocks.YELLOW_TULIP, 60, 100);

        //Plants
        flammableBlock(BYGBlocks.HORSEWEED, 60, 100);
        flammableBlock(BYGBlocks.WINTER_SUCCULENT, 60, 100);
        flammableBlock(BYGBlocks.SHORT_GRASS, 60, 200);
        flammableBlock(BYGBlocks.POISON_IVY, 15, 100);

        BYG.LOGGER.info("BYG: Added Flammables!");
    }
}