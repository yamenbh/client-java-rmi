package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import client.Machine;

public interface IMachineService  extends Remote{
	
    void ajouterMachine(Machine machine) throws RemoteException;
    void supprimerMachine(String refMachine) throws RemoteException;
    List<Machine> listerMachines() throws RemoteException;
	

}
