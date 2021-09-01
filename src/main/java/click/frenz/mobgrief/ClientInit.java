package click.frenz.mobgrief;

import click.frenz.mobgrief.config.Settings;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
@SuppressWarnings("unused") // entrypoint
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // how to get the gui registry for custom gui handlers
        AutoConfig.getGuiRegistry(Settings.class);
    }
}
