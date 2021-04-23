package zadanie;

public class Samochod extends Pojazd{
    public String VIN;

    public enum Segment{
        A,
        B,
        C,
        D,
        E,
        F,
        S,
        H,
        J;
    }
    protected Samochod.Segment segment;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika,rodzajSilnika RodzajSilnika, double moc, double momentObrotowy, int nrPojazdu, String VIN, Segment segment){
        super(marka,nazwa,pojemnoscSilnika,RodzajSilnika,moc,momentObrotowy,nrPojazdu);
        this.VIN=VIN;
        this.segment=segment;
        this.maxLiczbaPojazdow++;
        this.nrPojazdu=maxLiczbaPojazdow;
    }
    @Override
    public String wyswietl() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", rodzajSilnika=" + RodzajSilnika +
                ", moc=" + moc +
                ", momentObrotowy=" + momentObrotowy +
                ", segment=" + segment +
                ", VIN='" + VIN + '\'' + ", Samochod " +
                nrPojazdu + " z " + maxLiczbaPojazdow +
                '}';
    }

}
