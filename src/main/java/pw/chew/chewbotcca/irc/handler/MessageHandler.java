package pw.chew.chewbotcca.irc.handler;

import net.engio.mbassy.listener.Handler;
import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import org.slf4j.LoggerFactory;
import pw.chew.chewbotcca.irc.util.CommandManager;
import pw.chew.chewbotcca.irc.util.PropertiesManager;

public class MessageHandler {
    @Handler
    public void onMessage(ChannelMessageEvent event) {
        if(!event.getMessage().startsWith(PropertiesManager.getPrefix())) {
            return;
        }
        CommandManager.executeCommand(
                event.getMessage().split(" ")[0].toLowerCase().replace(PropertiesManager.getPrefix(), ""),
                event
        );
    }
}
