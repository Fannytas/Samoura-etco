package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boissonFavorite, String clan, int argent ) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + " , si tu tiens � la vie donne moi ta bourse !");
		int argentVictime = victime.getArgent();
		argent += argentVictime ;
		victime.seFaireExtorquer();
		parler("J�ai piqu� les " + argentVictime + " sous de " + victime.getNom() + "ce qui me fait " + argent  + " sous dans ma poche! Niahahaha !");
	}
	
	public int perdre() {
		parler("J�ai perdu mon duel et mes " + argent + "sous, snif... J'ai d�shonor� le clan de " + clan);
		reputation -=1;
		return argent = 0;
	}
	
	public int gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " +clan + " Je l'ai d�pouill� de ses " + gain + " pieces.");
		return argent += gain;
	}
}
