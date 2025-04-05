package clase;

public class HolidayPackage implements AbstractHolidayPackage {
    private String transport;
    private String accommodation;
    private String extraActivities;

    private HolidayPackage(HolidayPackageBuilder builder) {
        this.transport = builder.transport;
        this.accommodation = builder.accommodation;
        this.extraActivities = builder.extraActivities;
    }

    @Override
    public void showPackageDetails() {
        System.out.println("Holiday Package Details:");
        System.out.println("Transport: " + transport);
        System.out.println("Accommodation: " + accommodation);
        System.out.println("Extra Activities: " + extraActivities);
    }

    // Builder Class for Holiday Package
    public static class HolidayPackageBuilder {
        private String transport;
        private String accommodation;
        private String extraActivities;

        public HolidayPackageBuilder setTransport(String transport) {
            this.transport = transport;
            return this;
        }

        public HolidayPackageBuilder setAccommodation(String accommodation) {
            this.accommodation = accommodation;
            return this;
        }

        public HolidayPackageBuilder setExtraActivities(String extraActivities) {
            this.extraActivities = extraActivities;
            return this;
        }

        public HolidayPackage build() {
            return new HolidayPackage(this);
        }
    }
}
