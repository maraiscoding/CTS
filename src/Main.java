import clase.HolidayPackage;
import clase.HolidayPackageBuilder;
import clase.LicenseAlreadySetException;
import clase.TourismLicense;

public class Main {

    public static void main(String[] args) {
        System.out.println("1");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(TourismLicense.getInstance());
            }
        });
        thread.start();
        System.out.println(TourismLicense.getInstance());
        System.out.println(TourismLicense.getInstance());





        HolidayPackage package1 = new HolidayPackageBuilder()
                .setTransport("Avion")
                .setCazare("Hotel 5 stele")
                .setActivitatiExtra("Excursii de grup")
                .build();

        HolidayPackage package2 = new HolidayPackageBuilder()
                .setTransport("Autocar")
                .setCazare("Hotel 3 stele")
                .setActivitatiExtra("Vizite muzee")
                .build();

        // Afisăm detalii pachet turistic
        System.out.println(package1);
        System.out.println(package2);
    }
}
