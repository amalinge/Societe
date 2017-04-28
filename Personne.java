
public class Personne {
	
	private String prenom;
	private String nom;
	private int age;

	public Personne(String nomP, String prenomP) {
		super();
		this.nom = nomP;
		this.prenom = prenomP;
	}
	
	public Personne(String nomP, String prenomP, int ageP) {
		super();
		this.nom = nomP;
		this.prenom = prenomP;
		this.age = ageP;
	}

	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		if (age > 0) {
			return prenom + " " + nom + " " + age + " ans";
		}
		else {
			return prenom + " " + nom; 
		}
	}

}
