package personnages;
import personnages.Commerçant;

public class Ronin extends Humain {
	
	private int honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}
	
	public void donner(Commerçant beneficiaire) {
		int argent=getArgent();
		int benefice=getArgent()*10/100;
		parler(beneficiaire.getNom()+" prend ces 6 sous.");
		beneficiaire.recevoir(benefice);
		perdreArgent(argent);
	}
	
	public void provoquer (Yakuza adversaire) {
		int force=2*honneur;
		int argent=getArgent();
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza!");
			gagnerArgent(adversaire.perdre());
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			perdreArgent(argent);
			
		}
	}
	
	

}
