package pw.chew.chewbotcca.irc.commands.about;

import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import pw.chew.chewbotcca.irc.Command;

public class AboutCommand extends Command {
    public AboutCommand() {
        this.name = "about";
    }

    @Override
    public void execute(ChannelMessageEvent event) {
        event.sendReply("Chewbotcca is a bot by Chew. Check it out: https://github.com/Chewbotcca/IRC-Kitteh");
    }
}
