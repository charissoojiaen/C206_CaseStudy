
public class Parent {
	private String name;
    private int phoneNumber;
    private int regID;
    
    public Parent(String name, int phoneNumber, int regID) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.regID = regID;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

  public int getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
    }


    public int getRegID() {
    return regID;
  }

  public void setRegID(int regID) {
    this.regID = regID;
  }

}
