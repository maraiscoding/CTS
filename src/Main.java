import clase.LicenseAlreadySetException;
import clase.TourismLicense;

public class Main{

    public static void main(String[] args) {
        // Creăm un Runnable pentru a testa Singleton pe mai multe threaduri
        Runnable task = () -> {
            try {
                TourismLicense license = TourismLicense.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + license.getLicenseNumber());

                // Încercăm să setăm licența pe threadul curent
                try {
                    license.setLicenseNumber("RO-123456");
                    System.out.println(Thread.currentThread().getName() + " - License number set to: " + license.getLicenseNumber());
                } catch (LicenseAlreadySetException e) {
                    System.out.println(Thread.currentThread().getName() + " - Exception: " + e.getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        // Creăm trei threaduri care vor apela task-ul de mai sus
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        // Pornim threadurile
        thread1.start();
        thread2.start();
        thread3.start();

        // Așteptăm ca toate threadurile să termine
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verificăm că toate instanțele sunt aceleași
        TourismLicense s1 = TourismLicense.getInstance();
        TourismLicense s2 = TourismLicense.getInstance();

        if (s1 == s2) {
            System.out.println("Instante identice");
        } else {
            System.out.println("Instantele nu sunt identice");
        }
    }
}
