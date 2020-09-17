package rXJavaPackage.labExercies.FlightExample.flight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Flight {
    public enum FlightStatus {
        ON_TIME("on_time"),
        DELAYED("delayed"),
        DEPARTED("departed");

        private String status;

        FlightStatus(String status) {
            this.status = status;
        }
    }

    String flightNumber;
    //Map<Integer, String> destination;
    String destinationValue;
    int destinationCode;
    //Map<Integer, String> airline;
    String airlineValue;
    int  airlineCode;
    LocalDate departureDate;
    LocalTime departureTime;
    String terminal;
    String operatedBy;
    FlightStatus flightStatus;

    public Flight(String flightNumber, String destinationValue, int destinationCode, String airlineValue, int airlineCode, LocalDate departureDate, LocalTime departureTime, String terminal, String operatedBy, FlightStatus flightStatus) {
        this.flightNumber = flightNumber;
        this.destinationValue = destinationValue;
        this.destinationCode = destinationCode;
        this.airlineValue = airlineValue;
        this.airlineCode = airlineCode;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.terminal = terminal;
        this.operatedBy = operatedBy;
        this.flightStatus = flightStatus;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestinationValue() {
        return destinationValue;
    }

    public void setDestinationValue(String destinationValue) {
        this.destinationValue = destinationValue;
    }

    public int getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(int destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getAirlineValue() {
        return airlineValue;
    }

    public void setAirlineValue(String airlineValue) {
        this.airlineValue = airlineValue;
    }

    public int getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(int airlineCode) {
        this.airlineCode = airlineCode;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(String operatedBy) {
        this.operatedBy = operatedBy;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destinationValue='" + destinationValue + '\'' +
                ", destinationCode=" + destinationCode +
                ", airlineValue='" + airlineValue + '\'' +
                ", airlineCode=" + airlineCode +
                ", departureDate=" + departureDate +
                ", departureTime=" + departureTime +
                ", terminal='" + terminal + '\'' +
                ", operatedBy='" + operatedBy + '\'' +
                ", flightStatus=" + flightStatus +
                '}';
    }
}
