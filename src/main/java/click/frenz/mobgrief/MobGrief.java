package click.frenz.mobgrief;

import click.frenz.mobgrief.config.Settings;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;


public class MobGrief implements ModInitializer {
    public static final Settings CONFIG = AutoConfig.register(Settings.class, GsonConfigSerializer::new).getConfig();

    @Override
    public void onInitialize() {
        // do nothing
    }
}