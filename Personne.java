
public class Personne {
	
	private String prenom;
	private String nom;
	private Integer age;
	private Adresse adresse;

	// constructeurs
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = null;
		this.adresse = null;
	}

	public Personne(String nom, String prenom, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = null;
	}

	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		String desc = prenom + " " + nom;
		
		if (age != null) {
			desc = desc + " " + age + " an(s)";
		}
		if (adresse != null) {
			desc = desc + adresse;
		}
		return desc;
	}

	// getteurs
	public String getNom() {
		return nom; 
	}
	
	public String getPrenom() {
		return prenom; 
	}

	public Integer getAge() {
		return age; 
	}
	
	public Adresse getAdresse() {
		return adresse; 
	}

	// setteurs (modif nom-prénom interdite)
	public void setNom(String nom) {
		if (this.nom == null) {
			this.nom = nom; 
		}
		else {
			System.out.println("--> Modification du nom " + this.nom + " par " + nom + " interdite");
		}
	}
	
	public void setPrenom(String prenom) {
		if (this.prenom == null) {
			this.prenom = prenom; 
		}
		else {
			System.out.println("--> Modification du prenom " + this.prenom + " par " + prenom + " interdite");
		}
	}
	
	public void setAge(Integer age) {
		this.age = age; 
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse; 
	}
	
	// déménagement
	public boolean demenager(Adresse adresse) {
		this.setAdresse(adresse);
		return true;
	}

}
