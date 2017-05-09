public class Programme {

	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement

		// cr�ation des personnes
		Personne formateur = new Personne ("Siber", "Eric");
		Personne moi = new Personne ("Malinge", "Agn�s", 49);
		Refugie bob = new Refugie ("Dubois", "Robert", 35);
		Refugie toto = new Refugie ("Tho", "Tau", 22);
		
		// cr�ation des adresses
		Adresse adresse1 = new Adresse();
		adresse1.setNumVoie("12");
		adresse1.setNumVoie("rue Bleue");
		
		Adresse adresse2 = new Adresse("11", "Le Rateau", 44118, "La Chevroli�re");
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
		
		// test des modifs de nom-pr�nom
		formateur.setNom("Siber2");
		bob.setPrenom("Robert2");
		System.out.println("");
		
		// test des r�gularisations ok/ko
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
		
		// test des d�m�nagements (interdit pour r�fugi� non r�gularis�)
		System.out.println("");
		if (moi.demenager(adresse2b)) {
			System.out.println("d�m�nagement personne ok : " + moi);
		}
		else {
			System.out.println("d�m�nagement personne ko : " + moi);
		}
		
		System.out.println("");
		if (bob.demenager(adresse3b)) {
			System.out.println("d�m�nagement r�fugi� r�gularis� ok : " + bob);
		}
		else {
			System.out.println("d�m�nagement r�fugi� r�gularis� ko : " + bob);
		}

		System.out.println("");
		if (toto.demenager(adresse4b)) {
			System.out.println("d�m�nagement r�fugi� non r�gularis� ok : " + toto);
		}
		else {
			System.out.println("d�m�nagement r�fugi� non r�gularis� ko : " + toto);
		}

	}
}
