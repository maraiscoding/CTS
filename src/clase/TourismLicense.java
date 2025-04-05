package clase;

public class TourismLicense implements AbstractTourismLicense {
    private static TourismLicense instance = null;
    private String licenseNumber;

    private TourismLicense() {
        // Constructor privat pentru a preveni instanțierea directă
    }

    public static synchronized TourismLicense getInstance() {
        if (instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException {
        if (licenseNumber!=null) {
            throw new LicenseAlreadySetException("License number can only be set once!");
        }
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String getLicenseNumber() {
        return this.licenseNumber;
    }
}
