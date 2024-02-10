package ConstructorEx;

public class Adress {
    String city;
    String state;
    String country;
    String pinCode;

    public Adress(){
        city ="hyd";
        state = "TG";
        country = "india";
        pinCode= "500018";
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
