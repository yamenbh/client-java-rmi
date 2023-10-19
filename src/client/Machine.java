package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import service.IMachineService;

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
	
	public static void main(String[] args) {
        try {
            IMachineService machineService = (IMachineService) Naming.lookup("rmi://10.10.20.150:1099/imachineService");


            Machine newMachine = new Machine(1, "123", "msi", 1000.0);
            machineService.ajouterMachine(newMachine);
            System.out.println("Machine ajoutée avec succès.");


            String refMachineToDelete = "123";
            machineService.supprimerMachine(refMachineToDelete);
            System.out.println("Machine supprimée avec succès.");


            List<Machine> machines = machineService.listerMachines();
            for (Machine machine : machines) {
                System.out.println("ID: " + machine.getId() + ", Référence: " + machine.getRef() + ", Marque: " + machine.getMarque() + ", Prix: " + machine.getPrix());
            }
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

}
