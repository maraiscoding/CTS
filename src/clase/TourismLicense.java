package clase;

public class TourismLicense implements AbstractTourismLicense  {
  private static TourismLicense instance = null;
  private String licenseNumber;

  private TourismLicense() {
  }

  public static synchronized TourismLicense getInstance() {
      if(instance==null) {
          instance=new TourismLicense();
      }
      return instance;
  }

  @Override
    public void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException {
      if(this.licenseNumber!=null) {
          throw new LicenseAlreadySetException("License can only be set once!");
      }
      this.licenseNumber=licenseNumber;
  }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
