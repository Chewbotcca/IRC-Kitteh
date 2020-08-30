package pw.chew.chewbotcca.irc.commands.about;

import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import pw.chew.chewbotcca.irc.Command;

public class PingCommand extends Command {
    public PingCommand() {
        this.name = "ping";
    }

    @Override
    public void execute(ChannelMessageEvent event) {
        event.sendReply("Hello yes i am alive. ready for action. beep beep boop boop.");
    }
}
