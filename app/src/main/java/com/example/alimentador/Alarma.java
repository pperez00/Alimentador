package com.example.alimentador;


public class Alarma {
    private int hora, minutos, ampm;

    public Alarma(){

    }

    public Alarma(int h, int m, int ampm) {
        this.hora = h;
        this.minutos = m;
        this.ampm = ampm;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getAmpm() {
        return ampm;
    }

    public void setAmpm(int ampm) {
        this.ampm = ampm;
    }

    public String getAlarma(){
        return hora + " : " + minutos + " " + ampm;
    }
}
