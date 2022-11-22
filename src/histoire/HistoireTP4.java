package histoire;

public class HistoireTP4 {
	package histoire;

	import personnages.Humain;
	import personnages.Commerçant;
	import personnages.Yakuza;
	import personnages.Ronin;

	public class HistoireTP4 {
		
		public static void main(String[] args) {
			
			Humain prof = new Humain ("Prof","kombucha",54);
			
			/*prof.direBonjour();
			prof.acheter("une boisson", 12);
			prof.boire();
			prof.acheter("un jeu", 2);
			prof.acheter("un kimono", 50);*/
			
			Commerçant marco = new Commerçant ("Marco",20);
			
			/*marco.direBonjour();
			marco.seFaireExtorquer();
			marco.recevoir(15);
			marco.boire();*/
			
			Yakuza yaku = new Yakuza ("Yaku le noir","whisky",30,"Warsong");
			
			/*yaku.direBonjour();
			yaku.extorquer(marco);*/
			
			Ronin roro = new Ronin ("Roro","sochu",60);
			
			//roro.donner(marco);
			
			roro.provoquer(yaku);
			
			
		}
	}



