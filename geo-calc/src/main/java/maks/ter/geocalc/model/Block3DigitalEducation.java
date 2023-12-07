package maks.ter.geocalc.model;


public class Block3DigitalEducation {

  private long codeNumber;
  private String educationLevel;
  private String program;
  private String studyField;
  private String region;
  private String city;
  private java.sql.Date studyDirect;
  private long minContract;
  private long budgetCount;
  private long contractCount;


  public long getCodeNumber() {
    return codeNumber;
  }

  public void setCodeNumber(long codeNumber) {
    this.codeNumber = codeNumber;
  }


  public String getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }


  public String getProgram() {
    return program;
  }

  public void setProgram(String program) {
    this.program = program;
  }


  public String getStudyField() {
    return studyField;
  }

  public void setStudyField(String studyField) {
    this.studyField = studyField;
  }


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public java.sql.Date getStudyDirect() {
    return studyDirect;
  }

  public void setStudyDirect(java.sql.Date studyDirect) {
    this.studyDirect = studyDirect;
  }


  public long getMinContract() {
    return minContract;
  }

  public void setMinContract(long minContract) {
    this.minContract = minContract;
  }


  public long getBudgetCount() {
    return budgetCount;
  }

  public void setBudgetCount(long budgetCount) {
    this.budgetCount = budgetCount;
  }


  public long getContractCount() {
    return contractCount;
  }

  public void setContractCount(long contractCount) {
    this.contractCount = contractCount;
  }

}
