public class Programme {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

		// création des personnes
		Personne formateur = new Personne ("Siber", "Eric");
		Personne moi = new Personne ("Malinge", "Agnès", 49);
		Refugie bob = new Refugie ("Dubois", "Robert", 35);
		Refugie toto = new Refugie ("Tho", "Tau", 22);
		
		// création des adresses
		Adresse adresse1 = new Adresse();
		adresse1.setNumVoie("12");
		adresse1.setNumVoie("rue Bleue");
		
		Adresse adresse2 = new Adresse("11", "Le Rateau", 44118, "La Chevrolière");
		Adresse adresse2b = new Adresse("12", "Le Rato", 44119, "La Che");
		
		Adresse adresse3 = new Adresse("10", "avenue de Vincennes", 75000, "Paris");
		Adresse adresse3b = new Adresse("20", "rue de Vincennes", 75010, "Pari");
		
		Adresse adresse4 = new Adresse("47", "rue de Nulle Part", 44000, "Nantes");
		Adresse adresse4b = new Adresse("48", "rue de Nulle Part Ailleurs", 44010, "Nante");

		// affectation des adresses + affichage
		formateur.setAdresse(adresse1);
		moi.setAdresse(adresse2);
		bob.setAdresse(adresse3);
		toto.setAdresse(adresse4);

		System.out.println(formateur);
		System.out.println(moi);
		System.out.println(bob);
		System.out.println(toto);
		System.out.println("");
		
		// test des modifs de nom-prénom
		formateur.setNom("Siber2");
		bob.setPrenom("Robert2");
		System.out.println("");
		
		// test des régularisations ok/ko
		if (bob.regulariser("pasbon")) {
			System.out.println("regul ok : " + bob);
		}
		else {
			System.out.println("regul ko : " + bob);
		}
		
		if (bob.regulariser("simplon")) {
			System.out.println("regul ok : " + bob);
		}
		else {
			System.out.println("regul ko : " + bob);
		}
		
		// test des déménagements (interdit pour réfugié non régularisé)
		System.out.println("");
		if (moi.demenager(adresse2b)) {
			System.out.println("déménagement personne ok : " + moi);
		}
		else {
			System.out.println("déménagement personne ko : " + moi);
		}
		
		System.out.println("");
		if (bob.demenager(adresse3b)) {
			System.out.println("déménagement réfugié régularisé ok : " + bob);
		}
		else {
			System.out.println("déménagement réfugié régularisé ko : " + bob);
		}

		System.out.println("");
		if (toto.demenager(adresse4b)) {
			System.out.println("déménagement réfugié non régularisé ok : " + toto);
		}
		else {
			System.out.println("déménagement réfugié non régularisé ko : " + toto);
		}

	}
}
