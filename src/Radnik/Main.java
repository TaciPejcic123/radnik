package Radnik;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //tekst zadatka
        //napravite apstraktnu klasu radnik
        //napravite main klasu za ispis
        //sub klasu - radnik po danu, radnik po satu, radnik fiksno
        //polja - ime, prezime, jmbr,racun i plata
        //naprqavite metod isplati platu koji ce da ispisuje plate radnika i obracun za svakog radnika posebno
        //u main klasi napraviti i ispisati objekte za sve radnike

        Radnik radnikPoSatu = new RadnikPoSatu( "Pera", "Peric", "1810234195022", "ri123-456-74-32",10, 100 );
Radnik radnikPoDanu = new RadnikPoDanu( "Marko", "MAricic", "53453535022","1235345-45654-74-32",10, 30 );
Radnik radnikFiksno = new RadnikFiksno("Mile", "Mikic","3214241241241", "21312-3213-3213", 10000);

radnikPoDanu.isplatiPlatu();
radnikPoSatu.isplatiPlatu();
radnikFiksno.isplatiPlatu();
    }
}