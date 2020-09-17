package google.guice.learn;

public class PhoneService implements MessageService {
    @Override
    public int sendMessage(String msg) {
        System.out.println(" I am sending phone text "+msg);
        return 1;
    }
}
