package com.epam.trainee.subtask2;

public class Tour {

    private String country;
    private String city;
    private String hotelName;
    private int durationDay;

    private boolean hasToAirportTransfer;
    private boolean hasInternationalTransfer;
    private boolean hasHotelReservation;
    private boolean hasInsurance;
    
    public static class ConcreteTourBuilder implements TourBuilder{

        /* every required field has own unique code. This way all codes in sum gives 7*/
        private byte SUCCESS_CODE = 7;
        private Tour newTour;
        private byte totalCode;

        private ConcreteTourBuilder() {
            newTour = new Tour();
            totalCode = 0;
        }

        public Tour createTour() {
            if (totalCode == SUCCESS_CODE) {
                return newTour;
            }else {
                throw new RuntimeException("Required fields hasn't filled. Status code: " + totalCode +
                        ", expected: " + SUCCESS_CODE);
            }
        }

        public TourBuilder setCountry(String country) {
            newTour.setCountry(country);
            totalCode += 1;
            return this;
        }

        public TourBuilder setCity(String city) {
            newTour.setCity(city);
            totalCode += 2;
            return this;
        }

        public TourBuilder setDurationDay(int durationDay) {
            newTour.setDurationDay(durationDay);
            totalCode += 4;
            return this;
        }

        public TourBuilder setHotelName(String hotelName) {
            newTour.setHotelName(hotelName);
            totalCode += 8;
            return this;
        }

        public TourBuilder hasToAirportTransfer(boolean hasAirportTransfer) {
            newTour.setHasToAirportTransfer(hasAirportTransfer);
            return this;
        }

        public TourBuilder hasInternationalTransfer(boolean hasInternationalTransfer) {
            newTour.setHasInternationalTransfer(hasInternationalTransfer);
            return this;
        }

        public TourBuilder hasHotelReservation(boolean hasHotelReservation) {
            newTour.setHasHotelReservation(hasHotelReservation);
            if (hasHotelReservation) {
                SUCCESS_CODE += 8;
            }
            return this;
        }

        public TourBuilder hasInsurance(boolean hasInsurance) {
            newTour.setHasInsurance(hasInsurance);
            return this;
        }
    }

    public static TourBuilder getBuilder() {
        return new ConcreteTourBuilder();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getDurationDay() {
        return durationDay;
    }

    public void setDurationDay(int durationDay) {
        this.durationDay = durationDay;
    }

    public boolean isHasToAirportTransfer() {
        return hasToAirportTransfer;
    }

    public void setHasToAirportTransfer(boolean hasToAirportTransfer) {
        this.hasToAirportTransfer = hasToAirportTransfer;
    }

    public boolean isHasInternationalTransfer() {
        return hasInternationalTransfer;
    }

    public void setHasInternationalTransfer(boolean hasInternationalTransfer) {
        this.hasInternationalTransfer = hasInternationalTransfer;
    }

    public boolean isHasHotelReservation() {
        return hasHotelReservation;
    }

    public void setHasHotelReservation(boolean hasHotelReservation) {
        this.hasHotelReservation = hasHotelReservation;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    @Override
    public String toString() {
        return "Tour [" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", durationDay=" + durationDay +
                ", hasToAirportTransfer=" + hasToAirportTransfer +
                ", hasInternationalTransfer=" + hasInternationalTransfer +
                ", hasHotelReservation=" + hasHotelReservation +
                ", hasInsurance=" + hasInsurance +
                ']';
    }
}
