package Model;

import java.util.ArrayList;
import java.util.List;

public class Autre {
	protected String label;
	protected List<String> valeur;
	
	public Autre (String label) {
		this.label = label;
		this.valeur = new ArrayList<>();
	}
	
	public Autre() {
		this("");
	}
	
	protected String toXmlStringV3()
	  {
	    return "\t<autre>\n" + "\t\t\t<label>" + this.label + "</label>\n" + "\t\t\t<valeur>" + this.valeur + "</valeur>\n"
	        + "\t\t</autre>\n";
	  }

	protected String toXmlStringV4()
	{
        StringBuilder st = new StringBuilder();
        
        st.append("\t<autre");
        st.append(" label=\"" + this.label + "\"");
        st.append(" valeur=\"" + this.valeur + "\"/>\n");
        
        return st.toString();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<String> getValeur() {
		return valeur;
	}

	public void setValeur(List<String> valeur) {
		this.valeur = valeur;
	}
	
	

}
