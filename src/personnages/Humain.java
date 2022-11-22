package personnages;

public class Humain {
	
	protected String nom;
	protected String boisson;
	protected int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson=boisson;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	
	public void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
	public void direBonjour() {
		
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " +boisson+".");
		
	}
	
	public void boire() {
		
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
		
	}
	
	public void acheter (String bien, int prix) {
		
		if (prix<=argent) {
			parler("J'ai "+argent+" je vais pouvoir m'offrir "+bien+"  "+prix+" sous.");
			argent-=prix;
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+"  "+prix+" sous.");
		}
		
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	
	

}
