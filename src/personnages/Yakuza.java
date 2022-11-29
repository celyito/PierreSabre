package personnages;
import personnages.Commerçant;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boisson, int argent , String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
		
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer (Commerçant commerçant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commerçant.getNom()+" , si tu tiens à la vie donne moi ta bourse !");
		int argentVole=commerçant.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J'ai piqué les "+argentVole+" sous de "+commerçant.getNom()+" , ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int preArgent=getArgent();
		perdreArgent(preArgent);
		parler("J'ai perdu mon duel et mes "+preArgent+" sous, snif... J'ai déshonoré le clan de Warsong."); 
		return preArgent;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+"? Je l'ai dépouillé de ses "+gain+" sous.");

	}
	
	
	

}
