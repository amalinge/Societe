
public class Adresse {

	private String numVoie;
	private String nomVoie;
	private int codePostal;
	private String ville;

	// constructeurs
	public Adresse() {
		super();
		this.numVoie = null;
		this.nomVoie = null;
		this.codePostal = 0;
		this.ville = null;
	}

	public Adresse(String numVoie, String nomVoie, int codePostal, String ville) {
		super();
		this.numVoie = numVoie;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	// getteurs
	public String getNumVoie() {
		return numVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	// setteurs
	public void setNumVoie(String numVoie) {
		this.numVoie = numVoie;
	}
	
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		String desc = ",";
		
		if (numVoie != null) {
			desc = desc + " " + numVoie;
		}
		if (nomVoie != null) {
			desc = desc + " " + nomVoie;
		}
		if (codePostal > 0) {
			desc = desc + " " + codePostal;
		}
		if (ville != null) {
			desc = desc + " " + ville;
		}
		return desc;
	}

}
