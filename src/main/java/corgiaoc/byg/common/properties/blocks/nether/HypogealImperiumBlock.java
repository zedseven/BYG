package corgiaoc.byg.common.properties.blocks.nether;

import corgiaoc.byg.common.entity.tileentities.HypogealImperiumTE;
import corgiaoc.byg.core.BYGTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Random;

public class HypogealImperiumBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);

    public HypogealImperiumBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
           return BYGTileEntities.HYPOGEAL.get().create();
        }


    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult result) {
        if (!worldIn.isClientSide) {
            TileEntity tile = worldIn.getBlockEntity(pos);
            if (tile instanceof HypogealImperiumTE) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (HypogealImperiumTE) tile, pos);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }



    @Override
    public void onRemove(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity te = worldIn.getBlockEntity(pos);
            if (te instanceof HypogealImperiumTE) {
                InventoryHelper.dropContents(worldIn, pos, ((HypogealImperiumTE) te).getItems());
            }
            super.onRemove(state, worldIn, pos, newState, isMoving);
        }
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(LIT);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState p_180655_1_, World p_180655_2_, BlockPos p_180655_3_, Random p_180655_4_) {
        if (p_180655_1_.getValue(LIT)) {
            for(int i = -2; i <= 2; ++i) {
                for(int j = -2; j <= 2; ++j) {
                    if (i > -2 && i < 2 && j == -1) {
                        j = 2;
                    }
                    if (p_180655_4_.nextInt(16) == 0) {
                        for(int k = 0; k <= 1; ++k) {
                            p_180655_2_.addParticle(ParticleTypes.END_ROD, (double)p_180655_3_.getX() + 0.5D, (double)p_180655_3_.getY() + 2.0D, (double)p_180655_3_.getZ() + 0.5D, (double)((float)i + p_180655_4_.nextFloat()) - 0.5D, (float)k - p_180655_4_.nextFloat() - 1.0F, (double)((float)j + p_180655_4_.nextFloat()) - 0.5D);
                        }
                    }
                }
            }
        }
    }
}

