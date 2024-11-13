package co.edu.uniquindio.proyectofinal.service;

public interface Subject {

    void registrarObserver(Observer observer);
    void eliminarObserver(Observer observer);
    void notificarObservers();
}
