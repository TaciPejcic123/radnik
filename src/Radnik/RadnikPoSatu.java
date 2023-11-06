package Radnik;

public class RadnikPoSatu extends Radnik{

    private double cenaSata, brojSati;
    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double cenaSata, double brojSati) {
        super(ime, prezime, jmbg, ziroRacun);
        this.cenaSata = cenaSata;
        this.brojSati = brojSati;
    }
private double obracunajPlatu(){
        return cenaSata * brojSati;

}
    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
