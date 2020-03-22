package design.pattern;

public class MailService {
    public void sendMail(){
        connect(1);
        authenticate();
        disconnect();

    }

    private void connect(int timeout){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("disconnect");
    }

    private void authenticate(){
        System.out.println("Authentication");
    }
}
