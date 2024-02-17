package RapidoRegistation;

public class RapidoRegistationDetails {
    protected  String name;
    protected  String password;
    protected  String mobileNo;
    protected  String VechileType;

    public RapidoRegistationDetails(String name, String password, String mobileNo, String VechileType) {
        this.name = name;
        this.password = password;
        this.mobileNo = mobileNo;
       this. VechileType = VechileType;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getVechileType() {
        return VechileType;
    }
}
