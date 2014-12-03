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
	
	public void setGauche(Symbole s){
		this.gauche.setFirst(s);
	}
	
	public void setDroite(Symbole v1, Symbole v2){
		this.droite.add(0, v1);
		this.droite.add(0, v2);
	}
	
	public void setDroite(Symbole a){
		this.droite.add(0, a);
	}
	
	public Symbole getDroiteFirst(){
		return this.droite.get(0);
	}
}
