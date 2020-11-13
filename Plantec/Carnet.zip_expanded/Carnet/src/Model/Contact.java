package Model;

public class Contact {
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected int age;
	protected String numero;
	protected Autre autres;

	public Contact(String nom, String prenom, String adresse, int age, String numero, Autre autres) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		this.numero = numero;
		this.autres = autres;
	}
	
	public Contact(String nom, String prenom, String adresse, int age, String numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		this.numero = numero;
		this.autres = new Autre();
	}
	
	public Contact() {
		this("", "", "", 0, "");
	}
	
	public String toXmlStringV1()
	  {
	    return "\t<contact>\n" + "\t\t<nom>" + this.nom + "</nom>\n" + "\t\t<prenom>" + this.prenom + "</prenom>\n"
	        + "\t\t<adresse>" + this.adresse + "</adresse>\n" + "\t\t<age>" + this.age + "</age>\n" + "\t\t<numero>" 
	    		+ this.numero + "</numero>\n" + "\t" + this.autres.toXmlStringV3()  + "\t</contact>\n";
	  }

	  public String toXmlStringV2()
	  {
	        StringBuilder st = new StringBuilder();
	        
	        st.append("\t<contact");
	        st.append(" nom=\"" + this.nom + "\"");
	        st.append(" prenom=\"" + this.prenom + "\"");
	        st.append(" adresse=\"" + this.adresse + "\"");
	        st.append(" age=\"" + this.age + "\"");
	        st.append(" numero=\"" + this.numero + "\""+">" + "\n");
	        st.append("\t" + this.autres.toXmlStringV4());
	        st.append("\t</contact>\n");
	        
	        return st.toString();
	  }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Autre getAutres() {
		return autres;
	}

	public void setAutres(Autre autres) {
		this.autres = autres;
	}
	  
	  
}
