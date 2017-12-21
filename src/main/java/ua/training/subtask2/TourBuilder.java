package ua.training.subtask2;

public interface TourBuilder {

    Tour createTour();

    TourBuilder setCountry(String country);

    TourBuilder setCity(String city) ;

    TourBuilder setHotelName(String hotelName) ;

    TourBuilder setDurationDay(int durationDay) ;

    TourBuilder hasToAirportTransfer(boolean hasAirportTransfer) ;

    TourBuilder hasInternationalTransfer(boolean hasInternationalTransfer);

    TourBuilder hasHotelReservation(boolean hasHotelReservation) ;

    TourBuilder hasInsurance(boolean hasInsurance);
}
