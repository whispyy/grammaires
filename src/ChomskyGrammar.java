import java.util.ArrayList;
import java.util.List;


public class ChomskyGrammar extends Grammar{
	
	public ChomskyGrammar(){
		super();
	}
	
	public boolean accept(String mot){
		return analyseCYK(mot);
	}
	public boolean analyseCYK(String mot){
		SymboleTerminal a;
		ArrayList<Symbole> prod = new ArrayList<Symbole>();
		int n = mot.length();
		Cells[][] cellule = new Cells[n][n];
		for (int i = 1; i <= n; i++) {
			prod.clear(); 
			a = new SymboleTerminal(mot.charAt(i)); 
			prod.add(a);
			if (getP().contains(a)) 
				cellule[1][i].add(a);
		}
		for (int l = 2; l < n; l++) {
			for (int i = 1; i <= n - l + 1; i++) {
				for (int m = 1; m < l; m++) {
					for (Regle r : this.getP()) {
						SymboleNonTerminal X = r.getGauche();
						List<Symbole> nonTerms = r.getDroite();
						for (Symbole AB : nonTerms) {
							if (((Regle) getP()).getDroite().contains(nonTerms)
										&& cellule[m][i].contains(AB)
										&& cellule[l - m][i + m].contains(AB))
								cellule[l][i].add(X);
						}
					}
				}
			}
		}
		return (cellule[n][1].contains(this.getS()));
	}
	
}
