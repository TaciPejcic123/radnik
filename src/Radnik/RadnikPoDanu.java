package Radnik;

public class RadnikPoDanu extends Radnik{
    private double cenaPoDanu, brojDana;
    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun,double cenaPoDanu, double brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.cenaPoDanu = cenaPoDanu;
        this.brojDana = brojDana;
    }
    private double obracunajPlatu(){
        return cenaPoDanu * brojDana;

    }
    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
