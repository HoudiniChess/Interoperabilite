import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bibliotheque {

	List<Livre> livres;
	
	public Bibliotheque() {
		livres = new ArrayList<Livre>();
	}
	
	void accept(Visiteur v) {
		v.visitBibliotheque(this);
	}
	
	void addLivre(Livre l) {
		livres.add(l);
	}
	Iterator<Livre> livresIterateur() {
		return livres.iterator();
	}
	
}
