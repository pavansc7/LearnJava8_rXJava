package google.guice.learn;

import com.google.inject.Inject;

public class Driver {
    MessageService messageService;
    @Inject
    Driver(MessageService messageService){
        this.messageService = messageService;
    }

    void sendEmail(String msg){
        messageService.sendMessage(msg);
    }
}
