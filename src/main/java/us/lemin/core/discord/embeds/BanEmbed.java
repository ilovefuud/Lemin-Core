package us.lemin.core.discord.embeds;

import net.dv8tion.jda.core.EmbedBuilder;
import us.lemin.core.CorePlugin;

import java.awt.*;

public class BanEmbed extends EmbedBuilder {

   public BanEmbed(String discordUser, String requester) {
       setTitle("Alert");
       setColor(Color.RED);
       addField("Ban", discordUser, false);
       addField("Executor", requester, false);
       setThumbnail("https://pbs.twimg.com/profile_images/1018035859398905856/0l9IiA-B_400x400.jpg");
       setFooter("Generated by " + requester, "https://pbs.twimg.com/profile_images/1018035859398905856/0l9IiA-B_400x400.jpg");
   }

}
