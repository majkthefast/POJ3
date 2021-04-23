package zadanie;

public class Pojazd extends Maszyna{
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika RodzajSilnika,double moc,double momentObrotowy,int nrPojazdu) {
        super(marka, nazwa, pojemnoscSilnika, RodzajSilnika);
        this.moc=moc;
        this.momentObrotowy=momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu=maxLiczbaPojazdow;
    }
    public String wyswietl() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", rodzajSilnika=" + RodzajSilnika +
                ", moc=" + moc +
                ", momentObrotowy=" + momentObrotowy +
                ", Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow +
                '}';
    }

}
