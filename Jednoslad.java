package zadanie;

public class Jednoslad extends Pojazd{

    private enum typ{
        miejski,
        turystyczny,
        sportowy,
        chopper,
        skuter
    }
    public typ Typ;

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika RodzajSilnika, double moc, double momentObrotowy, int nrPojazdu, typ Typ) {
        super(marka, nazwa, pojemnoscSilnika, RodzajSilnika, moc, momentObrotowy, nrPojazdu);
        this.Typ=Typ;
    }
    public Jednoslad(String marka, String nazwa,int nrPojazdu, typ Typ) {
        super(marka, nazwa, -1, RodzajSilnika.fizyczny, -1, -1,nrPojazdu);
        this.Typ = Typ;
        maxLiczbaPojazdow++;
        this.nrPojazdu=maxLiczbaPojazdow;
    }

    @Override
    public String wyswietl() {
        if (super.RodzajSilnika == RodzajSilnika.fizyczny) {
            //motor
            return "Jednoslad{" +
                    "typ=" + Typ +
                    ", marka='" + marka + '\'' +
                    ", nazwa='" + nazwa + '\'' +
                    ", Jednoslad " + nrPojazdu + " z "
                    + maxLiczbaPojazdow +
                    '}';
        } else {
            //rower i inne
            return "Jednoslad{" +
                    "typ=" + Typ +
                    ", marka='" + marka + '\'' +
                    ", nazwa='" + nazwa + '\'' +
                    ", pojemnoscSilnika=" + pojemnoscSilnika +
                    ", rodzajSilnika=" + RodzajSilnika +
                    ", moc=" + moc +
                    ", momentObrotowy=" + momentObrotowy +
                    ", Jednoslad " + nrPojazdu + " z "
                    + maxLiczbaPojazdow +
                    '}';
        }
    }
}
