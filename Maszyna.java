package zadanie;

public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;

    public Maszyna(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika) {
        this.marka=marka;
        this.nazwa=nazwa;
        this.pojemnoscSilnika=pojemnoscSilnika;
        this.RodzajSilnika=rodzajSilnika;
    }

    protected enum rodzajSilnika {
        diesel,
        benzynowy,
        lpg,
        hybrydowy,
        elektryczny,
        fizyczny;
    }
    protected rodzajSilnika RodzajSilnika;
}

    /*public String getMarka() {
        return marka;
    }
    public String getNazwa(){
        return nazwa;
    }
    public double getPojemnoscSilnika(){
        return pojemnoscSilnika;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
}*/