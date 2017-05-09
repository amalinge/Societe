
public class Refugie extends Personne {

	private boolean regul;

	// constructeurs
	public Refugie(String nom, String prenom) {
		super(nom, prenom);
		this.regul = false;
	}

	public Refugie(String nom, String prenom, Integer age) {
		super(nom, prenom, age);
		this.regul = false;
	}

	public Refugie(String nom, String prenom, Integer age, boolean regul) {
		super(nom, prenom, age);
		this.regul = regul;
	}
	public Refugie(String nom, String prenom, boolean regul) {
		super(nom, prenom);
		this.regul = regul;
	}

	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		if (regul) {
			return super.toString() + ", régularisé";
		}
		else {
			return super.toString() + ", non régularisé";
		}
	}

	// getteur/setteur
	public boolean getRegul() {
		return regul; 
	}

	public void setRegul(boolean regul) {
		this.regul = regul;
	}
	
	// spécialisation de la méthode demenager de la classe Personne pour tester le cas des réfugiés non régularisés (déménagement interdit)
	public boolean demenager(Adresse adresse) {
		if ((this.regul) || (super.getAdresse() != null)) {
			return super.demenager(adresse);
		}
		else { 
			System.out.println("--> Déménagement interdit pour un réfugié non régularisé");
			return false;
		}
	}

	// régularisation (si mot de passe = simplon)
	public boolean regulariser(String motDePasse) {
		if (motDePasse.equals("simplon")) {
			regul = true;
			return regul;
		}
		else {
			return false;
		}
	}

}
 