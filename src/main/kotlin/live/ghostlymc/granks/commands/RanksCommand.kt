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

package live.ghostlymc.granks.commands

import dev.waterdog.waterdogpe.command.Command
import dev.waterdog.waterdogpe.command.CommandSender
import dev.waterdog.waterdogpe.command.CommandSettings

class RanksCommand: Command("ranks", CommandSettings.builder()
    .setUsageMessage("ranks help")
    .setPermission("granks.ranks.cmd")
    .setDescription("Manage the ranks of each player")
    .setAliases(arrayOf("rank"))
    .build()) {

    override fun onExecute(sender: CommandSender?, alias: String?, args: Array<out String>?): Boolean {
        sender?.sendMessage("work")

        return true
    }
}