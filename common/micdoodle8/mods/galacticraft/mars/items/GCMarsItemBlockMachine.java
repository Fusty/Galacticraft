package micdoodle8.mods.galacticraft.mars.items;

import micdoodle8.mods.galacticraft.api.item.IHoldableItem;
import micdoodle8.mods.galacticraft.core.client.ClientProxyCore;
import micdoodle8.mods.galacticraft.mars.blocks.GCMarsBlockMachine;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * GCMarsItemBlockMachine.java
 *
 * This file is part of the Galacticraft project
 *
 * @author micdoodle8
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GCMarsItemBlockMachine extends ItemBlock implements IHoldableItem
{
    public GCMarsItemBlockMachine(int id)
    {
        super(id);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int metadata = 0;

        if (itemstack.getItemDamage() >= GCMarsBlockMachine.LAUNCH_CONTROLLER_METADATA)
        {
            metadata = 2;
        }
        else if (itemstack.getItemDamage() >= GCMarsBlockMachine.CRYOGENIC_CHAMBER_METADATA)
        {
            metadata = 1;
        }

        return Block.blocksList[this.getBlockID()].getUnlocalizedName() + "." + metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return ClientProxyCore.galacticraftItem;
    }

    @Override
    public String getUnlocalizedName()
    {
        return Block.blocksList[this.getBlockID()].getUnlocalizedName() + ".0";
    }

    @Override
    public boolean shouldHoldLeftHandUp(EntityPlayer player)
    {
        ItemStack currentStack = player.getCurrentEquippedItem();

        if (currentStack != null && currentStack.getItemDamage() >= GCMarsBlockMachine.CRYOGENIC_CHAMBER_METADATA)
        {
            return true;
        }

        return false;
    }

    @Override
    public boolean shouldHoldRightHandUp(EntityPlayer player)
    {
        ItemStack currentStack = player.getCurrentEquippedItem();

        if (currentStack != null && currentStack.getItemDamage() >= GCMarsBlockMachine.CRYOGENIC_CHAMBER_METADATA)
        {
            return true;
        }

        return false;
    }

    @Override
    public boolean shouldCrouch(EntityPlayer player)
    {
        return false;
    }
}
