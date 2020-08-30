package pw.chew.chewbotcca.irc;

import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;

public abstract class Command {
    public String name;

    public abstract void execute(ChannelMessageEvent event);
}
