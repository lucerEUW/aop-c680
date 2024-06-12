package uebung4;

public class Card {
	
	private String farbe;
	private String wert;
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getWert() {
		return wert;
	}
	public void setWert(String wert) {
		this.wert = wert;
	}
	
	@Override
	public String toString() {
		return "[" + this.farbe + " " + this.wert + "]";
	}
	
}
