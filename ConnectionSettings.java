/*
Author: David Lazar
*/

public class ConnectionSettings {
    public String server = "irc.cat.pdx.edu";
    public int port = 6697;
    public boolean useSSL = true;
    public boolean verifySSL = false;
    public String password = "";

    public ConnectionSettings(String server) {
        this.server = server;
    }

    public ConnectionSettings clone() {
        ConnectionSettings cs = new ConnectionSettings(server);
        cs.port = port;
        cs.useSSL = useSSL;
        cs.verifySSL = verifySSL;
        cs.password = password;
        return cs;
    }
}
