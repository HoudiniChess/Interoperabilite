import org.junit.jupiter.api.Test;

class LoggerTest {

	@Test
	void test() {
		Bibliotheque bib = new Bibliotheque();
		String [] names = {"A", "B", "C" };
		for (String n : names) {
			bib.addLivre(new Livre(n));
			bib.addLivre(new LivreEnfant(n+n));
		}
		
		Logger log = new Logger();
		bib.accept(log);
	}

}
