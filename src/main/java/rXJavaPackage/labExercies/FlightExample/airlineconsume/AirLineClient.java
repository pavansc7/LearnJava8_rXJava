package rXJavaPackage.labExercies.FlightExample.airlineconsume;

import io.reactivex.Observable;
import rXJavaPackage.labExercies.FlightExample.flight.Flight;
import rXJavaPackage.labExercies.FlightExample.service.FlightService;

import java.io.IOException;

public class AirLineClient {
    public static void main(String[] args) throws IOException {
        FlightService flightService = FlightService.getInstance();
        Observable<Flight> observable = flightService.getFlights(130);
        System.out.println(" Observable value ------------------------");
      observable.subscribe(System.out::println,System.out::println,System.out::println);
    }
}
