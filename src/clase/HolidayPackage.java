package clase;

public class HolidayPackage implements AbstractHolidayPackage {
    private final String transport;
    private final String cazare;
    private final String activitatiExtra;

    public HolidayPackage(String transport, String cazare, String activitatiExtra) {
        super();
        this.transport = transport;
        this.cazare = cazare;
        this.activitatiExtra = activitatiExtra;
    }

    @Override
    public String getTransport() {
        return transport;
    }

    @Override
    public String getActivitatiExtra() {
        return activitatiExtra;
    }

    @Override
    public String getCazare() {
        return cazare;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transport='" + transport + '\'' +
                ", cazare='" + cazare + '\'' +
                ", activitatiExtra='" + activitatiExtra + '\'' +
                '}';
    }
}
