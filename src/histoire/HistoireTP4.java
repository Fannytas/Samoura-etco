package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku", "whisky", "M�chant", 30);
		yaku.direBonjour();
		yaku.extorquer(marco);
		Ronin roro = new Ronin("roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
		roro.acheter("un sabre", 10);
		
	}

}
