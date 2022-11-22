package personnages;

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
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l ?");
		parler(commerçant.getNom()+" , si tu tiens  la vie donne moi ta bourse !");
		int argentVole=commerçant.seFaireExtorquer();
		argent+=argentVole;
		parler("J'ai piqué les "+argentVole+" sous de "+commerçant.getNom()+" , ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int preArgent=argent;
		argent=0;
		parler("J'ai perdu mon duel et mes "+preArgent+" sous, snif... J'ai dshonoé le clan de Warsong."); 
		return preArgent;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+nom+" du clan de "+clan+"? Je l'ai dépouillé de ses "+gain+" sous.");

	}
	
	
	

}

