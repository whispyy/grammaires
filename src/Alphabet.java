import java.util.ArrayList;
import java.util.List;


public class Alphabet {

	private List<Symbole> symboles;
	
	public Alphabet(){
		this.symboles = (new ArrayList<Symbole>());
	}

	public List<Symbole> getSymboles() {
		return symboles;
	}
	
	public void addSymbole(Symbole s){
		this.symboles.add(s);
	}
	
	public int Length(){
		return this.Length();
	}

	public Symbole get(int i) {
		return this.symboles.get(i);
	}
}
