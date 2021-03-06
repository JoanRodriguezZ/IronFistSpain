package com.renegade.ironfistspain;

public class Jugador {
    String UID;
    String nickname;
    String personajeMain;
    String personajeSecundario;
    Long puntuacion;
    String rol;
    String imagen;

    public Jugador(String UID, String nickname, String imagen, String personajeMain, String personajeSecundario, Long puntuacion, String rol) {
        this.UID = UID;
        this.nickname = nickname;
        this.imagen = imagen;
        this.personajeMain = personajeMain;
        this.personajeSecundario = personajeSecundario;
        this.puntuacion = puntuacion;
        this.rol = rol;
    }

    public Jugador(String nickname, Long puntuacion) {
        this.nickname = nickname;
        this.puntuacion = puntuacion;
    }

    public String getUID() {
        return UID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPersonajeMain() {
        return personajeMain;
    }

    public void setPersonajeMain(String personajeMain) {
        this.personajeMain = personajeMain;
    }

    public String getPersonajeSecundario() {
        return personajeSecundario;
    }

    public void setPersonajeSecundario(String personajeSecundario) {
        this.personajeSecundario = personajeSecundario;
    }

    public Long getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Long puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
