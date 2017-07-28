package me.jacky1356400.simplesponge.item;

import me.jacky1356400.simplesponge.Config;
import me.jacky1356400.simplesponge.SimpleSponge;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagmaticSpongeOnAStick extends ItemSpongeOnAStickBase {

    public ItemMagmaticSpongeOnAStick(){
        setRegistryName(SimpleSponge.MODID + ":magmatic_sponge_on_a_stick");
        setUnlocalizedName(SimpleSponge.MODID + ".magmatic_sponge_on_a_stick");
        setMaxDamage(Config.magmaticSpongeOnAStickMaxDamage);
        setCreativeTab(SimpleSponge.spongeCreativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public boolean isMagmatic() {
        return true;
    }

    @Override
    public int getDmg() {
        return Config.magmaticSpongeOnAStickMaxDamage;
    }

    @Override
    public int getRange() {
        return Config.magmaticSpongeOnAStickRange;
    }

}
