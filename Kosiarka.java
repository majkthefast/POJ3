package zadanie;

public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka,String nazwa,double pojemnoscSilnika,rodzajSilnika RodzajSilnika,
    boolean czyMelekser,boolean czyNaped, int liczbaOstrzy){
        super(marka,nazwa,pojemnoscSilnika,RodzajSilnika);
        this.czyMelekser=czyMelekser;
        this.czyNaped=czyNaped;
        this.liczbaOstrzy=liczbaOstrzy;
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }
    public boolean isCzyNaped() {
        return czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public String wyswietl() {
        return "Kosiarka{" +
                "marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", rodzajSilnika=" + RodzajSilnika +
                ", czyMelekser=" + czyMelekser +
                ", czyNaped=" + czyNaped +
                ", liczbaOstrzy=" + liczbaOstrzy +
                '}';
    }
}
