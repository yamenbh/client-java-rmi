package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import client.Salle;

public interface ISalleService extends Remote {

    void ajouterSalle(Salle salle) throws RemoteException;
    void supprimerSalle(String nomSalle) throws RemoteException;
    List<Salle> listerSalles() throws RemoteException;
}
