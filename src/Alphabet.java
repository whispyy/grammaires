import java.util.ArrayList;
import java.util.List;


public class Alphabet {

	private List<SymboleTerminal> symboles;
	
	public Alphabet(){
		this.symboles = (new ArrayList<SymboleTerminal>());
	}

	public List<SymboleTerminal> getSymboles() {
		return symboles;
	}
	
	public void addSymbole(SymboleTerminal s){
		this.symboles.add(s);
	}
	
	public int Length(){
		return this.Length();
	}

	public Symbole get(int i) {
		return this.symboles.get(i);
	}
}
