package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
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
	
	public void parler(String texte) {
		System.out.println( nom + " - " + texte);
	}
	
	public void gainArgent(int gain) {
		argent += gain;
	}
	public void perdreArgent(int perte) {
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
}
