package pt.com.srg.templatemethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        SocialNetwork sn = new Facebook();
        sn.sendPost("Howdy!");
    }
}

abstract class SocialNetwork {
    private String username;
    private String password;

    public void sendPost(String content) {
        if (login(username, password)) {
            System.out.println("Posting message...");
            post(content);
        }
        logout(username, password);
    }

    abstract void logout(String username, String password);

    abstract void post(String content);

    abstract boolean login(String username, String password);

}

class Facebook extends SocialNetwork {

    @Override
    void logout(String username, String password) {
        System.out.println("Logging out with Facebook's API");
    }

    @Override
    void post(String content) {
        System.out.println("Posting with Facebook's API: " + content);
    }

    @Override
    boolean login(String username, String password) {
        System.out.println("Logging in as Facebook");
        return true;
    }
}

class Twitter extends SocialNetwork {

    @Override
    void logout(String username, String password) {
        System.out.println("Logging out with Twitter's API");
    }

    @Override
    void post(String content) {
        System.out.println("Posting with Twitter's API: " + content);
    }

    @Override
    boolean login(String username, String password) {
        System.out.println("Logging in as Twitter");
        return true;
    }
}
