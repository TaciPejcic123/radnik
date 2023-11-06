package Radnik;

public abstract class Radnik {
    protected String ime,prezime,jmbg,ziroRacun;

    double plata;

    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;

    }
    public void isplatiPlatu(){
        System.out.println("Radnik: " + ime +" " + prezime + "sa jmbg: " + jmbg + "isplaceno je na racunn: " + ziroRacun + "iznos" + plata);
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}
