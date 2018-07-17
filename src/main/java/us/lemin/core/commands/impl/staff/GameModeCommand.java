package us.lemin.core.commands.impl.staff;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import us.lemin.core.commands.PlayerCommand;
import us.lemin.core.player.rank.Rank;
import us.lemin.core.utils.message.CC;

public class GameModeCommand extends PlayerCommand {
    public GameModeCommand() {
        super("gamemode", Rank.SENIOR_MOD);
        setAliases("gm");
        setUsage(CC.RED + "Usage: /gamemode <mode|id>");
    }

    @Override
    public void execute(Player player, String[] args) {
        if (args.length < 1) {
            player.sendMessage(usageMessage);
            return;
        }

        switch (args[0].toLowerCase()) {
            case "1":
            case "creative":
            case "c":
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(CC.GREEN + "Your game mode was set to creative.");
                break;
            case "0":
            case "survival":
            case "s":
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(CC.GREEN + "Your game mode was set to survival.");
                break;
            case "2":
            case "adventure":
            case "a":
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(CC.GREEN + "Your game mode was set to adventure.");
                break;
            default:
                player.sendMessage(usageMessage);
                break;
        }
    }
}
