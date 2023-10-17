package client;

public class Machine {

	private int id;
	private String ref;
	private String marque;
	private double prix;
	
	public Machine(int id, String ref, String marque, double prix) {
		super();
		this.id = id;
		this.ref = ref;
		this.marque = marque;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
