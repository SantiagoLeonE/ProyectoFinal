package co.edu.uniquindio.proyectofinal.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {

    public LocalDateTime hora;

    public Mensaje(LocalDateTime hora) {
        this.hora = hora;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
