
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
		// TODO Stub de la m�thode g�n�r� automatiquement
		if (regul) {
			return super.toString() + ", r�gularis�";
		}
		else {
			return super.toString() + ", non r�gularis�";
		}
	}

	// getteur/setteur
	public boolean getRegul() {
		return regul; 
	}

	public void setRegul(boolean regul) {
		this.regul = regul;
	}
	
	// sp�cialisation de la m�thode demenager de la classe Personne pour tester le cas des r�fugi�s non r�gularis�s (d�m�nagement interdit)
	public boolean demenager(Adresse adresse) {
		if ((this.regul) || (super.getAdresse() != null)) {
			return super.demenager(adresse);
		}
		else { 
			System.out.println("--> D�m�nagement interdit pour un r�fugi� non r�gularis�");
			return false;
		}
	}

	// r�gularisation (si mot de passe = simplon)
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
 