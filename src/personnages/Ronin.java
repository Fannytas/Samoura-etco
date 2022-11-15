package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentdon = argent/ 10;
		parler(beneficiaire.getNom() + " prend ces " + argentdon + " sous");
		beneficiaire.recevoir(argentdon);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur*2 >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			honneur += 1;
			argent += adversaire.getArgent();
			adversaire.perdre();
		}
		else {
			honneur -= 1;
			adversaire.gagner(argent);
			argent = 0;
		}
	}
	
}
