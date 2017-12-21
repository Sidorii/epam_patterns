package ua.training.subtask2;

public class Runner {

    public static void main(String[] args) {
        Tour tour = Tour.getBuilder()
                .setCountry("Israel")
                .setCity("Tel Aviv")
                .setDurationDay(10)
                .hasToAirportTransfer(true)
                .hasInsurance(true)
                .hasInternationalTransfer(true)
                .createTour();

        System.out.println(tour);
    }
}
