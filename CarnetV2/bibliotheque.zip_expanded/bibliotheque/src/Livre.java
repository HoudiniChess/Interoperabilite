
public class Livre {
	String nom;
	
	public Livre(String nom) {
		this.nom = nom;
	}
	void accept(Visiteur v) {
		v.visitLivre(this);
	}
}
