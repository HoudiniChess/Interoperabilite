
public class LivreEnfant extends Livre {

	public LivreEnfant(String nom) {
		super(nom);
	}

	void accept(Visiteur v) {
		v.visitLivreEnfant(this);
	}
}
