package zadanie;

public abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;

    protected enum rodzajSilnika {
        diesel,
        benzynowy,
        lpg,
        hybrydowy,
        elektryczny;
    }
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