package personnages;

public class Commercant extends Humain{
	 private static String boissonFavorite = "thé";
	 
	 public Commercant(String nom, int argent) {
		 super(nom, boissonFavorite, argent);
	 }
	 
	 public int seFaireExtorquer() {
		 parler("J'ai tout perdu! Le monde est injuste...");
		 return  argent = 0;
	 }
	 
	 public void recevoir(int argentreçu) {
		 argent += argentreçu;
		 parler(argentreçu + " pièces ! Je te remercie généreux donateur!");
	 }
}
