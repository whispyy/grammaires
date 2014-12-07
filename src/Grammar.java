import java.util.ArrayList;
import java.util.List;


public abstract class Grammar {

	private Alphabet sigma;
	private Variables V;
	private List<Regle> P;
	private SymboleNonTerminal S;
	
	public Grammar(){
		this.sigma = new Alphabet();
		this.V = new Variables();
		this.P = new ArrayList<Regle>();
		//on definit l'axiome comme étant la premiere variable
		this.setS(V.getFirst());
	}
	public abstract boolean accept(String mot);
	
	public boolean isReduite(){
		int n = 0;
		
		for(int i = 0; i < sigma.Length(); i++){
			for(int j = 0; j < P.size(); j++){
				if (sigma.get(i) == P.get(j).getDroite())
					n++;
			}
		}
		if (n == sigma.Length() - 1 )
				return true;
		else
			return false;
	}
	
	public SymboleNonTerminal getS() {
		return S;
	}
	public void setS(SymboleNonTerminal s) {
		S = s;
	}
	
	public List<Regle> getP() {
		return P;
	}
	

}
