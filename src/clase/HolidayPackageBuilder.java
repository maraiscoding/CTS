package clase;


public class HolidayPackageBuilder implements IBuilder  {
   private String transport;
   private String cazare;
   private String activitatiExtra;


    public HolidayPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public HolidayPackageBuilder setCazare(String cazare) {
        this.cazare=cazare;
        return this;
    }

    public HolidayPackageBuilder setActivitatiExtra(String activitatiExtra) {
        this.activitatiExtra=activitatiExtra;
        return this;
    }

    public HolidayPackage build() {
        return new HolidayPackage(transport, cazare, activitatiExtra);
    }
}
