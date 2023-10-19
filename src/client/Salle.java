package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import service.ISalleService;

public class Salle {
	
	private int id;
	private String code;
	
	public Salle(int id, String code) {
		super();
		this.id = id;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public static void main(String[] args) {
        try {
            ISalleService salleService = (ISalleService) Naming.lookup("rmi://10.10.20.150:1099/isalleService");

            Salle newSalle = new Salle(1, "Salle123");
            salleService.ajouterSalle(newSalle);
            System.out.println("Salle ajoutée avec succès.");

            String nomSalleToDelete = "Salle123";
            salleService.supprimerSalle(nomSalleToDelete);
            System.out.println("Salle supprimée avec succès.");

            List<Salle> salles = salleService.listerSalles();
            for (Salle salle : salles) {
                System.out.println("ID: " + salle.getId() + ", Code: " + salle.getCode());
            }
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
	
	
	

}
