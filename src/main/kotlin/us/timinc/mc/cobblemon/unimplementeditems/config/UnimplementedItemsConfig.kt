package us.timinc.mc.cobblemon.unimplementeditems.config

import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.storage.loot.BuiltInLootTables

class UnimplementedItemsConfig {
    val abilityPatchGen9: Boolean = true
    val lootPoolOverrides: List<ResourceLocation> = listOf(
        BuiltInLootTables.FISHING_TREASURE,
        Blocks.GRASS.lootTable
    )
}