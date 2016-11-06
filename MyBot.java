import twitter4j.*;

/**
 * Created by James on 10/28/2016.
 */

public class MyBot extends PircBot {

    String tweety;
    public MyBot() {
        this.setName("Botty");
    }

    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {

        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query("cats");
        QueryResult result = null;

        try {
            result = twitter.search(query);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            tweety =  ":" + status.getText();
        }
        if (message.startsWith("botty")) {
            sendMessage(channel,message);
        }
    }
}
