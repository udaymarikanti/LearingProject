package Attendence;

public class Days {


    Month jan;
       Month feb;

    Month mar;
    Month april;

    Month may;

    Month jun;

    Month july;

    Month aug;
    Month sept;

    Month oct;
    Month nove;

    Month dec;

    int overAll;


    public Days(Month jan, Month feb, Month mar, Month april, Month may, Month jun, Month july, Month aug, Month sept, Month oct, Month nove, Month dec) {
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
        this.april = april;
        this.may = may;
        this.jun = jun;
        this.july = july;
        this.aug = aug;
        this.sept = sept;
        this.oct = oct;
        this.nove = nove;
        this.dec = dec;
    }
    @Override
    public String toString() {
        return "Days{" +
                "jan=" + jan +
                ", feb=" + feb +
                ", mar=" + mar +
                ", april=" + april +
                ", may=" + may +
                ", jun=" + jun +
                ", july=" + july +
                ", aug=" + aug +
                ", sept=" + sept +
                ", oct=" + oct +
                ", nove=" + nove +
                ", dec=" + dec +
                ", overAll=" + overAll +
                '}';
    }
}


