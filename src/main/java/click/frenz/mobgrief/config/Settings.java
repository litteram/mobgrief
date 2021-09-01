package click.frenz.mobgrief.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "mobgrief")
public class Settings implements ConfigData {

	public boolean creeper_block_damage = true;
}
