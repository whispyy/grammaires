import java.util.ArrayList;
import java.util.List;


public class Regle {
	
	private Variables gauche;
	private List<Symbole> droite;
	
	public Regle(){
		this.gauche = new Variables();
		this.droite = new ArrayList<Symbole>();
	}
	
	public String toString(){
		return gauche+"->"+droite;
	}
	
	public void setGauche(SymboleNonTerminal s){
		this.gauche.setFirst(s);
	}
	
	public void setDroite(SymboleNonTerminal v1, SymboleNonTerminal v2){
		this.droite.add(0, v1);
		this.droite.add(0, v2);
	}
	
	public void setDroite(SymboleTerminal a){
		this.droite.add(0, a);
	}
	
	public SymboleNonTerminal getGauche(){
		return this.gauche.get(0);
	}
	public List<Symbole> getDroite(){
		return this.droite;
	}
}
