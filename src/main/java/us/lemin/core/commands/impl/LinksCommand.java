package us.lemin.core.commands.impl;

import org.bukkit.command.CommandSender;
import us.lemin.core.commands.BaseCommand;
import us.lemin.core.utils.message.CC;

public class LinksCommand extends BaseCommand {
    public LinksCommand() {
        super("links");
        setAliases("twitter", "discord", "social", "socialmedia", "media", "info");
    }

    @Override
    protected void execute(CommandSender sender, String[] args) {
        sender.sendMessage(CC.SEPARATOR);
        sender.sendMessage(CC.SECONDARY + "Server Links");
        sender.sendMessage(CC.PRIMARY + "Twitter: " + CC.SECONDARY + "twitter.com/leminnetwork");
        sender.sendMessage(CC.PRIMARY + "Discord: " + CC.SECONDARY + "discord.gg/4bTHT7D");
        sender.sendMessage(CC.SEPARATOR);
    }
}
