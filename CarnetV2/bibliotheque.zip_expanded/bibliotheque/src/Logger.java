import java.util.Iterator;

public class Logger extends Visiteur {

	public void visitBibliotheque(Bibliotheque bib) {
		System.out.println(bib);
		Iterator<Livre> itor = bib.livresIterateur();
		while (itor.hasNext()) {
			Livre curr  = itor.next();
			curr.accept(this);
		}
	}
	public void visitLivre(Livre livre) { 
		System.out.println("	" + livre);
	}
	public void visitLivreEnfant(LivreEnfant livre) {
		System.out.println("	" + livre);	
	}

}
