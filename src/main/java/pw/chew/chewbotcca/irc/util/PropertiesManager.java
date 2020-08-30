package pw.chew.chewbotcca.irc.util;

import java.util.Properties;

public class PropertiesManager {
    public static Properties properties;
    public static void loadProperties(Properties config) {
        properties = config;
    }

    public static String getNickname() {
        return properties.getProperty("nickname");
    }

    public static String getRealname() {
        return properties.getProperty("realname");
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPrefix() {
        return properties.getProperty("prefix");
    }

    public static boolean isPrefixStart() {
        return Boolean.parseBoolean(properties.getProperty("prefixstart"));
    }

    public static String getServer() {
        return properties.getProperty("server");
    }

    public static int getPort() {
        return Integer.parseInt(properties.getProperty("port"));
    }

    public static String[] getChannels() {
        return properties.getProperty("channels").split(" ");
    }

    public static boolean isSSL() {
        return Boolean.parseBoolean(properties.getProperty("ssl"));
    }

    public static String getServerPass() {
        return properties.getProperty("serverpass");
    }

    public static String getNickServPass() {
        return properties.getProperty("nickservpass");
    }

    public static String getWordnikKey() {
        return properties.getProperty("wordnik");
    }

    public static String getGoogleKey() {
        return properties.getProperty("google");
    }

    public static String getCleverbotKey() {
        return properties.getProperty("cleverbot");
    }

    public static String getCleverbotState() {
        return properties.getProperty("cs");
    }

    public static String getSpotifyAuthToken() {
        return properties.getProperty("spotify");
    }

    public static String getSpotifyClientId() {
        return properties.getProperty("spotifyclientid");
    }

    public static String getSpotifyClientSecret() {
        return properties.getProperty("spotifysecret");
    }

    public static String getLastfmKey() {
        return properties.getProperty("lastfm");
    }

    public static String getMemeratorKey() {
        return properties.getProperty("memerator");
    }
}
