package us.lemin.core.utils.message;

import lombok.experimental.UtilityClass;
import us.lemin.core.server.ServerSettings;

@UtilityClass
public class Messages {
    public static final String PLAYER_NOT_FOUND = CC.RED + "Player not found.";
    public static final String DATA_LOAD_FAIL = CC.RED + "Something went wrong; try re-logging." +
            "\nIf this problem persists, please contact staff for support.";
    private static final String APPEAL_MESSAGE = CC.GRAY + "\nIf you believe this was a false ban, you can appeal it at "
            + CC.YELLOW + "http://appeal." + ServerSettings.SERVER_DOMAIN + CC.GRAY + " or buy an unban at " + CC.YELLOW + "https://store." + ServerSettings.SERVER_DOMAIN + CC.GRAY + ".";
    public static final String BANNED_PERMANENTLY = CC.RED + "You are permanently banned." + APPEAL_MESSAGE;
    public static final String BANNED_TEMPORARILY = CC.RED + "You are banned for %s." + APPEAL_MESSAGE;
}
