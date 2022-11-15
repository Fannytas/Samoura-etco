package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, String clan, int argent ) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + " , si tu tiens � la vie donne moi ta bourse !");
		int argentVictime = victime.getArgent();
		argent += argentVictime ;
		victime.seFaireExtorquer();
		parler("J�ai piqu� les " + argentVictime + " sous de " + victime.getNom() + "ce qui me fait " + argent  + " sous dans ma poche! Niahahaha !");
	}
}
