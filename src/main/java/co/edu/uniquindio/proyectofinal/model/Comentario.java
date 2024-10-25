package co.edu.uniquindio.proyectofinal.model;

import java.time.LocalDateTime;

public class Comentario {

    public LocalDateTime fechaEnvio;

    public Comentario(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
