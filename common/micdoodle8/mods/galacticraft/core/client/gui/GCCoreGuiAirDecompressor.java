package micdoodle8.mods.galacticraft.core.client.gui;

import java.util.ArrayList;
import java.util.List;
import mekanism.api.EnumColor;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.inventory.GCCoreContainerAirDecompressor;
import micdoodle8.mods.galacticraft.core.items.GCCoreItemOxygenTank;
import micdoodle8.mods.galacticraft.core.tile.GCCoreTileEntityOxygenDecompressor;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import universalelectricity.core.electricity.ElectricityDisplay;
import universalelectricity.core.electricity.ElectricityDisplay.ElectricUnit;

/**
 * GCCoreGuiAirDecompressor.java
 *
 * This file is part of the Galacticraft project
 *
 * @author micdoodle8
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GCCoreGuiAirDecompressor extends GCCoreGuiContainer
{
    private static final ResourceLocation compressorTexture = new ResourceLocation(GalacticraftCore.ASSET_DOMAIN, "textures/gui/compressor.png");

    private final GCCoreTileEntityOxygenDecompressor decompressor;

    private GCCoreInfoRegion oxygenInfoRegion = new GCCoreInfoRegion((this.width - this.xSize) / 2 + 112, (this.height - this.ySize) / 2 + 24, 56, 9, new ArrayList<String>(), this.width, this.height);
    private GCCoreInfoRegion electricInfoRegion = new GCCoreInfoRegion((this.width - this.xSize) / 2 + 112, (this.height - this.ySize) / 2 + 37, 56, 9, new ArrayList<String>(), this.width, this.height);

    public GCCoreGuiAirDecompressor(InventoryPlayer par1InventoryPlayer, GCCoreTileEntityOxygenDecompressor par2TileEntityAirDistributor)
    {
        super(new GCCoreContainerAirDecompressor(par1InventoryPlayer, par2TileEntityAirDistributor));
        this.decompressor = par2TileEntityAirDistributor;
        this.ySize = 180;
    }

    @Override
    public void initGui()
    {
        super.initGui();
        List<String> batterySlotDesc = new ArrayList<String>();
        batterySlotDesc.add("Compressor battery slot, place battery here");
        batterySlotDesc.add("if not using a connected power source");
        this.infoRegions.add(new GCCoreInfoRegion((this.width - this.xSize) / 2 + 31, (this.height - this.ySize) / 2 + 26, 18, 18, batterySlotDesc, this.width, this.height));
        List<String> compressorSlotDesc = new ArrayList<String>();
        compressorSlotDesc.add("Decompressor tank slot, place oxygen tank");
        compressorSlotDesc.add("here to fill it with breathable oxygen.");
        this.infoRegions.add(new GCCoreInfoRegion((this.width - this.xSize) / 2 + 132, (this.height - this.ySize) / 2 + 70, 18, 18, compressorSlotDesc, this.width, this.height));
        List<String> oxygenDesc = new ArrayList<String>();
        oxygenDesc.add("Oxygen Storage");
        oxygenDesc.add(EnumColor.YELLOW + "Oxygen: " + ((int) Math.floor(this.decompressor.storedOxygen) + " / " + (int) Math.floor(this.decompressor.maxOxygen)));
        this.oxygenInfoRegion.tooltipStrings = oxygenDesc;
        this.oxygenInfoRegion.xPosition = (this.width - this.xSize) / 2 + 112;
        this.oxygenInfoRegion.yPosition = (this.height - this.ySize) / 2 + 24;
        this.oxygenInfoRegion.parentWidth = this.width;
        this.oxygenInfoRegion.parentHeight = this.height;
        this.infoRegions.add(this.oxygenInfoRegion);
        List<String> electricityDesc = new ArrayList<String>();
        electricityDesc.add("Electrical Storage");
        electricityDesc.add(EnumColor.YELLOW + "Energy: " + ((int) Math.floor(this.decompressor.getEnergyStored()) + " / " + (int) Math.floor(this.decompressor.getMaxEnergyStored())));
        this.electricInfoRegion.tooltipStrings = electricityDesc;
        this.electricInfoRegion.xPosition = (this.width - this.xSize) / 2 + 112;
        this.electricInfoRegion.yPosition = (this.height - this.ySize) / 2 + 37;
        this.electricInfoRegion.parentWidth = this.width;
        this.electricInfoRegion.parentHeight = this.height;
        this.infoRegions.add(this.electricInfoRegion);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(this.decompressor.getInvName(), 8, 10, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("gui.message.in.name") + ":", 87, 26, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("gui.message.in.name") + ":", 87, 38, 4210752);
        String status = StatCollector.translateToLocal("gui.message.status.name") + ": " + this.getStatus();
        this.fontRenderer.drawString(status, this.xSize / 2 - this.fontRenderer.getStringWidth(status) / 2, 50, 4210752);
        status = "Max Output: " + GCCoreTileEntityOxygenDecompressor.OUTPUT_PER_TICK * 20 + "/s";
        this.fontRenderer.drawString(status, this.xSize / 2 - this.fontRenderer.getStringWidth(status) / 2, 60, 4210752);
        status = ElectricityDisplay.getDisplay(this.decompressor.ueWattsPerTick * 20, ElectricUnit.WATT);
        this.fontRenderer.drawString(status, this.xSize / 2 - this.fontRenderer.getStringWidth(status) / 2, 70, 4210752);
        status = ElectricityDisplay.getDisplay(this.decompressor.getVoltage(), ElectricUnit.VOLTAGE);
        this.fontRenderer.drawString(status, this.xSize / 2 - this.fontRenderer.getStringWidth(status) / 2, 80, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 104 + 17, 4210752);
    }

    private String getStatus()
    {
        if (this.decompressor.getStackInSlot(0) == null || !(this.decompressor.getStackInSlot(0).getItem() instanceof GCCoreItemOxygenTank))
        {
            return EnumColor.DARK_RED + StatCollector.translateToLocal("gui.status.missingtank.name");
        }

        if (this.decompressor.getEnergyStored() == 0)
        {
            return EnumColor.DARK_RED + StatCollector.translateToLocal("gui.status.missingpower.name");
        }

        if (this.decompressor.getStackInSlot(0) != null && this.decompressor.getStackInSlot(0).getItemDamage() == this.decompressor.getStackInSlot(0).getMaxDamage())
        {
            return EnumColor.DARK_RED + "Oxygen Tank Empty";
        }

        return EnumColor.DARK_GREEN + StatCollector.translateToLocal("gui.status.active.name");
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(GCCoreGuiAirDecompressor.compressorTexture);
        final int var5 = (this.width - this.xSize) / 2;
        final int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6 + 5, 0, 0, this.xSize, 181);

        if (this.decompressor != null)
        {
            int scale = this.decompressor.getCappedScaledOxygenLevel(54);
            this.drawTexturedModalRect(var5 + 113, var6 + 25, 197, 7, Math.min(scale, 54), 7);
            scale = this.decompressor.getScaledElecticalLevel(54);
            this.drawTexturedModalRect(var5 + 113, var6 + 38, 197, 0, Math.min(scale, 54), 7);

            if (this.decompressor.getEnergyStored() > 0)
            {
                this.drawTexturedModalRect(var5 + 99, var6 + 37, 176, 0, 11, 10);
            }

            if (this.decompressor.storedOxygen > 0)
            {
                this.drawTexturedModalRect(var5 + 100, var6 + 24, 187, 0, 10, 10);
            }

            List<String> oxygenDesc = new ArrayList<String>();
            oxygenDesc.add("Oxygen Storage");
            oxygenDesc.add(EnumColor.YELLOW + "Oxygen: " + ((int) Math.floor(this.decompressor.storedOxygen) + " / " + (int) Math.floor(this.decompressor.maxOxygen)));
            this.oxygenInfoRegion.tooltipStrings = oxygenDesc;

            List<String> electricityDesc = new ArrayList<String>();
            electricityDesc.add("Electrical Storage");
            electricityDesc.add(EnumColor.YELLOW + "Energy: " + ((int) Math.floor(this.decompressor.getEnergyStored()) + " / " + (int) Math.floor(this.decompressor.getMaxEnergyStored())));
            this.electricInfoRegion.tooltipStrings = electricityDesc;
        }
    }
}
