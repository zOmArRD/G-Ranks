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

package live.ghostlymc.granks

import dev.waterdog.waterdogpe.plugin.Plugin

class GRanks: Plugin() {
    override fun onEnable() {
        println("GRanks has been enabled!")
    }

    override fun onDisable() {
        println("GRanks has been disabled!")
    }
}