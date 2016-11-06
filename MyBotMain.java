/**
 * Created by James on 10/28/2016.
 */

public class MyBotMain {

    public static void main(String[] args) throws Exception {

        // Now start our bot up.
        MyBot bot = new MyBot();

        // Enable debugging output.
        bot.setVerbose(true);

        // Connect to the IRC server.
        bot.connect("irc.cat.pdx.edu");

        // Join the #pircbot channel.
        bot.joinChannel("#robots, ");
        bot.onPing("Botty", "jamesw", "irc.cat.pdx.edu", "PING", "PONG");
    }

}

