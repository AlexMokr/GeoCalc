package maks.ter.geocalc.model;


public class DirectoryRegionsAndCities {

  private long codeNumber;
  private String region;
  private String fedDistrict;
  private String shortFedDistrict;
  private String city;


  public long getCodeNumber() {
    return codeNumber;
  }

  public void setCodeNumber(long codeNumber) {
    this.codeNumber = codeNumber;
  }


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public String getFedDistrict() {
    return fedDistrict;
  }

  public void setFedDistrict(String fedDistrict) {
    this.fedDistrict = fedDistrict;
  }


  public String getShortFedDistrict() {
    return shortFedDistrict;
  }

  public void setShortFedDistrict(String shortFedDistrict) {
    this.shortFedDistrict = shortFedDistrict;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

}
