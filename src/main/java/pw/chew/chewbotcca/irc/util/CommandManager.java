package pw.chew.chewbotcca.irc.util;

import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import org.slf4j.LoggerFactory;
import pw.chew.chewbotcca.irc.Command;

import java.util.HashMap;

public class CommandManager {
    public static HashMap<String, Command> commands = new HashMap<>();

    public static void loadCommand(Command command) {
        commands.put(command.name, command);
    }

    public static void loadCommands(Command... commands) {
        for(Command command : commands)
            loadCommand(command);
    }

    public static void unloadCommand(Command command) {
        commands.remove(command.name);
    }

    public static void executeCommand(String name, ChannelMessageEvent event) {
        try {
            commands.get(name).execute(event);
        } catch (NullPointerException ignored) { }
    }
}
