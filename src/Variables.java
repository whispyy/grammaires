import java.util.ArrayList;
import java.util.List;


public class Variables {

	private List<Symbole> symboles;
	
	public Variables(){
		this.symboles = (new ArrayList<Symbole>());
	}

	public List<Symbole> getSymboles() {
		return symboles;
	}

	public void setSymboles(List<Symbole> symboles) {
		this.symboles = symboles;
	}
	
	public void addSymboles(Symbole s) {
		this.symboles.add(s);
	}

	public int getLength() {
		return this.symboles.size();
	}

	public Symbole get(int i) {
		return this.symboles.get(i);
	}

	public Symbole getFirst() {
		return this.symboles.get(0);
	}
	
	public void setFirst(Symbole s) {
		this.symboles.add(0, s);
	}
}
