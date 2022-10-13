package pro.mikey.smashy;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public interface HammerTags {
    TagKey<Block> HAMMER_NO_SMASHY = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Hammers.MOD_ID, "hammer_no_smashy"));
}
