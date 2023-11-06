package Radnik;

public class RadnikFiksno extends Radnik{

    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, double plata) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plata = plata;
    }
    private double obracunajPlatu(){
        return plata;

    }
    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
