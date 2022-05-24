/*
 * Created by PhpStorm.
 *
 * User: zOmArRD
 * Date: 23/5/2022
 *
 *
 *      $$$$$$\  $$\                             $$\     $$\           $$\      $$\  $$$$$$\
 *     $$  __$$\ $$ |                            $$ |    $$ |          $$$\    $$$ |$$  __$$\
 *     $$ /  \__|$$$$$$$\   $$$$$$\   $$$$$$$\ $$$$$$\   $$ |$$\   $$\ $$$$\  $$$$ |$$ /  \__|
 *     $$ |$$$$\ $$  __$$\ $$  __$$\ $$  _____|\_$$  _|  $$ |$$ |  $$ |$$\$\$ $$ |$$ |
 *     $$ |\_$$ |$$ |  $$ |$$ /  $$ |\$$$$$\    $$ |    $$ |$$ |  $$ |$$ \$$  $$ |$$ |
 *     $$ |  $$ |$$ |  $$ |$$ |  $$ | \____$$\   $$ |$$\ $$ |$$ |  $$ |$$ |\$  /$$ |$$ |  $$\
 *     \$$$$$  |$$ |  $$ |\$$$$$  |$$$$$$$  |  \$$$  |$$ |\$$$$$$ |$$ | \_/ $$ |\$$$$$  |
 *      \______/ \__|  \__| \______/ \_______/    \____/ \__| \____$$ |\__|     \__| \______/
 *                                                           $$\   $$ |
 *                                                           \$$$$$  |
 *                                                            \______/
 *
 * Copyright © 2022 GhostlyMC Network (omar@ghostlymc.live) - All Rights Reserved.
 */

package live.ghostlymc.granks;

import dev.waterdog.waterdogpe.logger.Logger;
import dev.waterdog.waterdogpe.plugin.Plugin;
import live.ghostlymc.granks.config.ConfigManager;

public class GRanks extends Plugin {

    private static GRanks instance;
    public static Logger logger;
    public static String prefix;

    public static GRanks getInstance() {
        return instance;
    }

    @Override
    public void onStartup() {
        instance = this;
        logger = getLogger();

        new ConfigManager();
    }

    @Override
    public void onEnable() {
        logger.info(prefix + "§aG-Ranks has been loaded!");
    }

    public ConfigManager getConfigManager() {
        return ConfigManager.getInstance();
    }
}
