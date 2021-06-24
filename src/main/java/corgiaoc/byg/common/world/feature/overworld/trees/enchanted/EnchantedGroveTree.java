package corgiaoc.byg.common.world.feature.overworld.trees.enchanted;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import corgiaoc.byg.core.BYGBlocks;
import corgiaoc.byg.util.FabricTags;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.TestableWorld;

import java.util.Random;
import java.util.Set;

public class EnchantedGroveTree extends BYGAbstractTreeFeature<BYGTreeConfig> {

    public EnchantedGroveTree(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }


    protected static boolean isDirtOrPeatBlock(TestableWorld worldIn, BlockPos pos) {
        return worldIn.testBlockState(pos, (state) -> {
            return state.isIn(FabricTags.DIRT) || state == BYGBlocks.PEAT.getDefaultState();
        });
    }

    public boolean generate(Set<BlockPos> changedBlocks, StructureWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = rand.nextInt(2) + rand.nextInt(2) + 9;
        //Positions
        int posX = pos.getX();
        int posY = pos.getY();
        int posZ = pos.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDirtOrPeatBlock(worldIn, pos.down())) {
                return false;
            } else {

                Direction direction = Direction.Type.HORIZONTAL.random(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);
                int posY1 = 2 - rand.nextInt(1);
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;

                for (int groundUpLogRemover = 0; groundUpLogRemover < randTreeHeight; ++groundUpLogRemover) {
                    if (groundUpLogRemover >= randTreeHeight2 && posY1 < 0) {
                        posX1 += direction.getOffsetX();
                        posZ1 += direction.getOffsetZ();
                        ++posY1;
                    }
                    //This Int is responsible for the Y coordinate of the trunk BlockPos'.
                    int logplacer = posY + groundUpLogRemover;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos1, boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos1.up(1), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos1.up(2), boundsIn);


                }
                int tHSub5 = 5;
                int tHSub4 = 4;
                int tHSub3 = 3;
                int tHSub2 = 2;
                int tHSub1 = 1;

                int leavessquarespos = 1;
                for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                    for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub4, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub5, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub5, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub5, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub5, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub5, posZ1 + 2, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub4, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub4, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub4, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub4, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub4, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight - tHSub4, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight - tHSub4, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight - tHSub4, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight - tHSub4, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub4, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub4, posZ1 + 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub4, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub4, posZ1 + 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub3, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub3, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub3, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub3, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub3, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight - tHSub3, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight - tHSub3, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight - tHSub3, posZ1 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight - tHSub3, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub3, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub3, posZ1 + 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub3, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub3, posZ1 + 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub2, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 + 2, topTrunkHeight - tHSub2, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 2, topTrunkHeight - tHSub2, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub2, posZ1 - 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight - tHSub2, posZ1 + 2, boundsIn, changedBlocks);


                        placeLeaves(config, rand, worldIn, posX1 + posXLeafWidth, topTrunkHeight - tHSub1, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight + tHSub1, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight + tHSub1, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub1, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub1, posZ1 + 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1 + 1, topTrunkHeight + tHSub2, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1 - 1, topTrunkHeight + tHSub2, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub2, posZ1 - 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub2, posZ1 + 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub3, posZ1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX1, topTrunkHeight + tHSub4, posZ1, boundsIn, changedBlocks);
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }
}