package personnages;

public class Commercant extends Humain{
	 private static String boissonFavorite = "th�";
	 
	 public Commercant(String nom, int argent) {
		 super(nom, boissonFavorite, argent);
	 }
	 
	 public int seFaireExtorquer() {
		 parler("J'ai tout perdu! Le monde est injuste...");
		 return  argent = 0;
	 }
	 
	 public void recevoir(int argentre�u) {
		 argent += argentre�u;
		 parler(argentre�u + " pi�ces ! Je te remercie g�n�reux donateur!");
	 }
}
