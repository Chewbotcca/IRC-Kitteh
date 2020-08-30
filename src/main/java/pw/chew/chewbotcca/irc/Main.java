package pw.chew.chewbotcca.irc;

import org.kitteh.irc.client.library.Client;
import pw.chew.chewbotcca.irc.commands.PingCommand;
import pw.chew.chewbotcca.irc.handler.MessageHandler;
import pw.chew.chewbotcca.irc.util.CommandManager;
import pw.chew.chewbotcca.irc.util.PropertiesManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("bot.properties"));
        PropertiesManager.loadProperties(prop);

        CommandManager.loadCommands(new PingCommand());

        Client client = Client.builder()
                .nick(PropertiesManager.getNickname())
                .realName(PropertiesManager.getRealname())
                .user(PropertiesManager.getUsername())
                .server()
                .host(PropertiesManager.getServer())
                .port(PropertiesManager.getPort(), Client.Builder.Server.SecurityType.SECURE)
                .password(PropertiesManager.getServerPass())
                .then()
                .buildAndConnect();

        client.addChannel(PropertiesManager.getChannels());
        client.getEventManager().registerEventListener(new MessageHandler());
    }
}
