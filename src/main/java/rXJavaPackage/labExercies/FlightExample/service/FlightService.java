package rXJavaPackage.labExercies.FlightExample.service;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Single;
import rXJavaPackage.labExercies.FlightExample.flight.Flight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public interface FlightService {
    Observable<Flight> getFlights(int airportCode) throws IOException;

    static  FlightService getInstance(){
        Logger logger = Logger.getLogger(FlightService.class.getName());
        logger.setLevel(Level.INFO);
        logger.info(" Inside Flight service method");
        return (airportCode) -> Observable.create( observableEmitter -> {
                    List<Flight> flightList = new ArrayList<>();
                    Scanner scanner = new Scanner(new FileReader("C:\\Users\\scp1\\IdeaProjects\\LearnJPA\\LearnJava8\\src\\main\\resources\\Flight.txt"));
                    try {
                        while (scanner.hasNextLine()) {
                            String[] word = scanner.nextLine().split(" ");
                            //    logger.info(" Flight value = " + Arrays.toString(word));
                            flightList.add(new Flight(word[0], word[1], Integer.parseInt(word[2]), word[3], Integer.parseInt(word[4])
                                    , LocalDate.parse(word[5]), LocalTime.parse(word[6]).truncatedTo(ChronoUnit.MINUTES), word[7], word[8], Flight.FlightStatus.valueOf(word[9])));
                        }
                        flightList.stream().filter(val -> {
                            if ( airportCode == 130 ){
                                try {
                                    throw new Exception(" Reading failed from file");
                                } catch (Exception e) {
                                    observableEmitter.onError(new Exception(" Reading failed from file"));
                                }
                            }
                            return airportCode==val.getAirlineCode();
                        }).forEach(flight -> observableEmitter.onNext(flight));
                        observableEmitter.onComplete();
                    }catch (Exception e) {
                        observableEmitter.onError(new Exception(" Reading failed from file"));
                    }
                    });


//ob
//
//
//
//
//            List<Flight> flightList = new ArrayList<>();
//
//            Scanner scanner = new Scanner(new FileReader("C:\\Users\\scp1\\IdeaProjects\\LearnJPA\\LearnJava8\\src\\main\\resources\\Flight.txt"));
//            while (scanner.hasNextLine()) {
//                String[] word = scanner.nextLine().split(" ");
//                //System.out.println(word);
//                logger.info(" Flight value = " + Arrays.toString(word));
//                flightList.add(new Flight(word[0], word[1], Integer.parseInt(word[2]), word[3], Integer.parseInt(word[4])
//                        , LocalDate.parse(word[5]), LocalTime.parse(word[6]).truncatedTo(ChronoUnit.MINUTES), word[7], word[8], Flight.FlightStatus.valueOf(word[9])));
//            }
//            ;
//        }
//        })
//
//        {
//
//            return Observable.fromIterable(flightList.stream().filter(val->airportCode==val.getDestinationCode()).collect(Collectors.toList()));
//        });
    }
}
