package google.guice.learn;

import com.google.inject.ImplementedBy;

@ImplementedBy(EmailService.class)
public interface MessageService {
    int sendMessage(String msg);
}
