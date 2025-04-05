package clase;

public interface AbstractTourismLicense {
  void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException;
  String getLicenseNumber();
}
