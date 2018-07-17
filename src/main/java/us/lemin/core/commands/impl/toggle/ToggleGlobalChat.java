package us.lemin.core.commands.impl.toggle;

import org.bukkit.entity.Player;
import us.lemin.core.CorePlugin;
import us.lemin.core.commands.PlayerCommand;
import us.lemin.core.player.CoreProfile;
import us.lemin.core.utils.message.CC;

public class ToggleGlobalChat extends PlayerCommand {
    private final CorePlugin plugin;

    public ToggleGlobalChat(CorePlugin plugin) {
        super("toggleglobalchat");
        this.plugin = plugin;
        setAliases("togglechat", "tgc");
    }

    @Override
    public void execute(Player player, String[] args) {
        CoreProfile profile = plugin.getProfileManager().getProfile(player.getUniqueId());
        boolean enabled = !profile.isGlobalChatEnabled();

        profile.setGlobalChatEnabled(enabled);
        player.sendMessage(enabled ? CC.GREEN + "Global chat enabled." : CC.RED + "Global chat disabled.");
    }
}
