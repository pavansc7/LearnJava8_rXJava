package google.guice.learn;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new ServiceModule());
        Driver service = injector.getInstance(Driver.class);
        service.sendEmail("Hi this is pavankumar");
    }
}
