package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "the",argent);
	}
	
	public int seFaireExtorquer() {
		
		int preArgent=getArgent();
		perdreArgent(preArgent);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		
		return preArgent;
		
	}
	
	public void recevoir (int monnaie) {
		gagnerArgent(monnaie);
		parler(monnaie+" sous ! Je te remercie généreux donateur!");
	}
	

	
	
}
