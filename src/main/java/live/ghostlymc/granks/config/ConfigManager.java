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

package live.ghostlymc.granks.config;

import dev.waterdog.waterdogpe.utils.config.Configuration;
import dev.waterdog.waterdogpe.utils.config.JsonConfig;
import dev.waterdog.waterdogpe.utils.config.YamlConfig;
import live.ghostlymc.granks.GRanks;

import java.io.File;

public class ConfigManager {

    public Configuration pluginConfig;
    private static ConfigManager instance;

    public ConfigManager() {
        instance = this;
        setup();
    }

    public void setup() {
        saveResource("config.yml");

        if (this.plugin().getConfig().getInt("config.version") != 1) {
            GRanks.logger.warning("[GRanks] Config file is outdated, updating...");
            this.plugin().saveResource("config.yml", true);
        }

        pluginConfig = this.plugin().getConfig();

        GRanks.prefix = pluginConfig.getString("prefix");
    }

    private GRanks plugin() {
        return GRanks.getInstance();
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public JsonConfig getJsonFile(String filePath, String type) {
        File file = new File(getDataFolder() + filePath);

        return new JsonConfig(file);
    }

    public YamlConfig getYamlFile(String filePath, String type) {
        File file = new File(getDataFolder() + filePath);

        return new YamlConfig(file);
    }

    public void saveResource(String file) {
        this.plugin().saveResource(file, false);
    }

    public void saveResource(String file, boolean replace) {
        this.plugin().saveResource(file, replace);
    }

    public File getDataFolder() {
        return this.plugin().getDataFolder();
    }
}