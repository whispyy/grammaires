import java.util.ArrayList;
import java.util.List;


public class Variables {

	private List<SymboleNonTerminal> symboles;
	
	public Variables(){
		this.symboles = (new ArrayList<SymboleNonTerminal>());
	}

	public List<SymboleNonTerminal> getSymboles() {
		return symboles;
	}

	public void setSymboles(List<SymboleNonTerminal> symboles) {
		this.symboles = symboles;
	}
	
	public void addSymboles(SymboleNonTerminal s) {
		this.symboles.add(s);
	}

	public int getLength() {
		return this.symboles.size();
	}

	public SymboleNonTerminal get(int i) {
		return this.symboles.get(i);
	}

	public SymboleNonTerminal getFirst() {
		return this.symboles.get(0);
	}
	
	public void setFirst(SymboleNonTerminal s) {
		this.symboles.add(0, s);
	}
}
