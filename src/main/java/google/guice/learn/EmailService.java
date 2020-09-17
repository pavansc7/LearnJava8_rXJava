package google.guice.learn;

public class EmailService implements MessageService {

    String emailId="pavansc7@gmail.com";
//    public EmailService(String emailId){
//        this.emailId = emailId;
//    }
    @Override
    public int sendMessage(String msg) {
        System.out.println(" i am sending message "+msg+" to this mail id - "+emailId);
        return 1;
    }
}
