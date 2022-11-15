package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;
	private Humain[] memoire = new Humain[3];
	private int connaissance = 0;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println( nom + " - " + texte);
	}
	
	protected void gainArgent(int gain) {
		argent += gain;
	}
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void direBonjour() {
		parler( "Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
	}
	

	public void boire() {
		parler( "Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !"); ;
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			perdreArgent(prix);
			parler("J'ai acheté " + bien + " qui a couté " + prix + " pièces je suis ruiné il me reste " + argent + " pièces");
		}
		else {
			parler("Oh non je n'ai pas assez d'argent pour m'acheter " + bien +" qui coute " + prix + " pièces je n'ai que " + argent + " pièces");
		}
	}
	
	public void faireConnaissance(Humain rencontre) {
		direBonjour();
		rencontre.repondre(this);
		memoriser(rencontre);
		
	}
	
	private void memoriser(Humain humain) {
		if (connaissance <= 29) {
			memoire[connaissance] = humain;
			if (connaissance < 29) {
				connaissance += 1;
			}
		}
		else {
			for (int i = 0; i < 29; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[29] = humain;
			connaissance = 29;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String liste = "";
		for (int i = 0; i < connaissance; i++) {
			liste += memoire[i].getNom() + ",";
		}
		parler("Je connais beaucoup de monde dont : " + liste);
	}
}
	