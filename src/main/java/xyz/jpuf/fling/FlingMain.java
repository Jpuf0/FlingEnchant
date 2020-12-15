package xyz.jpuf.fling;

import com.willfp.ecoenchants.EcoEnchantsPlugin;
import com.willfp.ecoenchants.enchantments.EcoEnchant;
import org.bukkit.Bukkit;
import com.willfp.ecoenchants.extensions.Extension;


public final class FlingMain extends Extension {
    public static final EcoEnchant FLING = new Fling();

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(FLING, EcoEnchantsPlugin.getInstance());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
