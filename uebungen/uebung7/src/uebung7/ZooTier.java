package uebung7;

public abstract class ZooTier {

	private int id;
	protected String familie;
	protected String art;
	protected String futter;
	
	private static int counter = 1056;

	public ZooTier() {
		this.id = counter++;
	}
	
	@Override
	public String toString() {
		return "[ ID = " + id + ", Familie = " + familie + ", art = " + art + ", futter = " + futter + " ]";
	}
}
